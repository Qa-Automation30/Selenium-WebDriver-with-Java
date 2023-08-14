package Section_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Video_87 {
    //video 87 and 88 can watch once
    // No need to watch 89
    @Test
    void test() throws InterruptedException {
        // Window Handles for two windows
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
        //now switch from parent to child window
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        String mailID = driver.findElement(By.xpath("//*[@id=\"interview-material-container\"]/div/div[2]/p[2]/strong/a")).getText();
        //now switch back to parent window from child window
        driver.switchTo().window(parentWindow);
        driver.findElement(By.id("username")).sendKeys(mailID);
        Thread.sleep(5000);
        driver.quit();
    }
}
