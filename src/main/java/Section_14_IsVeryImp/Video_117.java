package Section_14_IsVeryImp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;
// This section is very imp
// video 117,118,120 is Most imp section, need to watch again and again
public class Video_117 {
    WebDriver driver = new ChromeDriver();
    @Test
    void test(){

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        List<WebElement> allFruitNames = driver.findElements(By.xpath("//tr/td[1]"));
        // //td[text()='Rice']/following-sibling::td[1]
        allFruitNames.stream().
                filter(s->s.getText().contains("Rice")).
              /*  map(s->s.getPriceOfVeggie()).*/
                collect(Collectors.toList());
    }
  /*  public Object getPriceOfVeggie(WebElement element){
        driver.findElement()

    }*/
}
