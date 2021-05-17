package Gryshchenko.HW7;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> myMap = new HashMap<>();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")) break;
            for (char ch : input.replaceAll(" ", "").toCharArray()){
                if (myMap.containsKey(ch)){
                    int currentCounter = myMap.get(ch);
                    myMap.put(ch, ++currentCounter);
                }else {
                    myMap.put(ch, 1);
                }
            }
        }
        while( myMap.values().remove(1) );
        System.out.println(myMap.keySet());
    }
}
