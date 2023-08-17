package Java_8_Streams;

import Java_8_Streams.pages.TableDemoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.function.Predicate;

/**
 * Video 112 is V V IMP
 */
public class Test_9 {
    WebDriver driver;
    TableDemoPage tableDemoPage = new TableDemoPage();
    //tdList->tdList.get(1).getText().equalsIgnoreCase(gender)


    @BeforeMethod
    void setup(){
        driver = tableDemoPage.invokeBrowser();
    }
    @Test(dataProvider = "searchCriteria")
    void testWithDataProvider(Predicate<List<WebElement>> searchCriteria) throws InterruptedException {
        tableDemoPage.selectRows_1(searchCriteria);
        Thread.sleep(4000);
    }
    @DataProvider(name="searchCriteria")
    Object[][] searchCriteria(){
        Predicate<List<WebElement>> usa = tdList->tdList.get(2).getText().equalsIgnoreCase("USA");
        Object [][] data = new Object[1][1];
        data [0][0] = usa;
        return data;
    }
    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
