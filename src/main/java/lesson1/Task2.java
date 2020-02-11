package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом for
*/


import java.io.StringWriter;

public class Task2 {

    public static void main(String[] args) {
        writeName();
    }


    public static String writeName() {
        StringWriter sw = new StringWriter();
        String name = "Irina";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(name + " ");
                sw.write(name + " ");
            }
            sw.write("\n");
            System.out.println();
        }
        return sw.toString();
    }

    /*public static void name() {
        String ir = "Irina";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(ir + " ");
            }
            System.out.println();
        }

    }*/
}