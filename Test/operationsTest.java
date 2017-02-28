/**
 * Created by Divya on 2/27/17.
 */

import org.junit.Test;
import java.lang.*;

public class operationsTest {

    Operations o = new Operations();
    int a=12;
    int b=0;


    /**
     * Test case for Division by Zero
     * @throws Exception
     */

    @Test(expected= java.lang.ArithmeticException.class)
    public void testdivision() throws Exception {

        o.performop('/',b,a);

        System.out.println("Test Succeeded!");

    }


}
