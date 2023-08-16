package Section_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Video_116 {
    // how to check that a table is Sorted or not.
    @Test
    void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://kitchen.applitools.com/ingredients/table");
        // First you need to Sort your list via application and take all the elements in list of webElements
        Thread.sleep(3000);
        driver.findElement(By.id("column-button-name")).click();
        System.out.println("Clicked");
        Thread.sleep(3000);
        List<WebElement> list = driver.findElements(By.xpath("//tbody//tr/td[1]"));
        // now from above list of webElements, need to extract the text from the elements
        List<String> originalList = list.stream().map(s -> s.getText()).collect(Collectors.toList());
        // Now what you need to do, you need to again sort the list which you got from the above.
        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
        // Now you need to compare two List
        Assert.assertTrue(originalList.equals(sortedList));
    }
}
