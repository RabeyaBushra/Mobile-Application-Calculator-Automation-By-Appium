import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup {
    @Test(priority = 1, description = "Sum of 2 number")
    public void doSum() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String Result= calcScreen.doSum();
        System.out.println(Result);
        Assert.assertEquals(Result,"15");
    }
    @Test(priority = 2, description = "Sub of 2 number")
    public void doSub() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String Result= calcScreen.doSub();
        System.out.println(Result);
        Assert.assertEquals(Result,"1");
    }
    @Test(priority = 3, description = "Division of 2 number")
    public void doDivision() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String Result= calcScreen.doDivision();
        System.out.println(Result);
        Assert.assertEquals(Result,"1");
    }
    @Test(priority = 4, description = "Multiplication of 2 number")
    public void doMultiplication() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        String Result= calcScreen.doMultiplication();
        System.out.println(Result);
        Assert.assertEquals(Result,"4");
    }

    @AfterMethod
    public void clearScreen(){
        CalcScreen calcScreen=new CalcScreen(driver);
        calcScreen.btnClear.click();
    }
}
