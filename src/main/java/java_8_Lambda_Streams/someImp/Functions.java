package java_8_Lambda_Streams.someImp;

import org.openqa.selenium.WebElement;

import java.util.function.Function;
import java.util.function.Predicate;

public class Functions {
    /**
     * 1st way to write this
     */
   public static Function<WebElement,String> getAttributeValues = e->e.getText();
    /**
     * 2nd way to write this as taking parameters
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * public static Function<WebElement, String> getAttributeValue(String attributeValue): This line declares a static method named getAttributeValue.
     * The method takes a single parameter of type String named attributeValue. It returns a Function that takes a WebElement as input and returns a String.
     *
     * return e -> e.getAttribute(attributeValue);: This is the body of the getAttributeValue method.
     * It's a lambda expression that creates and returns a Function instance.
     *
     * e -> e.getAttribute(attributeValue) is the lambda expression itself.
     * The e is the parameter name for the WebElement passed to the function.
     * e.getAttribute(attributeValue) is the implementation of the function.
     * It calls the getAttribute method on the provided WebElement and passes the attributeValue parameter to it.
     * The attributeValue parameter determines which attribute's value will be retrieved from the WebElement.
     */
    public static Function<WebElement,String> getAttributeValue(String attributeValue) {
       return e-> e.getAttribute(attributeValue);
    }
}
