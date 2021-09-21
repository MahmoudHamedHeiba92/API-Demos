import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ClickOnDropDown extends PageBase {

    public ClickOnDropDown(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "spinner")
    MobileElement ClickOnDropDown;

    public void setClickOnDropDown(){
        click(ClickOnDropDown);
    }

}
