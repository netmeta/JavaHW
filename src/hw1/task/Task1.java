//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!

package hw1.task;

import java.util.Scanner;

public class Task1 {
    public static int triangleNumber(int num){
        int sum = 0;
        for (int i = 1; i < num + 1; i++){
            sum += i;


        }
        return sum;
    }


    public static int factorialNum(int num) {
        int product = 1;
        for (int i = 1; i < num + 1; i++){
            product *= i;
        }
        return product;
    }
}