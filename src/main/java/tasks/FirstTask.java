package tasks;

import java.util.HashMap;
import java.util.Map;

public class FirstTask {

    /**
     * Дан массив Char. Написать метод, возвращающий Map<Char, Boolean>, где ключ - символ, значение - true, если символ встречается в массиве больше одного раза.
     * Например :
     * someMethod(['c', 's', 'e', 'c']) → {"с": true, "s": false, "e": false}
     * someMethod(['a', 'b', 'c']) → {"a": false, "b": false, "c": false}
     * someMethod(['c', 'c', 'c', 'c']) → {"с": true}
     */
    public static Map<Character, Boolean> checkContainedInArray(char[] symbols) {
        Map<Character, Boolean> map = new HashMap<>();
        boolean notUnique;
        for (char symbol : symbols) {
            notUnique = map.containsKey(symbol);
            map.put(symbol, notUnique);
        }
        return map;
    }
}