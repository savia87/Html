package uitest.m4;

import helper.DemoHelper;
import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static helper.Pages.HOME;
public class ByLinkTest {

    @Test

    public void byLinkTest() {
        WebDriver driver = DriverFactory.newDriver();
        driver.get(HOME);

        DemoHelper.pause();


        WebElement savings = driver.findElement(By.linkText("Savings"));
        savings.click();


        DemoHelper.pause();

        WebElement  loans = driver.findElement(By.linkText("Loans"));
        loans.click();

        DemoHelper.pause();

        driver.quit();
    }
}
