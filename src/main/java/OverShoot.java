import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OverShoot extends PageBase{
    public OverShoot(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(className = "android.widget.CheckedTextView")
    MobileElement ChooseOvershoot;

    public void Choose_Overshoot(){
        click(ChooseOvershoot);
    }
}
