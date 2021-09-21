import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ThreeDTransition extends PageBase{
    public ThreeDTransition(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
    @AndroidFindBy(accessibility ="3D Transition")
    MobileElement ThreeDTransition;

    public void clickOnTransition(){
        click(ThreeDTransition);
    }
}
