package Java_8_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    WebDriver driver;
    PaymentPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="cc")
    public WebElement cc;
    @FindBy(id="year")
    public WebElement year;
    @FindBy(id="cvv")
    public WebElement cvv;
    @FindBy(id="buy")
    public WebElement buy;
    @FindBy(id="status")
    public WebElement status;

    public String verifyPurchase(String creditCard, String _yy, String _cvv){
        cc.sendKeys(creditCard);
        year.sendKeys(_yy);
        cvv.sendKeys(_cvv);
        buy.click();
       return status.getText();
    }
}
