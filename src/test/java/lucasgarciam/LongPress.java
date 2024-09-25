package lucasgarciam;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class LongPress extends BaseTest{

    @Test
    public void LongPressGesture() throws MalformedURLException, URISyntaxException
    {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
    }
    
}
