package Gryshchenko.HW8;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    /*
    Пользователь вводит число вида: 100250100.
    Вывести кол-во нулей в этом числе (5) и кол-во нулей в конец числа (2)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> number = new HashMap<>();
        String input = scanner.nextLine();
        int counterAtEnd = 0;
        for (char num : input.toCharArray()){
            if (number.containsKey(num)){
                int currentCounter = number.get(num);
                number.put(num, ++currentCounter);
                if (num =='0'){
                    counterAtEnd+=1;
                }else {
                    counterAtEnd = 0;
                }
            }else {
                number.put(num, 1);
            }
        }

        System.out.println("Количество нулей: "+number.get('0'));
        System.out.println("Количество нулей в конце: "+counterAtEnd);

    }

}
