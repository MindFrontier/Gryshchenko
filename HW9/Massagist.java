package Gryshchenko.HW9;

import java.util.HashMap;
import java.util.HashSet;

public class Massagist extends Employee {

    Massagist(String NAME, int EXP){ name = NAME; experience = EXP; }

    HashSet<Client> massagistClients = new HashSet<>();

    public int addMassageSession(String clientName, int massageSession) {
        for (Client client : massagistClients) {
            if (client.name.equals(clientName)) {
                client.massageSessions += massageSession;
                return 0;
            }
        }
        return -1;

    }

    public void addMassagistClient (String clientName){
        Client newClient = new Client(clientName);
        massagistClients.add(newClient);
    }

    public void deleteMassagistClient (String clientName){
        Client newClient = new Client(clientName);
        massagistClients.remove(newClient);
    }



}
