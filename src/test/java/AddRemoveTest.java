import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.AddElements;
import task.tasking.RemoveElements;
import task.validations.IsAddElement;
import task.validations.IsDeleteElement;

public class AddRemoveTest extends BaseTest {

    @Test
    public void addElementTest() {
        AddElements.as(webDriver);
        Assert.assertTrue(IsDeleteElement.visible(webDriver));
    }

    @Test
    public void removeElementTest() {
        RemoveElements.as(webDriver);
        Assert.assertTrue(IsAddElement.visible(webDriver));
        Assert.assertFalse(IsDeleteElement.visible(webDriver));
    }
}
