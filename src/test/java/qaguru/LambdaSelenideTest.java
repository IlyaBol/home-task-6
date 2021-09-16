package qaguru;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class LambdaSelenideTest {

    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static Integer NUMBER_ISSUE = 68;

    @Test
    public void testGithub() {

        step("Открыть главную страницу", () -> {
        });
        open("https://github.com/");

        step("Найти репозиторий" + " " + REPOSITORY, () -> {
        });
        $(".header-search-input").setValue(REPOSITORY);
        $(".header-search-input").submit();

        step("Перейти в репозиторий" + " " + REPOSITORY, () -> {
        });
        $(linkText(REPOSITORY)).click();

        step("Открыть Issues", () -> {
        });
        $(partialLinkText("Issues")).click();

        step("Проверить Issues c номером" + " " + NUMBER_ISSUE, () -> {
        });
        $(withText("#" + NUMBER_ISSUE)).should(exist);

    }
}
