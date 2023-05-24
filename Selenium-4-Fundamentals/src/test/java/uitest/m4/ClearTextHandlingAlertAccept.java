package uitest.m4;

import helper.DemoHelper;
import helper.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static helper.Pages.HOME;

public class ClearTextHandlingAlertAccept {

    @Test
    public void clearTextHandlingAlertAccept() {

        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);

        WebElement first = driver.findElement(By.id ("firstName"));
        WebElement last = driver.findElement(By.id ("lastName"));
        WebElement clearBox = driver.findElement(By.id("clear"));

        first.sendKeys("Savia");
        DemoHelper.pause();
        last.sendKeys("Ahmed");
        DemoHelper.pause();
        clearBox.click();
        DemoHelper.pause();


        Alert alert = driver.switchTo().alert();
        alert.accept();

        Assert.assertEquals(first.getAttribute("value"), "");
        Assert.assertEquals(last.getAttribute("value"),"");


        driver.quit();
    }
}
