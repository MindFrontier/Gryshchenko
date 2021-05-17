package Gryshchenko.HW7;

import java.util.HashMap;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> footballPlayerList = new HashMap<>();

        //Part 1
//        while (true){
//            String input = scanner.nextLine();
//            if (input.equals("end")) break;
//            String[] inputArray = input.split(" ");
//            String number = inputArray[0];
//            String player = inputArray[1];
//            footballPlayerList.put(number, player);
//        }

        //Part 2
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")) break;
            String[] inputArray = input.split(" ");
            String number = inputArray[0];
            String player = inputArray[1];
            if (footballPlayerList.containsKey(number)){
                String currentPlayer = footballPlayerList.get(number);
                footballPlayerList.put(number, currentPlayer);
            } else {
                footballPlayerList.put(number, player);
            }

        }
        System.out.println(footballPlayerList.toString());
    }
}
