package appleTests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Feature("Тесты карточек сайта Apple")
public class CardsTests extends TestBase{

    @ValueSource(strings = {
            "Mac", "iPhone", "iPad", "Apple Watch", "Apple Vision Pro"
    })
    @ParameterizedTest(name = "Количество карточек {0} устройства не должно быть нулевым")
    @Tag("WEB")
    @DisplayName("Проверка отображаемости карточек устройств")
    @Owner("denor1999")
    void countOfProductCardsShouldBeNonZero(String device) {
        step("Open store page", () -> {
            open("/store");
        });
        step("Click on product card link", () -> {
            $$("[class='rf-productnav-card-title']").asFixedIterable().stream()
                    .filter(element -> element.text().equals(device)).findFirst().get().click();
        });
        step("Check count number product cards", () -> {
            $$("[class='rf-hcard-content tile as-util-relatedlink']")
                    .shouldBe(sizeGreaterThan(1));
        });
    }

    static Stream<Arguments> appleSiteShouldDisplayCorrectDeviceModels() {
        return Stream.of(
                Arguments.of("mac",
                        List.of("MacBook Neo", "MacBook Air", "MacBook Pro",
                                "iMac", "Mac mini", "Mac Studio", "Compare", "Help me Choose",
                                "Displays", "Accessories", "Shop Mac", "Golden Gate")),
                Arguments.of("ipad",
                        List.of("iPad Pro", "iPad Air", "iPad", "iPad mini", "Compare",
                                "Apple Pencil", "Keyboards", "Accessories", "iPadOS 27", "Shop iPad"))
        );
    }

    @MethodSource
    @ParameterizedTest(name = "Названия моделей {0}, прочих товаров и услуг должны отображаться корректно")
    @Tag("WEB")
    @DisplayName("Проверка корректности названий устройтсв в карточках")
    @Owner("denor1999")
    void appleSiteShouldDisplayCorrectDeviceModels(String name, List<String> models) {
        step("Open {name} page", () -> {
            open(name);
        });
        step("Card text should have {models}", () -> {
            $$("[class='ChapterNav_chapternav-item__T1cQC']").shouldHave(texts(models));
        });
    }

}
