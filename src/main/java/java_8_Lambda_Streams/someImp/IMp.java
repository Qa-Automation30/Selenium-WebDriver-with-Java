package java_8_Lambda_Streams.someImp;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IMp {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement e1= driver.findElement(By.xpath("//a[text()='Desktops']"));
        WebElement e2=  driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
        WebElement e3=  driver.findElement(By.xpath("//a[text()='Components']"));
        WebElement e4= driver.findElement(By.xpath("//a[text()='Tablets']"));
        WebElement e5 = driver.findElement(By.xpath("//a[text()='Software']"));
        System.out.println(e1.isDisplayed());
        System.out.println(e2.isDisplayed());
        System.out.println(e3.isDisplayed());
        System.out.println(e4.isDisplayed());
        System.out.println(e5.isDisplayed());

        Assert.assertEquals(e1.isDisplayed(),true);
        Assert.assertEquals(e2.isDisplayed(),true);
        Assert.assertEquals(e3.isDisplayed(),true);
        Assert.assertEquals(e4.isDisplayed(),true);
        Assert.assertEquals(e5.isDisplayed(),true);
        driver.quit();
    }
}
