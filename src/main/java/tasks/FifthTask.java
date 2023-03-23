package tasks;

public class FifthTask {

    /**
     * Написать метод, вычисляющий факториал (использовать рекурсию) и написать unit-тест для проверки метода
     */
    public static int getFactorial(int fact) {
        int factorial = 1;
        for (int i = 1; i <= fact; i++) {
            factorial = i * factorial;
        }
        return factorial;
    }

    public static int getFactorialWithRecursive(int fact) {
        if (fact == 1)
            return 1;
        return fact * getFactorialWithRecursive(fact - 1);
    }
}