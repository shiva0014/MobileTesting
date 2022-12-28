package AnCrypto;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.reporters.EmailableReporter;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class OpenApp extends BaseClass {
    String text;
    String[] textArray;
    @Test(priority = 1, enabled = true)
    public void CLickImportYourWallet() throws InterruptedException, MalformedURLException {
        super.openApp();
        //Click on Trades option on footer
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@text='Import your wallet']")).click();
        Thread.sleep(2000);
        driver.navigate().back();

    }

    @Test(priority = 2, enabled = true)
    public void clickCreateNewWallet() throws InterruptedException, MalformedURLException {

        Thread.sleep(2000);
        //Click on markets option in footer
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@text='Create New Wallet']")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 3, enabled = true)
    void enterWalletName() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Enter wallet name']")).sendKeys("Test001");
    }

    @Test(priority = 4, enabled = true)
    void ClickOnNextButton() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@text='Next']")).click();
    }

    @Test(priority = 5, enabled = true)
    void copyMemo() throws IOException, UnsupportedFlavorException, InterruptedException {
        boolean is_loading = true;

        while (is_loading) {
            //check data
            // sleep(1000)
            try {
                WebElement a = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
                        "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                        "ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                        "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view." +
                        "ViewGroup/android.widget.ImageView"));
                a.click();
                Thread.sleep(1000);
                text = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
                is_loading = false;

                // if data loaded, is_loading = false
            } catch (Exception e) {
                Thread.sleep(500);
            }
        }
    }

    @Test(priority = 6,enabled = true)
    void IHaveSafelyStoreMemo(){
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
                "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup" +
                "/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup" +
                "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
                "/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.ImageView")).click();
    }
    @Test(priority = 7,enabled = true)
    void clickOnNextButton(){

        driver.findElement(By.xpath("//*[@text='Next']")).click();
    }

    @Test(priority = 8,enabled = true)
    void arrangeMnemonics() throws InterruptedException {
        textArray = text.split(" ");
        for (int i = 0 ; i < textArray.length;i++){
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@text='"+textArray[i]+"']")).click();
        }
    }
    @Test(priority = 9,enabled = true)
    void clickOnNextButton1() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Next']")).click();
    }

    @Test(priority = 10,enabled = true)
    void referralNextEmptyField() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@text='Next']")).click();
    }
    @Test(priority = 11,enabled = true)
    void ClickOkReferral() throws InterruptedException {
        Thread.sleep(200);
        driver.findElement(By.xpath("//*[@text='Ok']")).click();
    }

    @Test(priority = 12,enabled = true)
    void enterReferralCode() throws InterruptedException {
        WebElement referralCode = driver.findElement(By.xpath("//*[@text='Enter your referral code']"));
        referralCode.click();
        Thread.sleep(200);
        referralCode.sendKeys("JOINANCRYPTO");
    }

    @Test(priority = 13,enabled = true)
    void referralNext() throws InterruptedException {
        Thread.sleep(200);
        driver.findElement(By.xpath("//*[@text='Next']")).click();
    }



// this is dependencies
// this is dependencies
    @Test(priority = 15, enabled = false)
    public void click_on_deposit_home() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.quit();
    }
}
