package Section_12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.plaf.TableHeaderUI;

public class Video_101 {
    // Need to watch again video 101
    // How to handle Scrolling on webPages
    WebDriver driver = new ChromeDriver();
    @Test
    void test() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        // So here it will work because we are working in non-headless mode, so it will identify the element.
        scrollDown();
        Thread.sleep(3000);
        String amount = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
        System.out.println(amount);
        // Now I want to scrollDown inside the table only
        driver.findElement(By.xpath("//div[@class='tableFixHead']")).click();
        Thread.sleep(4000);
        // Scroll Inside the table
        scrollInsideAnElement();
        Thread.sleep(4000);
        driver.close();
    }
    void scrollDown(){
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
    }
    void scrollInsideAnElement(){
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
    }
}
