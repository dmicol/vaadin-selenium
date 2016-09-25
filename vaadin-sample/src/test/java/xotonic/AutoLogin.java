package xotonic;

import org.junit.After;
import org.junit.Before;

/**
 * Created by xotonic on 25.09.2016.
 */
public class AutoLogin {
    @Before
    public void login()
    {
        System.out.println("AUTO LOGIN");
    }

    @After
    public void logout()
    {
        System.out.println("AUTO LOGOUT");
    }
}
