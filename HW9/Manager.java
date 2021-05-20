package Gryshchenko.HW9;

import java.util.Scanner;

public class Manager extends Human{
    Scanner scaner = new Scanner(System.in);
    String addName = scaner.nextLine();
    public static void addClient(String addName){

        Client client = new Client();
        client.name = addName;

    };

    public static void deleteClient(String deleteName){
        deleteName = null;
    };
}
