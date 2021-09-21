import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ShakePage extends PageBase{

    public ShakePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(accessibility = "Shake")
    MobileElement ShakeBtn;

    public void clickOnShake(){
        click(ShakeBtn);
    }
}
