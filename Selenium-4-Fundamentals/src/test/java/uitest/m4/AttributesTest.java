package uitest.m4;

import helper.DemoHelper;
import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static helper.Pages.HOME;

public class AttributesTest {

    @Test

    public void isDisplayedTest() {

        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);

        WebElement register = driver.findElement(By.id("register"));
        register.click();

        WebElement error = driver.findElement(By.className("invalid-feedback"));
        DemoHelper.pause();

        Assert.assertEquals(error.getText(),"Valid first name is required");
        DemoHelper.pause();
    }
}
