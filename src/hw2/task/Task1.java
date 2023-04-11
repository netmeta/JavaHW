package hw2.task;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

//1.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.


public class Task1 {
    private static final Logger LOG = Log.log(hw2.task.Task1.class.getName());

    public static void sortBubble(int[] arr) {

        try (FileWriter in = new FileWriter("hw2.txt")) {
            int temp = 0;
            String msg;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] > arr[i]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    msg = Arrays.toString(arr);
                    LOG.log(Level.INFO, msg);
                }
            }

        } catch (IOException e) {
            LOG.log(Level.INFO, e.getMessage());
            throw new RuntimeException(e);

        }
    }
}