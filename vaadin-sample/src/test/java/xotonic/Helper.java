package xotonic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/**
 * Created by xotonic on 25.09.2016.
 */
public class Helper {

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    public Helper()
    {
        HtmlUnitDriver driver;

        /* Disable garbage messages from HtmlUnit*/
        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(Level.SEVERE);

        /* Enabling javascript in constructor parameter */
        driver = new HtmlUnitDriver(true);

        /* Always wait when finding element */
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /* Connecting our jetty servlet */
        driver.get("http://localhost:8080/");

        this.driver = driver;
    }


    public WebElement getInput(DomId parent) {
        System.out.printf("Finding input in element with id '%s' ... ", parent.getId());
        WebElement e = driver.findElement(By.id(parent.getId()));

        if (e.getTagName().equals("input")) {
            System.out.println("FOUND");
            return e;
        } else {
            System.out.println("FOUND");
            return e.findElement(By.tagName("input"));
        }
    }

    public WebElement get(DomId id)
    {
        System.out.printf("Finding element with id '%s' ... ", id.getId());
        WebElement e = driver.findElement(By.id(id.getId()));
        System.out.println("FOUND");
        return e;
    }


}
