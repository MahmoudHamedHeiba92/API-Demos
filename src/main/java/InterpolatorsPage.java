import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class InterpolatorsPage extends PageBase {

    public InterpolatorsPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(accessibility = "Interpolators")
    MobileElement ClickInterpolators;


    public void clickOnInterpolators(){

        click(ClickInterpolators);
    }


}
