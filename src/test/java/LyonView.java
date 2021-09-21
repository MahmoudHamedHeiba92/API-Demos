import org.testng.annotations.Test;

import javax.swing.text.View;
import java.net.MalformedURLException;

public class LyonView extends TestBase{


    ViewPage view;
    Animation animation;
    ThreeDTransition transition;
    Lyon lyon;



    @Test
    public void test_lyon_view() throws MalformedURLException {
        setUp();
        view = new ViewPage(driver);
        animation = new Animation(driver);
        transition = new ThreeDTransition(driver);
        lyon = new Lyon(driver);

        view.clickOnViewBtn();
        animation.clickOnAnimation();
        transition.clickOnTransition();
        lyon.clickOnLyon();
        teardown();

    }
}
