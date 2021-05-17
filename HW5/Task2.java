package Gryshchenko.HW5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] phone = input.nextLine().replaceAll("\\pP", "").toCharArray();

        for (int i = 0; i<phone.length; i++){
            switch (phone[i]){
                case ('A') :
                case ('B') :
                case ('C') :
                    phone[i] ='2';
                    break;
                case ('D') :
                case ('E') :
                case ('F') :
                    phone[i] ='3';
                    break;
                case ('G') :
                case ('H') :
                case ('I') :
                    phone[i] ='4';
                    break;
                case ('J') :
                case ('K') :
                case ('L') :
                    phone[i] ='5';
                    break;
                case ('M') :
                case ('N') :
                case ('O') :
                    phone[i] ='6';
                    break;
                case ('P') :
                case ('Q') :
                case ('R') :
                case ('S') :
                    phone[i] ='7';
                    break;
                case ('T') :
                case ('U') :
                case ('V') :
                    phone[i] ='8';
                    break;
                case ('W') :
                case ('X') :
                case ('Y') :
                case ('Z') :
                    phone[i] ='9';
                    break;
            }
        }

        System.out.println(phone[0]+phone[1]+phone[2]+
                "-"+phone[3]+phone[4]+phone[5]+
                "-"+phone[6]+phone[7]+phone[8]+phone[9]);

    }
}
