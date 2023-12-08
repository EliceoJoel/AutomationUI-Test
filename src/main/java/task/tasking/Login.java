package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.FormAuthenticationPage;
import ui.HomePageUI;

public class Login {
    public static void as(WebDriver webDriver, String username, String password) {
        Click.on(webDriver, HomePageUI.formAuthentication);
        Enter.text(webDriver, FormAuthenticationPage.username, username);
        Enter.text(webDriver, FormAuthenticationPage.password, password);
        Click.on(webDriver, FormAuthenticationPage.loginButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Login");
    }
}
