package tasks;

public class EighthTask {

    /**
     Необходимо написать метод, который во входящем массиве вернет максимальное число из массива. (Реализация должна быть через цикл)
     */
    public static int minInt(int[] numbers){
        int minInt = numbers[0];
        for (int number : numbers) {
            if (number < minInt){
                minInt = number;
            }
        }
        return minInt;
    }
}