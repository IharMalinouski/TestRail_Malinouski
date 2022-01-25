package tests;

import Utilites.Retry;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

@Log4j2
public class TestRailTests extends Authorization {

    @Test(description = "Создание новго проекта", retryAnalyzer = Retry.class)
    @Description("Создание новго проекта из Dashboard")
    public void createNewProject() {
        dashboardPage
                .openPageNewProject()
                .waitIsNewProjectPageOpened()
                .setNameProject("12313")
                .setAnnouncementOfProject("asdasd");
    }


}