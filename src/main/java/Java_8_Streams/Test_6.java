package Java_8_Streams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Test_6 {
    @Test
    void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // 1-> You need to just open the URL
        driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");
        //2 -> Select the checkbox as per the Gender
        List<WebElement> elements = driver.findElements(By.xpath("//td[contains(text(),'Female')]/following-sibling::td/input"));
        // using the Streams function to click on each and every element
        // 1st way to click on the checkbox
        elements.stream().forEach(WebElement::click);
        Thread.sleep(4000);
        driver.close();
    }
}
