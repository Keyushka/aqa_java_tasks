import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static lesson1.Task1.min;
import static org.testng.Assert.assertEquals;


public class TestTask1 {

    @BeforeClass // выполнится один раз перед классом
    public void start(){
        System.out.println("----------------------------------");
        System.out.println("Starting test for Task1");
    }


    @Test(dataProvider = "provider")
    public void checkMinOf3(int value, int expected, String str) {
        System.out.println(str);
        assertEquals(expected, value, String.format("Expected %d to be equal %d", expected, value));
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