import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    public static AndroidDriver driver;

    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("automationNAme","UiAutomator2");
        caps.setCapability("platformVersion","11.0");
        caps.setCapability("deviceName","Android Emulator");
        caps.setCapability("app",System.getProperty("user.dir")+"/app/ApiDemos-debug.apk");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),caps);


}

    @AfterTest
    public void teardown(){
        if(null != driver){
            driver.quit();
        }
    }

}
