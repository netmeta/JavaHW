package hw5.task;

import java.util.*;
import java.util.stream.Collectors;

//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//Отсортировать по убыванию популярности.

public class Task2 {
    static List<String> list = Arrays.asList("Иван Иванов", "Cветлана Петрова", "Кристина Белова",
            "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков",
            "Павел Чернов", "Иван Иванов", "Петр Чернышов",
            "Мария Федорова", "Марина Светлова", "Мария Савина",
            "Иван Иванов", "Мария Рыкова", "Анна Крутова",
            "Марина Лугова", "Анна Владимирова", "Петр Лыков",
            "Иван Мечников", "Петр Петин", "Петр Лыков", "Иван Ежов");


    public static void sort() {
        Map<String, Integer> result = new LinkedHashMap<>();
        Map<String, Integer> frequency = list.stream().collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
        List<Map.Entry<String, Integer>> resultList = new LinkedList<>(frequency.entrySet());
        resultList.sort(comparator);

        for (Map.Entry<String, Integer> entry : resultList) {
            result.put(entry.getKey(), entry.getValue());
        }
        System.out.println(result);

    }

    static Comparator<Map.Entry<String, Integer>> comparator = new Comparator<>() {
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return o1.getValue().compareTo(o2.getValue());
        }
    };
    
    public static void run() {
        Map<String, Integer> frequency = list.stream().collect(Collectors.toMap(e -> e, e -> 2, Integer::sum));
        frequency.forEach((k, v) -> System.out.println(k + ": " + v));

    }
}

