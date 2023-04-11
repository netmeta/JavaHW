
package hw1.task;
//Вывести все простые числа от 1 до 1000


public class Task2 {
    public static String numbers() {
        String nums = "2, 3, 5, 7, ";

        for(int i = 8; i < 1001; i++){
            if(isNumbers(i) != 0){
                nums += i + ", ";
            }

        }

        return nums;
    }

    public static int isNumbers(int num){
        if(num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0){
            return 0;
        }
        else {return num;}
    }

}

