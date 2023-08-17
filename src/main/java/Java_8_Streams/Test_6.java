package Java_8_Streams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
// Video 104,105 is most Important

/**
 * This section is very important
 */
public class Test_6 {
    @Test(enabled = false)
    void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // 1-> You need to just open the URL
        driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");
        //2 -> Select the checkbox as per the Gender
        List<WebElement> elements = driver.findElements(By.xpath("//td[contains(text(),'Female')]/following-sibling::td/input"));
        // using the Streams function to click on each and every element
        // 1st way to click on the checkbox
        elements.stream().forEach(WebElement::click);
        Thread.sleep(4000);
        driver.close();
    }
    @Test(enabled = false)
    void test1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // 1-> You need to just open the URL
        driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");
        //2 -> Select the checkbox as per the Gender
        List<WebElement> elements = driver.findElements(By.tagName("tr"));
        elements
                .stream()
                .skip(1)
                .map(tr->tr.findElements(By.tagName("td")))
                .filter(tdList->tdList.get(1).getText().equalsIgnoreCase("male"))
                .map(tdList->tdList.get(3))
                .map(tdList->tdList.findElement(By.tagName("input")))
                .forEach(WebElement::click);
        Thread.sleep(4000);
        driver.close();
    }

    /**
     * Video 106 --> Imp video
     * @param gender
     * @throws InterruptedException
     */
    @Test(dataProvider = "selectCheckBox")
    void testWithDataProvider(String gender) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // 1-> You need to just open the URL
        driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");
        //2 -> Select the checkbox as per the Gender
        List<WebElement> elements = driver.findElements(By.tagName("tr"));
        elements
                .stream()
                .skip(1)
                .map(tr->tr.findElements(By.tagName("td")))
                .filter(tdList->tdList.get(1).getText().equalsIgnoreCase(gender))
                .map(tdList->tdList.get(3))
                .map(tdList->tdList.findElement(By.tagName("input")))
                .forEach(WebElement::click);
        Thread.sleep(4000);
        driver.close();
    }
    @DataProvider(name="selectCheckBox")
    Object[][] selectCheckBox(){
        Object [][] data = new Object[2][1];
        data [0][0] = "male";
        data [1][0] = "female";
        return data;
    }
}
