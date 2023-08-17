package Java_8_Streams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Test_4 {
    // Video 96 is imp form  "Java Lambda & Streams [Examples With Selenium WebDriver]"
    @Test
    void test(){
        /**
         * Problem Statement is here-->
         * 1) do not allow blank links
         * 2) do not allow links containing char "S"
         * 3) convert link text to Uppercase
         * 4) Print on the console
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.google.com/");
       List<WebElement> elements = driver.findElements(By.tagName("a"));
       // Using Streams to solve the problems-->
        elements.stream()
                .filter(e->e.getAttribute("href").contains("https://"))
                .filter(e->e.getText().length()>0)
                .filter(e->!e.getText().toLowerCase().contains("s"))
                .map(e->e.getText().toUpperCase()).forEach(e->System.out.println(e));
        driver.close();
    }
}
