package hw3.task;

import java.util.Arrays;

/**
 * (task1) Реализовать алгоритм сортировки слиянием.
 */
public class Task1 {
    public static int[] sortArray(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length < 2) {
            return array;
        }
        int[] arrayA = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] arrayB = Arrays.copyOfRange(array, arrayA.length, array.length);

        arrayA = sortArray(arrayA);
        arrayB = sortArray(arrayB);

        return mergeArray(arrayA, arrayB);
    }

    public static int[] mergeArray(int[] arrayA, int[] arrayB) {

        int[] result = new int[arrayA.length + arrayB.length];
        int indA = 0, indB = 0;
        for (int i = 0; i < result.length; i++) {
            if (indA < arrayA.length && indB < arrayB.length) {
                if (arrayA[indA] < arrayB[indB]) {
                    result[i] = arrayA[indA];
                    indA++;
                } else {
                    result[i] = arrayB[indB];
                    indB++;
                }
            } else if (indA == arrayA.length && indB < arrayB.length) {
                result[i] = arrayB[indB];
                indB++;
            }
            else if (indA < arrayA.length && indB == arrayB.length) {
                result[i] = arrayA[indA];
                indA++;
            }else{
                result[i] = 0;
            }
        }

        return result;
    }

}
