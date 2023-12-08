import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.validations.IsLoginSucessOrFalidMessage;

public class AuthenticationTest extends BaseTest {

    @Test
    public void authenticationSuccess() {
        Login.as(webDriver, "tomsmith", "SuperSecretPassword!");
        Assert.assertTrue(IsLoginSucessOrFalidMessage.visible(webDriver));
        Assert.assertTrue(IsLoginSucessOrFalidMessage.getAlertText(webDriver).contains("You logged into a secure area!"));
    }

    @Test
    public void  authenticationInvalidUsername() {
        Login.as(webDriver, "invalid", "SuperSecretPassword!");
        Assert.assertTrue(IsLoginSucessOrFalidMessage.visible(webDriver));
        Assert.assertTrue(IsLoginSucessOrFalidMessage.getAlertText(webDriver).contains("Your username is invalid!"));
    }

    @Test
    public void  authenticationInvalidPassword() {
        Login.as(webDriver, "tomsmith", "invalidPassword!");
        Assert.assertTrue(IsLoginSucessOrFalidMessage.visible(webDriver));
        Assert.assertTrue(IsLoginSucessOrFalidMessage.getAlertText(webDriver).contains("Your password is invalid!"));
    }

}
