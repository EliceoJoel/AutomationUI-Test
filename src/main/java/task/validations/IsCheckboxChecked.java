package task.validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IsCheckboxChecked {
    public static String getCheckedValue(WebDriver webDriver, By locator) {
        WebElement element = webDriver.findElement(locator);
        return element.getAttribute("checked");
    }
}
