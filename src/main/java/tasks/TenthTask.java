package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TenthTask {

    /**
     * Добавить в List<> объекты Кошка, Кошка, Собака, Медведь.
     * Не используя Set<> и Stream Api удалить дубликаты из листа.
     * Написать метод. (Решение со стримом и без)
     */
    public static List<String> makeListUnique(List<String> list) {
        List<String> uniqueList = new ArrayList<>();
        for (String s : list) {
            if (!uniqueList.contains(s)) {
                uniqueList.add(s);
            }
        }
        return uniqueList;
    }

    //через stream
    public static List<String> makeListUniqueWithStream(List<String> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }
}