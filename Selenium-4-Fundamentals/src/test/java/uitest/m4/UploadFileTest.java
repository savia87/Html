package uitest.m4;

import helper.DemoHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static helper.Pages.LOANS;


public class UploadFileTest {

    public static void main(String[] args) throws IOException {
        uploadTest();
    }

    @Test
    public static void uploadTest() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get(LOANS);
        DemoHelper.pause();
        WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
        DemoHelper.pause();

        File file = new File("C:\\Users\\saviaahmed\\Documents\\example.txt");
        DemoHelper.pause();
        Path path = Files.createTempFile("file", ".txt");
        String fileName = path.toAbsolutePath().toString();
        System.out.println(fileName);
        DemoHelper.pause();

        fileInput.sendKeys(fileName);

        driver.quit();



    }
}
