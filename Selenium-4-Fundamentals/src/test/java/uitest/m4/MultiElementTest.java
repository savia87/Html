package uitest.m4;

import helper.DemoHelper;
import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static helper.Pages.HOME;

public class MultiElementTest {

    @Test

    public void multiElementTest() {

        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);
        DemoHelper.pause();

        WebElement register = driver.findElement(By.id("register"));
        register.click();
        DemoHelper.pause();

        List<WebElement> feedback = driver.findElements(By.className("invalid-feedback"));
        DemoHelper.pause();

        print(feedback.get(0).getText());
        DemoHelper.pause();
        print(feedback.get(1).getText());
        DemoHelper.pause();
        print(feedback.get(2).getText());
        DemoHelper.pause();



        driver.quit();


    }

    private void print(String text) {

        System.out.println("Error Message:" + text);
    }
}
