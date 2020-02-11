import lesson1.Task2;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.StringWriter;

import static lesson1.Task1.min;
import static org.testng.Assert.assertTrue;


public class TestTask2 {

/*

    @Test(dataProvider = "provider2")
    public void checkName(int value, int expected, String str) {
        System.out.println(str);
        assertTrue(value == expected, String.format("Expected %d to be equal %d", expected, value));
    }
*/

    @BeforeClass // выполнится один раз перед классом
    public void start(){
        System.out.println("Starting...");
    }


    @Test
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       // System.out.println("Starting...");

        final String NAME = "Irina";

        String test_str = Task2.writeName();
        String[] test_arr = test_str.split("\n");

        if (test_arr.length != 5) {
            // Error
        }

        //for( String test : test_arr ) {
        for (int i = 0; i < test_arr.length; i++) {
            String test = test_arr[i];
            String[] names = test.split(" ");
            int num_world = names.length;
            if (num_world != 10) {
                //Error
            }
            for (int j = 0; j < 10; j++) {
                String one_name = names[j];
                if (!NAME.equals(one_name)) {
                    // Error
                }
            }
        }


    }
}
