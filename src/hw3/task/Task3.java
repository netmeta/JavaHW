package hw3.task;

import java.util.ArrayList;
import java.util.Random;

/***
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
 */
public class Task3 {
    public static void minMaxAverage() {
        ArrayList<Integer> listArray = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listArray.add(random.nextInt(1, 100));

        }
        System.out.println(listArray);
        int minNum = listArray.get(0);
        int maxNum = listArray.get(0);
        int sumNum = 0;

        for (int num : listArray) {
            if (num < minNum) {
                minNum = num;
            }
            if (num > maxNum) {
                maxNum = num;
            }
            sumNum += num;
        }
        double average = (double) sumNum / listArray.size();
        System.out.printf("\nМаксимальный элемент %s\n", maxNum);
        System.out.printf("Минимальный элемент %s\n", minNum);
        System.out.printf("Среднее арифметическое %s\n", average);
    }
}

