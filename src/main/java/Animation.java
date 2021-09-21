import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Animation extends PageBase{
    public Animation(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(accessibility = "Animation")
    MobileElement clickAnimation ;

    public void clickOnAnimation() {
        click(clickAnimation);

    }


}
