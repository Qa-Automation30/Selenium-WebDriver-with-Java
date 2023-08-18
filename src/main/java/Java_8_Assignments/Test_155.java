package Java_8_Assignments;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Test_155 {
    /**
     *Payment Details
     * Free Promocode : FREEUDEMY
     * Discount Promocode : PARTIALUDEMY
     * Valid CC : 4111111111111111
     * Valid Year : >2022
     * Valid CVV : 123
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * Test cases
     * Purchase should be successful using valid CC
     * Purchase should be successful using discounted promocode + valid CC
     * Purchase should be successful using FREE promocode
     * Purchase should fail using discounted promocode + invalid CC
     * Purchase should fail using invalid CC
     * Purchase should fail without any payment info
     */
    WebDriver driver;
     @BeforeTest
     void setup(){
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-payment-screen.html");
     }
    @Test
    @Description("Verify that purchase should be successful using valid CC")
    void TC1() throws InterruptedException {
         PaymentPage p = new PaymentPage(driver);
         String status = p.verifyPurchase("4111111111111111","2023","123");
         System.out.println(status);
    }
    @AfterTest
    void tearDown(){
        driver.close();
    }
}
