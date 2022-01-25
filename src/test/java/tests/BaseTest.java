package tests;

import Utilites.TestListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import pages.DashboardPage;
import pages.LoginPage;
import pages.NewProjectPage;
import steps.DashboardStep;
import steps.LoginStep;

@Log4j2
@Listeners(TestListener.class)
public class BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    LoginStep loginStep;
    DashboardPage dashboardPage;
    DashboardStep dashboardStep;
    NewProjectPage newProjectPage;


    @BeforeClass
    public void initTest(ITestContext context) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        log.debug("Browser is started in fullscreen mode.");
        driver.manage().window().maximize();
        String driverVariable = "driver";
        context.setAttribute(driverVariable, driver);
        loginPage = new LoginPage(driver);
        loginStep = new LoginStep(driver);
        dashboardPage = new DashboardPage(driver);
        dashboardStep = new DashboardStep(driver);
        newProjectPage = new NewProjectPage(driver);
    }

    @AfterClass
    public void close() {
        log.info("Close browser");
        if (driver != null) {
            driver.quit();
        }
    }
}
