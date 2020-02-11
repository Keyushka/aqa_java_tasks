import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static lesson1.Task5.reverse;
import static org.testng.Assert.assertEquals;


public class TestTask5 {

    @BeforeClass // выполнится один раз перед классом
    public void start(){
        System.out.println("----------------------------------");
        System.out.println("Starting test for Task5");
    }


    @Test(dataProvider = "provider", priority = 3)
    public void checkMinOf3(String actualString, String expectedString, String str) {
        System.out.println(str);
        assertEquals(expectedString, actualString, String.format("Expected %s to be equal %s", expectedString, actualString));
    }


    @DataProvider(name = "provider")
    public Object[][] provider() {
        return new Object[][]{
                {reverse("Hello world!!!"), "!!!dlrow olleH", "1 - latin"},
                {reverse("!№;№:%;?:*?+=-.юб$%^&*(@"), "@(*&^%$бю.-=+?*:?;%:№;№!", "2 - special characters"},
                {reverse("          "), "          ", "3 - spaces"},
                {reverse("кириллица"), "ациллирик", "4 - cyrillic"},
                {reverse("0123456789"), "9876543210", "5 - numbers"},
                {reverse("在哪儿可以租车？"), "？车租以可儿哪在", "6 - another language - Chinese"},
                {reverse("«И цзин», или «Чжоу И» — наиболее ранний из китайских философских текстов. Наиболее ранний слой, традиционно датируемый ок. 700 г. до. н. э. и предназначавшийся для гадания, состоит из 64 гексаграмм. Во II веке до н. э. был принят конфуцианской традицией как один из канонов конфуцианского Пятикнижия."),
                        ".яижинкитяП огокснаицуфнок вононак зи нидо как йеицидарт йокснаицуфнок тянирп лыб .э .н од екев II оВ .ммаргаскег 46 зи тиотсос ,яинадаг ялд ясйишвачанзандерп и .э .н .од .г 007 .ко йымеуритад онноицидарт ,йолс йиннар еелобиаН .вотскет хиксфосолиф хиксйатик зи йиннар еелобиан — »И уожЧ« или ,»низц И«",
                        "7 - long sentence"},
        };
    }

}