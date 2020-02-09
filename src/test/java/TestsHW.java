import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static lesson1.Task1.min;
import static org.testng.Assert.assertTrue;


public class TestsHW {


    @Test(dataProvider = "provider")
    public void checkMinOf3(int value, int expected, String str) {
        System.out.println(str);
        assertTrue(value == expected, String.format("Expected %d to be equal %d", expected, value));
    }


    @DataProvider(name = "provider")
    public Object[][] provider() {
        return new Object[][]{
                {min(5, 2, 3), 2, "First"},
                {min(-5, -2, 3), -5, "Second"},
                {min(-100, 0, 100), -100, "Third"},
                {min(10, 0, 20), 0, "Fourth"},
        };
    }
}