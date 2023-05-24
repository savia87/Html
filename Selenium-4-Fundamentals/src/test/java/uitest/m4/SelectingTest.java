package uitest.m4;

import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import static helper.Pages.SAVINGS;
public class SelectingTest {


    @Test

    public void selectTest() {


        WebDriver driver = DriverFactory.newDriver();
        driver.get(SAVINGS);

        WebElement deposit = driver.findElement(By.id("deposit"));
        deposit.sendKeys("100");

        WebElement period = driver.findElement(By.id("period"));
        Select select = new Select(period);
        select.selectByValue("6 months");
        select.selectByIndex(2);
        select.selectByVisibleText("1 Year");

        WebElement result = driver.findElement(By.id("result"));
        Assert.assertEquals(result.getText(),"After 1 Year you will earn $5.00 on your deposit");



        driver.quit();

    }
}
