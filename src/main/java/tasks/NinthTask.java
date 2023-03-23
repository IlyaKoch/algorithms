package tasks;

public class NinthTask {

    /**
     * Функция, на вход приходит строка, вернуть true - если палиндром, false - если не палиндром.
     */
    public static boolean isPalindrome(String text) {
        String reverseText = new StringBuilder(text).reverse().toString().toLowerCase();
        return reverseText.equals(text.toLowerCase());
    }
}