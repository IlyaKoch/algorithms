package tasks;

public class SecondTask {

    /**
     Написать функцию, которая принимает на вход строку word, строку separator и число count.
     Результат должен возвращать строку, содержащую word в количестве count, разделенных separator.
     Примеры: ("Тест", "0", 3) -> "Тест0Тест0Тест" ("Java", "И", 2) -> "JavaИJava" ("Java"", "И", 1) -> "Java"
     */
    public static String buildToString (String word, String separator, int count){
        StringBuilder result = new StringBuilder();
        result.append(word);
        for (int i = 0; i < count - 1 ; i++) {
            result.append(separator).append(word);
        }
        return result.toString();
    }
}