package section_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//https://rahulshettyacademy.com/dropdownsPractise/
public class Video_38 {
    // No need to watch again this video 38,39,40,41,42,43,44,47,48
    // Watch the video 45 and 46 again
    @Test
    void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("test");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("test");
        driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("test");
        driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
        //========================================================================================
        String str = "Please use temporary password 'rahulshettyacademy' to Login.";
        String newStr = str.split("'")[1].split("'")[0];
        System.out.println(newStr);
        driver.close();
    }
}
