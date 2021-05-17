package Gryshchenko.HW8;

import java.util.Scanner;

public class Task1 {
    /*
    Пользователь вводит строку типа 1526.
    Программа должна вывести "тысяча пятсот двадцать шесть".
    Максимальное числа для ввода - 9999. Мнимальное - 0.
    Обратите внимание на операции получения остатка от деления и целой части.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input<0 || input>9999){
            return;
        }



    }

}
