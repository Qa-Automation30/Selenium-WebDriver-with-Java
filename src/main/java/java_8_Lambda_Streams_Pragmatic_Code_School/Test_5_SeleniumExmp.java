package java_8_Lambda_Streams_Pragmatic_Code_School;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test_5_SeleniumExmp {
    WebDriver driver;
    @BeforeMethod
    void setup(){
        driver  = new ChromeDriver();
        driver.get("https://www.toolsqa.com/");
        driver.manage().window().maximize();
    }
    @Test(enabled = false)
    void test_1(){
        /**
         * Let's consider a real-life example in Selenium automation using the Consumer interface.
         * Imagine you have a scenario where you want to perform a series of validation checks on different web elements,
         * such as checking if an element is visible, clickable, and contains specific text.
         * You can use the Consumer interface to define these validation actions and then apply them to various elements on a web page.
         */
        WebElement home = driver.findElement(By.xpath("//ul[@class='navbar__links d-none d-lg-flex']//a[normalize-space()='Home']"));
        WebElement seleniumTraining = driver.findElement(By.xpath("//a[@href='/selenium-training?q=headers']"));
        WebElement demoSite = driver.findElement(By.xpath("//ul[@class='navbar__links d-none d-lg-flex']//a[normalize-space()='Demo Site']"));
        WebElement about = driver.findElement(By.xpath("//ul[@class='navbar__links d-none d-lg-flex']//a[normalize-space()='About']"));

        Consumer<WebElement> validateElement = element -> {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertEquals(element.getText(),"Home");
            softAssert.assertTrue(element.isDisplayed());
            softAssert.assertTrue(element.isEnabled());
            softAssert.assertAll();
        };
        validateElement.accept(home);
        /**
         * In this example, the "validateElement" is a lambda expression that takes a "WebElement" as an argument and performs validation checks on it.
         * The checks include determining if the element is visible, enabled, and getText validation.
         */
    }
    @Test
    void test_2(){
        /**
         * Let's consider a real-life example in Selenium automation using the Consumer interface.
         * Imagine you have a scenario where you want to perform a series of validation checks on different web elements,
         * such as checking if an element is visible, clickable, and contains specific text.
         * You can use the Consumer interface to define these validation actions and then apply them to various elements on a web page.
         */
        WebElement home = driver.findElement(By.xpath("//ul[@class='navbar__links d-none d-lg-flex']//a[normalize-space()='Home']"));
        WebElement seleniumTraining = driver.findElement(By.xpath("//a[@href='/selenium-training?q=headers']"));
        WebElement demoSite = driver.findElement(By.xpath("//ul[@class='navbar__links d-none d-lg-flex']//a[normalize-space()='Demo Site']"));
        WebElement about = driver.findElement(By.xpath("//ul[@class='navbar__links d-none d-lg-flex']//a[normalize-space()='About']"));

        BiConsumer<WebElement,String> validateElement = (element,text) -> {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertEquals(element.getText(),text);
            softAssert.assertTrue(element.isDisplayed());
            softAssert.assertTrue(element.isEnabled());
            softAssert.assertAll();
        };
        validateElement.accept(home,"home");
        /**
         * In this example, the "validateElement" is a lambda expression that takes a "WebElement" as an argument and performs validation checks on it.
         * The checks include determining if the element is visible, enabled, and getText validation.
         */
    }

}
