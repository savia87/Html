package uitest.m4;

import helper.DemoHelper;
import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static helper.Pages.HOME;

public class DoubleClick {

    @Test

    public void clickTest() {

        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);

        WebElement checkBox = driver.findElement(By.id("heard-about"));
        Actions action = new Actions(driver);
        DemoHelper.pause();
        action.doubleClick(checkBox).perform();
        DemoHelper.pause();
        action.contextClick(checkBox).perform();
        DemoHelper.pause();
    }
}
