import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SetAnAnimation extends TestBase {

    ViewPage view;
    Animation animation;
    InterpolatorsPage interpolators;
    ClickOnDropDown DropDown;
    OverShoot OverShoot;


    @Test

    public void test_set_an_animation() throws MalformedURLException {
        setUp();
        view = new ViewPage(driver);
        animation = new Animation(driver);
        interpolators = new InterpolatorsPage(driver);
        OverShoot = new OverShoot(driver);

        view.clickOnViewBtn();
        animation.clickOnAnimation();
        interpolators.clickOnInterpolators();
        DropDown.setClickOnDropDown();
        OverShoot.Choose_Overshoot();





    }


}
