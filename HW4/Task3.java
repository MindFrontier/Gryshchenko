package Gryshchenko.HW4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String someInput = input.nextLine();
        String[] arr = someInput.split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        String sign = arr[1];

        if (a >= 0 && b >= 0){

            switch (sign){
                case "+":
                    System.out.println("Результат:" + (a + b));
                    break;
                case "-":
                    System.out.println("Результат:" + (a - b));
                    break;
                case "*":
                    System.out.println("Результат:" + (a * b));
                    break;
                case "/":
                    if (b == 0){
                        System.out.println("Нельзя делить на ноль");
                        break;
                    }
                    System.out.println("Результат:" + (a / b));
                    break;
            }
        }

    }

}
