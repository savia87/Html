package uitest.m4;

import helper.DemoHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationTest {


    private static final String PREFIX = "file:///" + System.getProperty("user.dir") + "\\src\\web\\";

    @Test
    public void basicNavigationTest() {
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get(PREFIX + "index.html");

        driver.get(PREFIX + "saving.html");


        DemoHelper.pause();
        driver.navigate().forward();

        DemoHelper.pause();
        driver.navigate().back();


        DemoHelper.pause();
        driver.navigate().refresh();

        driver.quit();
    }


}
