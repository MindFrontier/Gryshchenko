package Gryshchenko.HW9;

import java.util.HashMap;

public class Massagist extends Employee {

    public static Integer addMassageSession(int m) {
        Client bob = new Client();
        bob.massageSessions = m;
        System.out.println(bob.massageSessions);
        return addMassageSession(m);
    }



}
