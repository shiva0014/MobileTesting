package AnCrypto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;

public class test extends BaseClass {
    @Test
    void test() throws InterruptedException, MalformedURLException {
        super.openApp();
        for (int i = 33;i<37;i++){
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("._screenshotBox_619e8>div>div:nth-child("+i+")")).click();
        }
    }
}
