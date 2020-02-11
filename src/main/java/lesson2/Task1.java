package lesson2;

/**
 * Реализовать у класса Task1 переменные age (тип int),  name (тип String), ageGroup(тип String)
 * реализовать методы геттеры и сеттеры для каждой переменной.
 * Должны быть выполненны следующие условия:
 *  - не должно быть возможности напрямую устанваливать или читать значение age/name
 *  - нельзя установить значение age меньше нуля
 *  - максимальныое значение для возраста - 100
 *  - значение name не может быть короче чем 3 символа и длиннее чем 50 символов
 *  - name не может состоять из одних только пробелов
 *  - не зависимо от того ввел пользователь имя с большой или с маленькой буквы,
 *      оно должно быть записано в переменную name с большой буквы
 *  - ageGroup должен устанавливаться автоматически при установке возраста
 *      - child если age до 15 лет
 *      - student  - если age от 15 до 25 лет
 *      - worker - если age от 26 до 65 лет
 *      - pensioner - если age старше 66 лет
 *  - ageGroup можно только прочитать с помощью геттера, сеттер должен быть приватным и недоступным для других классов
 */

public class Task1 {

    final static String GROUP_CHILD = "child"; // константа
    final static String GROUP_STUDENT = "student";
    final static String GROUP_WORKER = "worker";
    final static String GROUP_PENSIONER = "pensioner";

    private int age;
    private String name;
    String ageGroup;

    public Task1(){
        this.age = 0;
        this.name = "Serega";
        this.ageGroup = GROUP_CHILD;
    }

    public Task1(int age, String name){
        this.age = age;
        this.name = name;
        setAgeGroup(age);
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) {
            System.out.println("Error");
        } else {
            this.age = age;
            setAgeGroup(age);
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        if( name == null ) {
            System.out.println("Error");
            return;
        }
        if(name.length() < 3 || name.length() > 50 || name.trim().length() == 0 ) {
            System.out.println("Error");
        } else {
            this.name = name.substring( 0, 1 ).toUpperCase() + name.substring( 1 );
        }
    }

    public String getName() {
        return this.name;
    }

    private void setAgeGroup(int age) {
        if(age >= 0 || age < 15) {
            this.ageGroup = GROUP_CHILD;
        } else if (age >= 15 || age < 25){
            this.ageGroup = GROUP_STUDENT;
        } else if (age >= 25 || age <= 65){
            this.ageGroup = GROUP_WORKER;
        } else if (age >= 66 || age <= 100){
            this.ageGroup = GROUP_PENSIONER;
        } else {
            System.out.println("Error of ageGroup");
        }
    }

    public String getAgeGroup() {
        return this.ageGroup;
    }


}