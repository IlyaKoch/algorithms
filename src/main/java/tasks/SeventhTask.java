package tasks;

public class SeventhTask {

    /**
     * Написать функцию, которая на вход принимает 2 параметра: начало и конец диапазона.
     * Затем эта функция перебирает в себе числа в этом диапазоне и выводит на экран по следующему принципу.
     * Если число кратно трем, на экран выводит слово "физ", если число кратно 5, то выводится слово "баз".
     * Если кратно и 3 и 5 одновременно - "физбаз". В остальных случаях - выводится само число.
     */
    public static void fizzBuzzOutput(int startRange, int endRange) {
        for (int j = startRange; j <= endRange; j++) {
            if (j % 5 == 0 && j % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (j % 5 == 0) {
                System.out.println("Buzz");
            } else if (j % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(j);
            }
        }
    }
}