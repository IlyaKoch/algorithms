package tasks;

public class SixthTask {

    /**
     * Написать метод, который будет возвращать сумму цифр числа, поданного на вход.
     * Данные для проверки:
     * func(10) → 1
     * func(99) → 18
     * func(541) → 10
     * func(5) → 5
     */
    public static int getSumOfNumber(int number) {
        String str = Integer.toString(number);
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += Character.digit(c, 10);
        }
        return sum;
    }
}