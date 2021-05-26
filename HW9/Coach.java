package Gryshchenko.HW9;

import java.util.HashMap;

public class Coach extends Employee {

    Coach(String NAME){ name = NAME; }

    HashMap<Coach, Client> coachClients = new HashMap<>();

    public  int addTraningWithCoach( String coachName, String clientName, int coachingSessions) {
        for (Coach coach : coachClients) {
            if (coach.name.equals(coachName)) {
                coach.addTraningWithCoach(clientName, coachingSessions);
                return 0;
            }
            return -1;

    }

}
