package Section_13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Video_104 {
    // How to handle SSL Cert -->  Means how tp ByPass the SSL certificate
    //Can watch Once again
    // https://chromedriver.chromium.org/capabilities
    // Video 104 and 105 Need to watch again
    // No need to watch video 106, 107

    @Test
    void test(){
        /**
         * how tp ByPass the SSL certificate--->
         * ================================================
         * So there is a simple class "ChromeOptions" which is responsible for to set the behaviour of Chrome browser
         */
        ChromeOptions chromeOptions = new ChromeOptions();
        // "setAcceptInsecureCerts" -> This method do the same which is done by a human.
        chromeOptions.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://expired.badssl.com/");
    }
}
