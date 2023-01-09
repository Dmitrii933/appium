package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MainScreen {
    private AndroidDriver androidDriver;
    private final static String BRET = "Bret Leanne Graham Sincere@april.biz hildegard.org";

    public MainScreen(AndroidDriver androidDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver, Duration.ofSeconds(10)), this);
        this.androidDriver = androidDriver;
    }

  @AndroidFindBy (id = BRET)
    private AndroidElement androidElement;


public MainScreen click(){
    androidElement.click();
    try{
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    return this;
}
}
