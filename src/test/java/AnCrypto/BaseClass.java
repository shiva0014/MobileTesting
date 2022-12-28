package AnCrypto;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {
public static AppiumDriver driver;
public static DesiredCapabilities cap;
public void openApp() throws MalformedURLException, InterruptedException {
    BaseClass bc = new BaseClass();
    cap = new DesiredCapabilities();
    cap.setCapability("automationName", "Appium");
    cap.setCapability("VERSION", "11.0");
    cap.setCapability("deviceName", "Android SDK built for x86");
//        cap.setCapability("deviceName", "moto e(7) plus");vivo Y15s
    cap.setCapability("platformName", "Android");
    cap.setCapability("adbExecTimeout", "80000");
    cap.setCapability("appPackage", "com.ancryptoWallet");
    cap.setCapability("appActivity", "com.ancrypto.MainActivity");
//        cap.setCapability("appPackage","com.evoeurope");
//        cap.setCapability("appActivity","com.coincult.MainActivity");
    cap.setCapability("autoGrantPermissions", "true");
    cap.setCapability("autoAcceptAlerts", "true");
    //cap.setCapability("udid", "ZF6525DH8Z");

    //URL url = new URL("http://0.0.0.0:4723/wd/hub");//"http://10.1.7.109:4723/wd/hub"  // pass url of appium server
    driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), cap);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    Thread.sleep(2000);
    System.out.println("application started");
    // END OF CODE
}
}
