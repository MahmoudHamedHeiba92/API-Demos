import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.awt.*;

public class Lyon extends PageBase {
    public Lyon(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")
    MobileElement Lyon;

    @AndroidFindBy(className = "android.widget.ImageView")
    MobileElement Image;


    public void clickOnLyon() {
        click(Lyon);
    }


}
