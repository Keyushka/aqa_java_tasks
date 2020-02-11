package lesson1;

/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println(reverse("«И цзин», или «Чжоу И» — наиболее ранний из китайских философских текстов. Наиболее ранний слой, традиционно датируемый ок. 700 г. до. н. э. и предназначавшийся для гадания, состоит из 64 гексаграмм. Во II веке до н. э. был принят конфуцианской традицией как один из канонов конфуцианского Пятикнижия."));
    }

    public static String reverse(String str) {
        String strRev = "";
        char[] arr = str.toCharArray(); // Преобразуем строку str в массив символов (char)
        for (int i = arr.length-1; i >= 0; i--) {
            strRev += arr[i];
        }
        return strRev;
    }
}
