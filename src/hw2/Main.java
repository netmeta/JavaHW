package hw2;
import hw2.task.*;
import hw2.task.Task2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[]{1,55,3,4,58,99,8,7};
        Task1.sortBubble(arr);
        Task2.ParseString();
    }
}
