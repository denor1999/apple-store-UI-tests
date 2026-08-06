package appleTests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Тесты навигации сайта Apple")
public class NavigationTests extends TestBase{

    @BeforeAll
    static void setUp(){
        Configuration.pageLoadStrategy = "eager";
    }

    @CsvSource(value = {
            "Store, https://www.apple.com/store",
            "Mac, https://www.apple.com/mac/",
            "iPad, https://www.apple.com/ipad/",
            "iPhone, https://www.apple.com/iphone/",
            "Watch, https://www.apple.com/watch/",
            "Vision, https://www.apple.com/apple-vision-pro/",
            "AirPods, https://www.apple.com/airpods/"
    })
    @ParameterizedTest(name = "Переход на страницу {0} должен иметь корректный url")
    @Tags({
            @Tag("WEB"),
            @Tag("SMOKE")
    })
    @DisplayName("Проверка url страницы продукта")
    void transitionToPageShouldHaveCorrectAddress(String nameDevice, String expectedUrl) {
        open("");
        $$("[class='globalnav-link-text-container']").asFixedIterable().stream()
                .filter(element -> element.text().equals(nameDevice)).findFirst().get().click();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertEquals(expectedUrl, currentUrl);
    }
}
