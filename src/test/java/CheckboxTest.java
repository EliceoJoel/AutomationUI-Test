import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Checkbox;
import task.tasking.Login;
import task.validations.IsCheckboxChecked;
import task.validations.IsLoginSucessOrFalidMessage;
import ui.CheckboxesPage;

public class CheckboxTest extends BaseTest {
    @Test
    public void CheckboxChecked() {
        Checkbox.as(webDriver, CheckboxesPage.checkbox1);
        Assert.assertEquals(IsCheckboxChecked.getCheckedValue(webDriver, CheckboxesPage.checkbox1), "true");
    }

    @Test
    public void CheckboxUnchecked() {
        Checkbox.as(webDriver, CheckboxesPage.checkbox2);
        Assert.assertNull(IsCheckboxChecked.getCheckedValue(webDriver, CheckboxesPage.checkbox2));
    }
}
