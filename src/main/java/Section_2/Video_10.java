package Section_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
// No need to watch Video-10,11,12,13,14,16,17,18
public class Video_10 {
    @Test
    void test(){
        // https://www.selenium.dev/blog/2022/selenium-4-6-0-released/
        /**
         * WebDriver  -> Interface here
         * ===================================================
         * Introducing Selenium Manager -->
         * So imp point is here now, "Selenium Manager" is introduced in this version 4.6.0 so- No Need To Setup Any .exe File ..
         * like previously we have to set up in System.setup(). OK
         * if you use <version>4.5.0</version> this for selenium then you have to set the path to the driver executable.
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
    }
}
