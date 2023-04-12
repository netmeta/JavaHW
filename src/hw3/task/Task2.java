package hw3.task;

import java.util.ArrayList;
import java.util.Random;

/**
 * Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
 */
public class Task2 {
    public static void fillList() {
        ArrayList<Integer> listNum = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listNum.add(random.nextInt(20));
        }
        System.out.println(listNum);

        for (int i = listNum.size() - 1; i >= 0; i--) {
            if (listNum.get(i) % 2 == 0) {
                listNum.remove(i);
            }
        }
        System.out.println(listNum);
    }
}
