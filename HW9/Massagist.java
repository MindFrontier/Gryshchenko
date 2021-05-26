package Gryshchenko.HW9;

import java.util.HashMap;
import java.util.HashSet;

public class Massagist extends Employee {

    Massagist(String NAME){ name  = NAME; }

    HashSet<Client> massagistClients = new HashSet<>();

    public int addMassageSession(String clientName, int massageSession) {
        for (Client client : massagistClients) {
            if (client.name.equals(clientName)) {
                client.massageSessions + massageSession;
                return 0;
            }
        }
        return -1;

    }



}
