package Section_15_Selenium_4_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/**
 *  You need to add this import by yourself
 */
import static org.openqa.selenium.support.locators.RelativeLocator.*;

// Video must watch again and again-> 122,123
public class Video_122 {
    // Selenium Relative Locators

    //https://rahulshettyacademy.com/angularpractice/

    @Test
    void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement textBox = driver.findElement(By.xpath("(//input[@name='name' and @type='text'])[1]"));
        // Now write actual relative locator
        String name = driver.findElement(with(By.tagName("label")).above(textBox)).getText();
        System.out.println(name);
        //=======================================================
        WebElement dob = driver.findElement(By.xpath("//label[@for='dateofBirth']"));
        driver.findElement(with(By.tagName("input")).below(dob)).click();
        Thread.sleep(4000);
        //=======================================================
        WebElement textLabel = driver.findElement(By.xpath("//label[@for='exampleCheck1']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(textLabel)).click();
        Thread.sleep(4000);
        driver.quit();
    }
}
