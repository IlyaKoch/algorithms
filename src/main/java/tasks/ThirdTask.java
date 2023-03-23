package tasks;

public class ThirdTask {

    /**
     * Вычислить сколько раз символ а встречается в строках Абзац, анАконда. Учитывать регистр
     */
    public static int characterCounter(String str, char symbol) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (symbol == c){
                count++;
            }
        }
        return count;
    }
}