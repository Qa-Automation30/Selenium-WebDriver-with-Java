package Section_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Video_76 {
    // No need to watch the video 76,77
    // video 78 and 79 are Very Imp
    WebDriver driver = new ChromeDriver();
    String [] productList = {"Brocolli","Cauliflower","Cucumber"};
    WebDriverWait _wait;
    @Test
    void test() throws InterruptedException {
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        List<WebElement> _list = driver.findElements(By.xpath("//h4[@class='product-name']"));
        addMultipleProductToCart(productList,_list);
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
       // driver.findElement(By.className("promoCode")).sendKeys("test");
        explicitWaitVisibilityOf(driver,20,driver.findElement(By.xpath("//input[@class='promoCode']")));
        driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("Promo");
        driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
        driver.close();
    }
    void explicitWaitVisibilityOf(WebDriver driver, int time, WebElement element){
        _wait  = new WebDriverWait(driver,Duration.ofSeconds(time));
        _wait.until(ExpectedConditions.visibilityOf(element));
    }

    WebElement addSingleProductToCart(String _productName){
        return driver.findElement(By.xpath("//h4[contains(text(),'"+_productName+"')]/parent::div//div/button"));
    }
    void addMultipleProductToCart(String [] productList,List<WebElement> list){
        for(String product : productList){
            System.out.println("Product you want to select->"+product);
            for(WebElement element:list){
                if(element.getText().split("-")[0].trim().contains(product)){
                    System.out.println("product selected ->"+element.getText().split("-")[0].trim());
                    driver.findElement(By.xpath("//h4[contains(text(),'"+product+"')]/parent::div//div/button")).click();
                    break;
                }
            }
        }
    }
}
