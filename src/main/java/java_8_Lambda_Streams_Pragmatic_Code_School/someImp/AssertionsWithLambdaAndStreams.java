package java_8_Lambda_Streams_Pragmatic_Code_School.someImp;

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

public class AssertionsWithLambdaAndStreams {
    /**
     * How we can achieve multiple assertions for different elements via one function using streams and Lambada ?
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.udemy.com/");
        driver.manage().window().maximize();

        List<WebElement> elementsToAssert = driver.findElements(By.xpath("//h3[text()='Development']//parent::div[@class='trending-topics--category--3sEMw']//a"));

        // Define expected values for assertions
        List<String> expectedValues = Arrays.asList("Python", "Excel", "Web Development");
        Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));

      List<String> allValues = elementsToAssert.
              stream().limit(4).
              map(Functions.getAttributeValues).
              collect(Collectors.toList());
      System.out.println(allValues);

        Assert.assertEquals(expectedValues,elementsToAssert.stream().map(Functions.getAttributeValues).collect(Collectors.toList()));
        driver.quit();
    }

}
