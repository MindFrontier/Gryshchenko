package Gryshchenko.HW9;

import java.util.Scanner;

public class Main {
    static Manager manager = new Manager("Manager");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (isExitEntered(input)) break;
            String nextInput = scanner.nextLine();


            if (input.equals("add coach")) {
                addCoach(nextInput);
            }
            if (input.equals("remove coach")) {
                deleteCoach(nextInput);
            }
            if (input.equals("add massagist")) {
                addMassagist(nextInput);
            }
            if (input.equals("remove massagist")) {
                deleteMassagist(nextInput);
            }
            if (input.equals("add client to coach")) {
                addClientToCoach(nextInput);
            }
            if (input.equals("remove client from coach")) {
                deleteClientFromCoach(nextInput);
            }
            if (input.equals("add client to massagist")) {
                addClientToMassagist(nextInput);
            }
            if (input.equals("remove client from massagist")) {
                deleteClientFromMassagist(nextInput);
            }
            if (input.equals("add training to client")) {
                addTraningWithCoach(nextInput);
            }
            if (input.equals("add massage to client")) {
                addMassageSession(nextInput);
            }
            if (input.equals("add client")) {
                addClient(nextInput);
            }
            if (input.equals("remove client")) {
                deleteClient(nextInput);
            }
        }

    }

    static void addClient(String input) {
        String clientName = input;
        manager.addClient(input);
    }

    static void deleteClient(String input) {
        String clientName = input;
        manager.deleteClient(input);
    }

    static void addClientToCoach(String input) {
        String[] array = input.split(",");
        if (manager.addClientToCoach(array[0], array[1]) < 0) {
            System.out.println("Trainer not found");
        }
    }

    static void deleteClientFromCoach(String input) {
        String[] array = input.split(",");
        manager.deleteClientFromCoach(array[0], array[1]);
    }

    static void addClientToMassagist(String input) {
        String[] array = input.split(",");
        if (manager.addClientToMassagist(array[0], array[1]) < 0) {
            System.out.println("Masseur not found");
        }
    }

    static void deleteClientFromMassagist(String input) {
        String[] array = input.split(",");
        manager.deleteClientFromMassagist(array[0], array[1]);
    }

    static void addCoach(String input) {
        String[] array = input.split(",");
        manager.addCoach(array[0], Integer.parseInt(array[1]));
    }

    static void deleteCoach(String input) {
        String[] array = input.split(",");
        manager.deleteCoach(array[0], Integer.parseInt(array[1]));
    }

    static void addMassagist(String input) {
        String[] array = input.split(",");
        manager.addMassagist(array[0], Integer.parseInt(array[1]));
    }

    static void deleteMassagist(String input) {
        String[] array = input.split(",");
        manager.deleteMassagist(array[0], Integer.parseInt(array[1]));
    }

    static void addTraningWithCoach(String input) {
        String[] array = input.split(",");
        manager.addTraningWithCoach(array[0], array[1], Integer.parseInt(array[2]));
    }

    static void addMassageSession(String input) {
        String[] array = input.split(",");
        manager.addMassageSession(array[0], Integer.parseInt(array[1]));
    }

    static boolean isExitEntered(String input) {
        return input.equals("end");
    }
}

