package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.CheckboxesPage;
import ui.FormAuthenticationPage;
import ui.HomePageUI;

public class Checkbox {
    public static void as(WebDriver webDriver, By locator) {
        Click.on(webDriver, HomePageUI.checkBoxes);
        Click.on(webDriver, locator);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Checkbox");
    }
}
