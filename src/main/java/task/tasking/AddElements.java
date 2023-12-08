package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.AddRemove;
import ui.HomePageUI;

public class AddElements {

    public static void as(WebDriver driver){
        Click.on(driver, HomePageUI.addRemove);
        Click.on(driver, AddRemove.add);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Add elements");
    }
}
