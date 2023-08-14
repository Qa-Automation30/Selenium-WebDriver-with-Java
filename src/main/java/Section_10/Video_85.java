package Section_10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Video_85 {
    // No need to watch again video 85 and 86 just go through the code here
    @Test(enabled = false)
    void test(){
        // Mouse Hover Action
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        // Mouse Hover Action By Actions class
        Actions actions = new Actions(driver);
        // Only move to a specific element
        actions.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
       boolean b=  driver.findElement(By.xpath("//div[@id='nav-al-signin']//span")).isDisplayed();
       System.out.println(b);
       driver.close();
    }
    @Test(enabled = false)
    void test1() throws InterruptedException {
        // What we want-> we need to enter the text in CAPS via Actions class
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        // Mouse Hover Action By Actions class
        Actions actions = new Actions(driver);
        // we need to enter the text in CAPS via Actions class
        actions
                .moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")))
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("abc").build().perform();
        Thread.sleep(3000);
        driver.close();
    }
    @Test(enabled = false)
    void test2() throws InterruptedException {
        // What we want-> we need to perform double click
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        // Mouse Hover Action By Actions class
        Actions actions = new Actions(driver);
        // we need to enter the text in CAPS via Actions class
        actions
                .moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")))
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("abc").build().perform();
        //we need to perform double click
        actions.doubleClick().build().perform();
        Thread.sleep(3000);
        driver.close();
    }
    @Test
    void test3() throws InterruptedException {
        // What we want-> we need to perform right click
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        // Mouse Hover Action By Actions class
        Actions actions = new Actions(driver);
        // we need to enter the text in CAPS via Actions class
        actions
                .moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")))
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("abc").build().perform();
        //we need to perform right click
        actions.contextClick().build().perform();
        Thread.sleep(3000);
        driver.close();
    }
}
