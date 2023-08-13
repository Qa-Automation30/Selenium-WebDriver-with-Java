package Section_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// No Need to watch video 51,53,55,56,58,59,60 again
// Need to watch video 52,54,57 again
public class Video_51 {
    @Test
    void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }
}
