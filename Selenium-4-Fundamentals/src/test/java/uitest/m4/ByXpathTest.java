package uitest.m4;

import helper.DemoHelper;
import helper.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static helper.Pages.HOME;
import static helper.Pages.SAVINGS;

public class ByXpathTest {

    @Test

    public void byXpathTest() {

        WebDriver driver = DriverFactory.newDriver();
        driver.get(SAVINGS);

        WebElement cell_1 =  driver.findElement(By.xpath("//*[@id=\"rates\"]/tbody/tr[1]/td[2]"));
        System.out.println("1st cell : " + cell_1.getText());
        DemoHelper.pause();

        WebElement cell_2 =  driver.findElement(By.xpath("//*[@id=\"rates\"]/thead/tr/td[3]"));
        System.out.println("2nd cell : " + cell_2.getText());
        DemoHelper.pause();

        WebElement cell_3 =  driver.findElement(By.xpath("//*[@id=\"rates\"]/thead/tr/td[4]"));
        System.out.println("3rd cell : " + cell_3.getText());
        DemoHelper.pause();

    }
}
