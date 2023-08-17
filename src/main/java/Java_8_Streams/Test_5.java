package Java_8_Streams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
// Video 101
public class Test_5 {
    @Test
    void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // 1-> You need to just open the URL
        driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");
        //2 -> Collect all the Checkboxes and then click on it one by one
       List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
       // using the Streams function to click on each and every element
        // 1st way to click on the checkbox
       elements.stream().forEach(e->e.click());
       // 2nd bestWay to click on checkbox
       elements.stream().forEach(WebElement::click);
       Thread.sleep(4000);
       driver.close();
    }
}
