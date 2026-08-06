package appleTests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    static void setUpSelenideConfiguration() {
        Configuration.browser="chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl="https://www.apple.com/";
    }

    @AfterEach
    void tearsDown() {
        closeWebDriver();
    }

}
