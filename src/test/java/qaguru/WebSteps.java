package qaguru;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps {
    @Step("Открыть главную страницу")
    public void openPage() {
        open("https://github.com/");
    }

    @Step("Найти репозиторий {repository}")
    public void searchForRepository(String repository) {
        $(".header-search-input").setValue(repository);
        $(".header-search-input").submit();
    }

    @Step("Перейти в репозиторий {repository}")
    public void goToRepository(String repository) {
        $(linkText(repository)).click();
    }

    @Step("Открыть Issues")
    public void openIssueTab() {
        $(partialLinkText("Issues")).click();
    }

    @Step("Проверить Issues c номером {number}")
    public void ShouldIssueWithNumber(int number) {
        $(withText("#" + number)).should(exist);

    }
}



