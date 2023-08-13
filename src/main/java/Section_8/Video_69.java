package Section_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Video_69 {
    // No need to watch the video 69,70,75
    // Video 71 and 72, 73,74--> This is very Imp, Must watch again
    WebDriver driver = new ChromeDriver();
    String [] productList = {"Brocolli","Cauliflower","Cucumber"};
    @Test
    void test() throws InterruptedException {

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        List<WebElement> _list = driver.findElements(By.xpath("//h4[@class='product-name']"));
        addMultipleProductToCart(productList,_list);
        Thread.sleep(9000);
        driver.close();
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
