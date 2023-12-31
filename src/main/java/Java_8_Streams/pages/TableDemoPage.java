package Java_8_Streams.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.function.Predicate;

public class TableDemoPage {
    private WebDriver driver;

    public WebDriver invokeBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");
        return driver;
    }
    public void selectRows(String gender){
        List<WebElement> elements = driver.findElements(By.tagName("tr"));
        elements
                .stream()
                .skip(1)
                .map(tr->tr.findElements(By.tagName("td")))
                .filter(tdList->tdList.get(1).getText().equalsIgnoreCase(gender))
                .map(tdList->tdList.get(3))
                .map(tdList->tdList.findElement(By.tagName("input")))
                .forEach(WebElement::click);
    }
    public void selectRows_1(Predicate<List<WebElement>> predicate){
        List<WebElement> elements = driver.findElements(By.tagName("tr"));
        elements
                .stream()
                .skip(1)
                .map(tr->tr.findElements(By.tagName("td")))
                .filter(predicate)
                .map(tdList->tdList.get(3))
                .map(tdList->tdList.findElement(By.tagName("input")))
                .forEach(WebElement::click);

    }
}
