package uitest.m4;

import helper.DemoHelper;
import helper.DriverFactory;
import static helper.Pages.HOME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TypingTest {

    @Test
    public void typingTest() {
        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);

        WebElement first = driver.findElement(By.id ("firstName"));
        WebElement last = driver.findElement(By.id ("lastName"));
        WebElement email = driver.findElement(By.id ("email"));
        WebElement dob = driver.findElement(By.id ("dob"));
        WebElement checkBox = driver.findElement(By.id("heard-about"));
        WebElement text = driver.findElement(By.id ("textarea"));
        WebElement register = driver.findElement(By.id("register"));

        first.sendKeys("Savia");
        DemoHelper.pause();
        last.sendKeys("Ahmed");
        DemoHelper.pause();
        email.sendKeys("saviah1778@gmail.com");
        DemoHelper.pause();
        dob.sendKeys("04/30/2018");
        DemoHelper.pause();
        checkBox.click();
        text.sendKeys("Demo section");
        DemoHelper.pause();
        register.click();
        DemoHelper.pause();

        driver.quit();


    }
}
