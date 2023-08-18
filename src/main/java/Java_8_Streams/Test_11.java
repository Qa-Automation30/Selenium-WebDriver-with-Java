package Java_8_Streams;

import Java_8_Streams.pages.LinkUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_11 {
    @Test
    void brokenLinkTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://the-internet.herokuapp.com/broken_images");
        driver.findElements(By.tagName("a"))
                .stream()
                .map(url->url.getAttribute("href"))
                .forEach(url->System.out.println(url+"----"+LinkUtil.getResponseCode(url)));
    }
}
