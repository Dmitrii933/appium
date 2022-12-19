package factory;

import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MobileCapabilities {
    public static DesiredCapabilities getAndroidCapabilities(){
var cap = new DesiredCapabilities();

cap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554" );
cap.setPlatform(Platform.ANDROID);
cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\dbors\\Appium\\app_java_pro_v2-239809-796d84.apk");

return cap;
    }
}
