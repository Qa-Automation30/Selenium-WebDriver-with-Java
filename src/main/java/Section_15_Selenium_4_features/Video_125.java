package Section_15_Selenium_4_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Video_125 {
    // Invoking multiple windows / Tabs from Selenium using one driver instance
    // This feature is introduced from Selenium 4 onwards-->
    // Need to watch video 126 and 127 as well

    @Test
    // Must watch video
    void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.xpath("(//input[@name='name' and @type='text'])[1]"));
    }
}