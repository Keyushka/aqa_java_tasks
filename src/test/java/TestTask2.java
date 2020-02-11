import lesson1.Task2;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TestTask2 {


    @BeforeClass // выполнится один раз перед классом
    public void start(){
        System.out.println("----------------------------------");
        System.out.println("Starting test for Task2");
    }


    @Test (priority = 1)
    @Parameters({"NumberOfRows", "NumberOfWords"})
    public static void checkRows(@Optional int NumberOfRows, int NumberOfWords) {
        //несколько часов потратила чтоб разобаться с @Optional, но не заработало. без параметризации - работает
        String test_str = Task2.writeName();
        String[] test_arr = test_str.split("\n");
        System.out.println("Number of rows = " + test_arr.length);
        assertEquals(test_arr.length, NumberOfRows, String.format("Expected %d to be equal %d", NumberOfRows, test_arr.length));

        for (int i = 0; i < test_arr.length; i++) {
            String test = test_arr[i];
            String[] names = test.split(" ");
            int num_world = names.length;
            System.out.println("Number of words = " + num_world);
            assertEquals(num_world, NumberOfWords, String.format("Expected %d to be equal %d", NumberOfWords, num_world));
        }
    }

}
