package Section_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Video_90 {
    // video 90 and 91 are covered here, No need to watch again
    @Test
    void test() throws InterruptedException {
        // Handle Frames
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        // First you need to switch to frame to access all the webElements
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        // now you need to select the element which you want to drag
        WebElement draggableElement = driver.findElement(By.id("draggable"));
        //now you need to select the element on which you want to drop
        WebElement droppableElement = driver.findElement(By.id("droppable"));
        // use Actions Class
        Actions actions = new Actions(driver);
        //drag and drop
        actions.dragAndDrop(draggableElement,droppableElement).build().perform();
        Thread.sleep(5000);
        driver.quit();
    }
}
