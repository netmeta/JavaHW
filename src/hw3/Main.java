package hw3;

import hw3.task.Task1;
import hw3.task.Task2;
import hw3.task.Task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 10, 21, 100, 33, 555, 99, 5, 0 };
        System.out.println("\nTask 1\n");
        System.out.println(Arrays.toString(Task1.sortArray(arr)));
        System.out.println("\nTask 2\n");
        Task2.fillList();
        System.out.println("\nTask 3\n");
        Task3.minMaxAverage();


    }
}