package xotonic;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/**
 * Created by xotonic on 25.09.2016.
 */
public class SampleIT {

    @Test
    public void INTEGRATION_TEST()
    {
        System.out.println("INTEGRATION TEST START");
        HtmlUnitDriver driver;

        /* Disable garbage messages from HtmlUnit*/
        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(Level.SEVERE);

        /* Enabling javascript in constructor parameter */
        driver = new HtmlUnitDriver(true);

        /* Always wait when finding element */
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /* Connecting our jetty servlet */
        driver.get("http://localhost:8080/");

        driver.findElement(By.id("button")).click();

        System.out.printf("Found element type by xpath: [%s]\n",
                driver.findElement(By.xpath("//*[@id=\"gwt-uid-3\"]")).getTagName());

        System.out.println("INTEGRATION TEST FINISH");
    }

}
