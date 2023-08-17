package Java_8_Streams;

import Java_8_Streams.pages.TableDemoPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

/**
 * Video 107 very imp
 */
public class Test_7 {
    WebDriver driver;
    TableDemoPage tableDemoPage = new TableDemoPage();
    @BeforeMethod
    void setup(){
        driver = tableDemoPage.invokeBrowser();
    }
    @Test(dataProvider = "selectCheckBox")
    void testWithDataProvider(String gender) throws InterruptedException {
        tableDemoPage.selectRows(gender);
        Thread.sleep(4000);
    }
    @DataProvider(name="selectCheckBox")
    Object[][] selectCheckBox(){
        Object [][] data = new Object[2][1];
        data [0][0] = "male";
        data [1][0] = "female";
        return data;
    }
    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
/**
 *  First you need to run the code.
 *  Now you need to understand the problem that this code is not so generic...
 *  Means suppose in one go if I need to select both the genders then in that case it would not work, or we need to pass the parameters in method.
 *  so for all req we need to change our methods-->
 *  So in next we need to fix it.
 */
