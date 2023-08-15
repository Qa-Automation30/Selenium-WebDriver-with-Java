package Section_12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
// Can watch once 102 and 103
public class Video_102 {
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
        // get the sum of all amount in table.
        int totalAmount = getTheCountOfAmount();
        System.out.println(totalAmount);
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
    int getTheCountOfAmount(){
        int amount=0;
       List<WebElement> list= driver.findElements(By.xpath("//th[text()='Amount']/parent::tr/parent::thead/parent::table//tbody//tr//td[4]"));
       for(WebElement element:list){
          amount = amount + Integer.parseInt(element.getText());
       }
       return amount;
    }
}
