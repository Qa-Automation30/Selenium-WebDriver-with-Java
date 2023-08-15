package Section_13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class Video_108 {
    // Can watch it again , as it shows how to take ScreenShot.
    // Video 109,110,111 we watch again and again
    WebDriver driver = new ChromeDriver();
    @Test
    void test() throws InterruptedException, IOException {
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       WebElement element = driver.findElement(By.id("gf-BIG"));
       // Now collecting all the anchor tags to check that how many of them are broken
       List<WebElement> links =  element.findElements(By.tagName("a"));
       for(WebElement ele : links){
           // get the URL one by one from the anchor tag here
          String href =  ele.getAttribute("href");
          // Now we need to use JAVA methods to validate that URL is broken or not
           HttpURLConnection connection = (HttpURLConnection)new URL(href).openConnection();
           connection.setRequestMethod("HEAD");
           connection.connect();
          int responseCode = connection.getResponseCode();
          if(responseCode>=400){
              System.out.println("This link is Broken--->"+href+" Response code is--->"+responseCode);
          }
       }
       driver.close();
    }
}
