package tasks;

public class FourthTask {

    /**
     Реализовать функцию, которая будет возвращать переданную строку в развернутом виде.
     Функция на вход должна принимать строку и на выходе возвращать строку.(реверс)
     */
    public static String reverse(String text) {

        String reverseText = "";
        for (int i = 0; i < text.length(); i++) {
            reverseText = text.charAt(i) + reverseText;
        }
        return reverseText;
    }

    public static String reverseWithStringBuilder(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}