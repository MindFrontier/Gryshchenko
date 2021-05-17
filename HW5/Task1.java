package Gryshchenko.HW5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Камань - 1");
        System.out.println("Ножницы - 2");
        System.out.println("Бумага - 3");

        while (true){
            System.out.println("Выбирает первый игрок");
            String player1 = input.nextLine();
            if (player1.equals("конец")){
                break;
            }
            System.out.println("Выбирает второй игрок");
            String player2 = input.nextLine();
            if (player2.equals("конец")){
                break;
            }
            switch (player1){
                case "1":
                    if (player2.equals("1")) {
                        System.out.println("Ничья");
                    }
                    if (player2.equals("2")) {
                        System.out.println("Игрок 1 победил");
                    }
                    if (player2.equals("3")) {
                        System.out.println("Игрок 2 победил");
                    }
                    break;

                case "2":
                    if (player2.equals("1")) {
                        System.out.println("Игрок 2 победил");
                    }
                    if (player2.equals("2")) {
                        System.out.println("Ничья");
                    }
                    if (player2.equals("3")) {
                        System.out.println("Игрок 1 победил");
                    }
                    break;
                case "3":
                    if (player2.equals("1")) {
                        System.out.println("Игрок 1 победил");
                    }
                    if (player2.equals("2")) {
                        System.out.println("Игрок 2 победил");
                    }
                    if (player2.equals("3")) {
                        System.out.println("Ничья");
                    }
                    break;
            }

        }


    }
}
