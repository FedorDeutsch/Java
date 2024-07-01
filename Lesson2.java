public class Main {
    public static void main(String[] args) {

        // Переменные и типы данных

        int age = 20;
        System.out.println("Age: " + age); // Обеденение разных типова данных происходит через +

        // Целочисленные типы данных

        // byte - от -128 до 127 и занимает 1 байт
        // short - от - 32768 до 32767 и занимает 2 байта
        // int - от - -2147483648 до 2147483647 и занимает 4 байта
        // long - от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807.

        // Числа с плавающей точкой

        float number = 3.14f; // Обязательно в конце ставить "f"
        // float - от -3.4*1038 до 3.4*1038
        // double - от ±4.9*10-324 до ±1.8*10308
        double number_two = 3.15d; // Необязательно ставить "d"

        System.out.println(number + number_two);

        // Другие типы данных

        // char - позволяет хранить один знак
        // boolean - позволяет хранить true и false
        // String - позволяет хранить строчку
        char ch = '*'; // Нужно ставить одинарные ковычки
        String user_name = "Fedor"; // Нужно ставить обычные ковычки
        boolean is_happy = true; // true или false ?

        System.out.println(ch + " " + user_name + " " + is_happy);

    }
}
