package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log4j2
public class BasePage {

    public WebDriver driver;

    public static final String BASE_URL = "https://malinouski.testrail.io/index.php?/auth/login/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String url) {
        log.info("Opening URL: " + url);
        driver.get(url);
    }

    public void waitForElementLocated(By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        log.debug("Waiter timeout is: " + timeout + " for element: " + element);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}
