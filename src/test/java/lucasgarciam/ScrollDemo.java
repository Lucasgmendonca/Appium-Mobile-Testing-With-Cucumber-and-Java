package lucasgarciam;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ScrollDemo extends BaseTest {

    @Test
    public void ScrollDemoTest() throws MalformedURLException, URISyntaxException, InterruptedException 
    {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        // driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
        scrollToEndAction();
        Thread.sleep(2000);
    } 

}
