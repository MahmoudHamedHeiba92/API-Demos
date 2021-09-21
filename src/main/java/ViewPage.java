import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ViewPage extends PageBase {

    public ViewPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }
        @AndroidFindBy(accessibility = "Views")
        MobileElement View;

    public void clickOnViewBtn(){
        click(View);
    }



}

