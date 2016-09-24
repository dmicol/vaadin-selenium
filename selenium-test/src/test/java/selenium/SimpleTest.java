package selenium;

import org.junit.Test;

/**
 * Created by xotonic on 24.09.2016.
 */
public class SimpleTest {

//    @Test
//    public void test_hello() throws IOException {
//        System.out.println("TEST START");
//        HtmlUnitDriver driver;
//
//        /* Disable garbage messages from HtmlUnit*/
//        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(Level.SEVERE);
//
//        /* Enabling javascript in constructor parameter */
//        driver = new HtmlUnitDriver(true);
//
//        /* Always wait when finding element */
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        /* Connecting our jetty servlet */
//        driver.get("http://localhost:8080/");
//
//        driver.findElement(By.id("button")).click();
//
//        System.out.printf("Found element type by xpath: [%s]\n",
//                driver.findElement(By.xpath("//*[@id=\"gwt-uid-3\"]")).getTagName());
//
//        System.out.println("TEST FINISH");
//
//    }

    @Test
    public void UNIT_TEST()
    {
        System.out.println("UNIT TEST");
    }
}
