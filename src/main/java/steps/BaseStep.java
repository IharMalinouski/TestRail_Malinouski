package steps;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;

@Log4j2
public class BaseStep {
    LoginPage loginPage;
    DashboardPage dashboardPage;


    public BaseStep(WebDriver driver) {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
    }
}
