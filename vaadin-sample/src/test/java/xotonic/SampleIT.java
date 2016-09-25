package xotonic;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by xotonic on 25.09.2016.
 */
public class SampleIT extends AutoLogin {

    @Test
    public void INTEGRATION_TEST()
    {
        System.out.println("INTEGRATION TEST START");

        Helper helper = new Helper();

        helper.get(DomId.BUTTON);
        helper.getInput(DomId.CHECKBOX);
        helper.getInput(DomId.COMBOBOX);
        helper.getInput(DomId.TEXTFIELD);

        System.out.println("INTEGRATION TEST FINISH");
    }

}
