package Section_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Video_15 {
    @Test
    void test(){
        //Invoking Browser

//Chrome - ChromeDriver exten->Methods close get

//Firefox- FirefoxDriver ->methods close get

// WebDriver  close  get

//WebDriver methods + class methods

        // Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "/Users/rakesh/Documents/chromedriver");
        WebDriver driver = new ChromeDriver(options);

        //Firefox
        System.setProperty("webdriver.gecko.driver", "/Users/rakesh/Documents/geckodriver");
        WebDriver driver1 = new FirefoxDriver();
        //Microsoft Edge
        System.setProperty("webdriver.edge.driver", "/Users/rakesh/Documents/msedgedriver");
        WebDriver driver2 = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        //driver.quit();
    }
}
