package Java_8_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test_154 {
// From video 157 This is very very Imp
    @Test
    void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table-price.html");
        /**
         * Problem here is you need to select the minimum price checkbox
         */
       Optional<List<WebElement>> minRow = driver.findElements(By.xpath("//table[@id='prods']//tr")).
                stream().
                skip(1).
                map(tr->tr.findElements(By.tagName("td"))). // here you have list of all "tds"
                peek(tdList->System.out.println(tdList.get(2).getText())).
                min(Comparator.comparing(tdList-> Integer.parseInt(tdList.get(2).getText())));
               if(minRow.isPresent()){
                   List<WebElement> list = minRow.get();
                   list.get(3).findElement(By.tagName("input")).click();
               }
               Thread.sleep(3000);
               driver.findElement(By.id("result")).click();
        Thread.sleep(3000);
               System.out.println(driver.findElement(By.id("status")).getText());
        driver.close();
    }
}
