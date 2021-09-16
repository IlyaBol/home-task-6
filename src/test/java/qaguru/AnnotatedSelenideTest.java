package qaguru;

import org.junit.jupiter.api.Test;

public class AnnotatedSelenideTest {

    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static Integer NUMBER_ISSUE = 68;

    @Test
    public void testGithub() {

        WebSteps steps = new WebSteps();
        steps.openPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.openIssueTab();
        steps.ShouldIssueWithNumber(NUMBER_ISSUE);

    }
}
