package Gryshchenko.HW9;

import java.util.HashMap;

public class Coach extends Employee {

    public static HashMap<String, Integer> addtraningWithCoach(String coach, int sessions) {
        Client bob = new Client();
        Coach jim = new Coach();
        jim.name = coach;
        bob.traningWithCoach.put(coach, sessions);
        System.out.println(bob.traningWithCoach);
        return bob.traningWithCoach;

    }

}
