package Gryshchenko.HW4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите высоту");
        int height = input.nextInt();
        System.out.println("Введите ширину");
        int widtht = input.nextInt();

        int step = 2;
        for (int i = 0; i < height*widtht; i++){
            System.out.print(step + " ");
            step += 2;
            if ((i+1) % widtht == 0){
                System.out.println();
            }
        }
    }
}
