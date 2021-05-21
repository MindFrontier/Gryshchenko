package Gryshchenko.HW9;

import java.util.Scanner;

public class Manager extends Human{
/*    Scanner scaner = new Scanner(System.in);
    String addName = scaner.nextLine();*/


    public static String addClient(String name){

        Client client = new Client();
        client.name = name;
        System.out.println(client.name);
        return client.name;
    };

    public static String deleteClient(String name){
        Client client = new Client();
        client.name = null;
        return client.name;
    };
}
