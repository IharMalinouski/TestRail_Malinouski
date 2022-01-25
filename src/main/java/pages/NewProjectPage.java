package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewProjectPage extends BasePage {

    public static final By INPUT_NAME = By.id("name");
    public static final By ANNOUNCEMENT_NAME = By.id("announcement");
    public static final By ADD_PROJECT_BUTTON = By.id("accept");

    public NewProjectPage(WebDriver driver) {
        super(driver);
    }

    @Step("Ожидание загрузки элемента 'LOGIN_BUTTON'")
    public NewProjectPage waitIsNewProjectPageOpened() {
        waitForElementLocated(ADD_PROJECT_BUTTON, 20);
        return this;
    }

    @Step("Ввод 'name' в поле Name ")
    public NewProjectPage setNameProject(String name) {
        driver.findElement(INPUT_NAME).sendKeys(name);
        return this;
    }

    @Step("Ввод 'announcement' в поле Announcement")
    public NewProjectPage setAnnouncementOfProject(String Announcement) {
        driver.findElement(ANNOUNCEMENT_NAME).sendKeys(Announcement);
        return this;
    }

}
