package tests;

import Utilites.PropertyReader;
import Utilites.Retry;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Authorization extends BaseTest {

    @BeforeMethod
    @Test(description = "Авторизация", retryAnalyzer = Retry.class)
    @Description("Авторизация на сайте TESTRAIL")
    public void Authorization() {
        loginPage
                .openPage()
                .waitIsAuthorizationPageOpened()
                .inputEmail(System.getenv().getOrDefault("email", PropertyReader.getProperty("email")))
                .inputPassword(System.getenv().getOrDefault("password", PropertyReader.getProperty("password")))
                .clickLogInBitton()
                .waitIsDashboardPageOpened();
    }
}
