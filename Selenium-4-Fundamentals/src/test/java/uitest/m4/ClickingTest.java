package uitest.m4;

import helper.DemoHelper;
import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static helper.Pages.HOME;


public class ClickingTest {


    @Test

    public void clickTest() {

    WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);

        WebElement first = driver.findElement(By.id ("firstName"));
        WebElement last = driver.findElement(By.id ("lastName"));
        WebElement email = driver.findElement(By.id ("email"));
        WebElement dob = driver.findElement(By.id ("dob"));
        WebElement checkBox = driver.findElement(By.id("heard-about"));
        WebElement text = driver.findElement(By.id ("textarea"));
        WebElement register = driver.findElement(By.id("register"));
        DemoHelper.pause();

        checkBox.click();
        DemoHelper.pause();
        register.click();
        DemoHelper.pause();

        driver.quit();
   }

}
