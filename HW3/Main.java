package Gryshchenko.HW3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Задание 1
        String javaWord = "Java";
        String itWord = "IT";
        Scanner input = new Scanner(System.in);

        System.out.println("Введите предложение: ");
        String randomInput = input.nextLine();
        //String reverseInput = new StringBuffer(randomInput).reverse().toString();
        String reverseInput = "";
        for(int i=randomInput.length()-1; i>=0; i--) {
            reverseInput = reverseInput + randomInput.charAt(i);
        };

        if (randomInput.contains(javaWord) && randomInput.contains(itWord)) {
            System.out.println("Вывод программы:");
            System.out.println(reverseInput);
            System.out.println("Java is cool");
            System.out.println("IT is cool");
            System.out.println("Java and IT are cool");
        }
        else {
            if (randomInput.contains(javaWord)){
                System.out.println("Вывод программы:");
                System.out.println(reverseInput);
                System.out.println("Java is cool");
            } else {
                if (randomInput.contains(itWord)){
                    System.out.println("Вывод программы:");
                    System.out.println(reverseInput);
                    System.out.println("IT is cool");
                };
            };
        };

        //Задание 2
        String[] someArray = new String[10];
        for (int i = 0; i < 10; i+=2) {
            System.out.println("Ячейка " + i);
            String randomElement = input.nextLine();
            someArray[i] = randomElement;
        };
        for (int i = 1; i < 10; i+=2) {
            System.out.println("Ячейка " + i);
            String randomElement = input.nextLine();
            someArray[i] = randomElement;
        };
        System.out.println("Получен массв:");
        System.out.println(Arrays.toString(someArray));


    }

}
