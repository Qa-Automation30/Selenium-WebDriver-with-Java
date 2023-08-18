package Java_8_Streams;

import Java_8_Streams.pages.LinkUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class Test_12 {
    @Test
    void brokenLinkTest(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://the-internet.herokuapp.com/broken_images");
       List<String> list = driver.findElements(By.tagName("a"))
                .stream()
                .map(url->url.getAttribute("href"))
                .filter(url->LinkUtil.getResponseCode(url)!=200)
                .collect(Collectors.toList());
        Assert.assertEquals(list.size(),0,list.toString());
    }
}
