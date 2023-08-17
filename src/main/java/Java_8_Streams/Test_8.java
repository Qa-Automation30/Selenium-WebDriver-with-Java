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
 * Video 109,110,111--> V V IMP
 */
public class Test_8 {
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
        Predicate<List<WebElement>> allMale = tdList->tdList.get(1).getText().equalsIgnoreCase("male");
        Predicate<List<WebElement>> allFemale = tdList->tdList.get(1).getText().equalsIgnoreCase("female");
        Predicate<List<WebElement>> allGender = allMale.or(allFemale);
        Object [][] data = new Object[3][1];
        data [0][0] = allMale;
        data [1][0] = allFemale;
        data [2][0] = allGender;
        return data;
    }
    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
