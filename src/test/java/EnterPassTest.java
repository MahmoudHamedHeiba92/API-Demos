import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class EnterPassTest extends TestBase{


    ViewPage view;
    Animation animation;
    ShakePage shake;
    EnterPassPage enterPass;



    @Test
    public void test_Shake() throws MalformedURLException {
        setUp();
        view = new ViewPage(driver);
        animation = new Animation(driver);
        shake =new ShakePage(driver);
        enterPass = new EnterPassPage(driver);

        view.clickOnViewBtn();
        animation.clickOnAnimation();
        shake.clickOnShake();
        enterPass.clickOnPassfeild();
        enterPass.EnterPass("P@ssw0rd");
        enterPass.clickLoginBtn();



    }



}
