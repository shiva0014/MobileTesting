package test;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class test {
    AppiumDriver driver;
    DesiredCapabilities cap;
    @Test
    void OpenApp() throws InterruptedException, MalformedURLException {
        cap = new DesiredCapabilities();
        cap.setCapability("automationName","Appium");

        System.out.println("---"+"1");
        cap.setCapability("VERSION","12.0");
        System.out.println("---"+"2");
        cap.setCapability("deviceName","Android SDK build for x86");
        System.out.println("---"+"3");
        cap.setCapability("platformName","Android");
        System.out.println("---"+"4");
        cap.setCapability("adbExecTimeout","80000");
        System.out.println("---"+"5");
        cap.setCapability("appPackage","com.ancryptoWallet");
        System.out.println("---"+"6");
        cap.setCapability("appActivity","com.ancrypto.MainActivity");
        System.out.println("---"+"7");
        cap.setCapability("autoGrantPermissions","true");
        System.out.println("---"+"8");
        cap.setCapability("autoAcceptAlerts","true");
        System.out.println("---"+"9");

        driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), cap);
        System.out.println("---"+"10");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Thread.sleep(2000);

        System.out.println("app is started !");
    }
}

