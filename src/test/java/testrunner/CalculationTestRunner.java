package testrunner;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.CalculationScreen;

import java.io.IOException;

public class CalculationTestRunner extends Setup {
    @Test
    public void doSum() throws IOException, InterruptedException {
        CalculationScreen calculationScreen=new CalculationScreen(driver);
        String res= calculationScreen.doSum();
        Assert.assertEquals(res,"12");
    }
}
