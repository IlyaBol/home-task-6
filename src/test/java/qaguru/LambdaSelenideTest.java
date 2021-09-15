package qaguru;


import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class LambdaSelenideTest {

    @Test
    public void testGithub() {
        step("Открыть главную страницу", () -> {
        });
        open("https://github.com/");

        step("Найти репозиторий ", () -> {
        });
        $(".header-search-input").setValue("eroshenkoam/allure-example");
        $(".header-search-input").submit();

        step("Выбрать репозиторий", () -> {
        });
        $(linkText("eroshenkoam/allure-example")).click();

        step("Выбрать Issues", () -> {
        });
        $(partialLinkText("Issues")).click();

        step("Проверить Issues 68", () -> {
        });
        $(withText("#68")).should(exist);

    }
}
