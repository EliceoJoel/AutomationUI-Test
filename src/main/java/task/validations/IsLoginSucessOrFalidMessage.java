package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.FormAuthenticationPage;

public class IsLoginSucessOrFalidMessage {
    public static boolean visible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, FormAuthenticationPage.alertElement);
    }

    public static String getAlertText(WebDriver webDriver) {
        WebElement element = webDriver.findElement(FormAuthenticationPage.alertElement);
        return element.getText();
    }
}
