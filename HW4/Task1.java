package Gryshchenko.HW4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String someInput;

        do {
            System.out.println("Введите данные");
            someInput = input.nextLine();
            if (someInput.contains("конец")){
                break;
            }
            String[] student = someInput.split(":");
            String[] marksStr = student[1].split(",");
            int[] marks = new int[marksStr.length];
            for (int i = 0; i < marksStr.length; i++){
                marks[i] = Integer.parseInt(marksStr[i].trim());
            }

            int max = marks[0];
            int min = marks[0];
            double sum = 0;
            for (int j = 0; j < marks.length; j++) {
                if (marks[j] > max) {
                    max = marks[j];
                }
                if (marks[j] < min){
                    min = marks[j];
                }
                sum += marks[j];
            }

            double avrg = sum/marks.length;

            System.out.println("Имя: " + student[0]);
            System.out.println("Максимальный: " + max);
            System.out.println("Средний: " + avrg);
            System.out.println("Минимальный: " + min);
        } while (true);



    }



}
