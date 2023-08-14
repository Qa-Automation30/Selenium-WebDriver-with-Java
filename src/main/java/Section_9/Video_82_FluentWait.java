package Section_9;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class Video_82_FluentWait {
    // Must watch video 82,83,84

    @Test(enabled = false)
    void test(){
        /**
         * Fluent wait
         */
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        WebDriverWait _wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        _wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h4[text()='Hello World!']"))));
        String str = driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText();
        System.out.println(str);
        driver.quit();
    }

    @Test
    void test1(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Dynamic Loading")).click();
        driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement helloWorld = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                if(driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed())
                {
                    return driver.findElement(By.xpath("//h4[text()='Hello World!']"));
                }
                else return null;
            }
        });
       String str=  helloWorld.getText();
       System.out.println(str);
       driver.close();
    }
}
