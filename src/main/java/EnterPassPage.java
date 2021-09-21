import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EnterPassPage extends PageBase{
    public EnterPassPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    @AndroidFindBy(id = "pw")
    MobileElement PassWord;

    public void clickOnPassfeild(){
        click(PassWord);
    }

    public void EnterPass(String passWord){
        clear(PassWord);
        sendText(PassWord,passWord);
    }

    @AndroidFindBy(accessibility = "Login")
    MobileElement LoginBtn;
    public void clickLoginBtn(){
        click(LoginBtn);
    }

}
