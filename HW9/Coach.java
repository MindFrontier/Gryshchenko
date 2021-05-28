package Gryshchenko.HW9;

import java.util.HashMap;
import java.util.HashSet;

public class Coach extends Employee {


    Coach(String NAME, int EXP){ name = NAME; experience = EXP; }

    HashSet<Client> coachClients = new HashSet<>();

    public  int addTraningWithCoach( String coachName, String clientName, int coachingSessions) {
        for (Client client : coachClients) {
            if (client.name.equals(clientName)) {
                client.traningWithCoach.put(coachName, coachingSessions);
                return 0;
            }
        }
        return -1;
    }

    public void addCoachClient (String clientName){
        Client newClient = new Client(clientName);
        coachClients.add(newClient);
    }

    public void deleteCoachClient (String clientName){
        Client newClient = new Client(clientName);
        coachClients.remove(newClient);
    }

}
