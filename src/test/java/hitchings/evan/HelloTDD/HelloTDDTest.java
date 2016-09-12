package hitchings.evan.HelloTDD;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by evanhitchings on 9/8/16.
 */
public class HelloTDDTest {
    @Test
    public void displayMessageTest(){
        HelloTDD helloTDD = new HelloTDD();
        Assert.assertEquals("The message returned is equal to cat", "cat", helloTDD.displayMessage());
        helloTDD.displayMessage();




    }
}
