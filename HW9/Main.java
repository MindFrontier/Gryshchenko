package Gryshchenko.HW9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Manager.addClient(input);
        Client n = new Client();
        n.name = "Petro";
        System.out.println(n.name);

    }
}

