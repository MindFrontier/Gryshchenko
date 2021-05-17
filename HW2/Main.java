package Gryshchenko.HW2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //задание 1
        int[] massive = {0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(massive));
        int temp = massive[0];
        massive[0] = massive[1];
        massive[1] = temp;
        temp = massive[2];
        massive[2] = massive[3];
        massive[3] = temp;
        temp = massive[4];
        massive[4] = massive[5];
        massive[5] = temp;
        System.out.println(Arrays.toString(massive));

        //задание 2
        Scanner input = new Scanner(System.in);
        System.out.println("Введите букву:");
        String someChar = input.nextLine();
        char convertedChar = someChar.charAt(0);
        System.out.println(Character.isLetter(convertedChar));

        System.out.println("Введите слова для преобразования:");
        String someUpperString = input.nextLine();
        System.out.println(someUpperString.toUpperCase());

        System.out.println("Введите число:");
        String someNumber = input.nextLine();
        int calculation = Integer.parseInt(someNumber);

        calculation = (calculation + calculation*calculation + calculation*calculation*calculation);
        System.out.println("Вычисление:" + someNumber + "+" + someNumber + "*" + someNumber + "+" + someNumber + "*" + someNumber + "*" + someNumber + "=" + calculation);

        //задание 3
        System.out.println("Введите предложение:");
        String someSentence = input.nextLine();
        System.out.println("Тримированое предложение: " + someSentence.trim());

        System.out.println("Количество символв в строке: " + someSentence.length());

        String someWord = "Java";
        System.out.println("Содержит слово Java: " + someSentence.contains(someWord));

        String[] sentenceToArray = someSentence.split(" ");
        System.out.println(Arrays.toString(sentenceToArray));

        System.out.println("Количество слов в строке: " + sentenceToArray.length);


    }
}
