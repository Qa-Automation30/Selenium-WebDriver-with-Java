package java_8_Lambda_Streams.someImp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Arrays;
import java.util.function.Function;

public class Imp_1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");

        Function<WebElement,WebElement> function = text->driver.findElement(By.xpath("//a[text()='" + text + "']"));

        String[] elementTexts = {"Desktopss", "Laptops & Notebooks", "Components", "Tablets", "Software"};
                try{
                    Arrays.stream(elementTexts).peek(e->System.out.println(e)).map(text -> driver.findElement(By.xpath("//a[text()='" + text + "']")))
                            .forEach(element -> Assert.assertTrue(element.isDisplayed()));
                }
                catch (Exception e){
                    System.out.println("Please correct your elementTexts result array");
                }


        driver.quit();
    }
}
