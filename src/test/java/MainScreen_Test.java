import factory.MobileFactory;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.*;
import screens.MainScreen;

import java.net.MalformedURLException;

public class MainScreen_Test {

    private AndroidDriver driver;
    private MainScreen mainScreen;

    @BeforeEach
    public void setUp() throws MalformedURLException {
        driver = MobileFactory.getAndroidDriver();
        mainScreen = new MainScreen(driver);
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testBret(){
       mainScreen.click();
    }
}
