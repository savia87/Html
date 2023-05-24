package uitest.m4;

import helper.DemoHelper;
import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static helper.Pages.HOME;
public class ByCssTest {


    @Test


    public void byCssSelector() {
        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);
        var calender =  driver.findElement(By.cssSelector("input[type=date]"));
        calender.sendKeys("09/13/1987");
        DemoHelper.pause();


        var checkbox = driver.findElement(By.cssSelector("input[type=checkbox]"));
        checkbox.click();

        driver.quit();
    }



}
