import calculator.Calculator;
import junit.framework.Assert;



import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {

    private static final Logger logger = LogManager.getLogger(CalculatorTest.class);

    @BeforeTest()
    public void beforePlus() throws Exception{
        System.out.println("before test");
    }

    @Test(dataProvider = "test1")
    public void testPlus(Integer a, Integer b) throws Exception {

        Calculator calc = new Calculator();


        logger.info("Плюсуем!");

        calc.setA(2);
        calc.setB(2);

        Assert.assertEquals(4.0, calc.plus());

        System.out.println("test plus");
    }

    @DataProvider(name = "test1")
    public Object[][] createData1(){
        return new Object[][]{
                new Object[] {new Integer(2), new Integer(2)}
        };
    }


    @Test(dataProvider = "test1")
    public void testMinus(Integer a, Integer b) throws Exception {

        Calculator calc = new Calculator();

        calc.setA(a);
        calc.setB(b);

        Assert.assertEquals(0.0, calc.minus());

        logger.info("Минусуем!");

        System.out.println("test minus");
    }

    @Test(dataProvider = "test1")
    public void testMultiply(Integer a, Integer b) throws Exception {

        Calculator calc = new Calculator();

        calc.setA(a);
        calc.setB(b);

        Assert.assertEquals(6.0, calc.multiply());

        logger.info("Умножаем!");

        System.out.println("test multiply");
    }

    @Test(dataProvider = "test1")
    public void testDivision(Integer a, Integer b) throws Exception {

        Calculator calc = new Calculator();

        calc.setA(a);
        calc.setB(b);

        Assert.assertEquals(2, calc.division());

        logger.info("Делим!");

        System.out.println("division by zerro");
    }

}