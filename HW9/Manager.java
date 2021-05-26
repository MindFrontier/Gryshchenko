package Gryshchenko.HW9;

import java.util.HashSet;
import java.util.Set;

public class Manager extends Human{

    public Set<Client> clients = new HashSet<>();
    public Set<Coach> coaches = new HashSet<>();
    public Set<Massagist> massagists = new HashSet<>();

    public int addMassageSession(String clientName, int massageSession) {
        for (Client client : clients) {
            if (client.name.equals(clientName)) {
                client.massageSessions + massageSession;
                return 0;
            }
        }
        return -1;
    }

    public  int addTraningWithCoach(String clientName, String coachName, int coachingSessions) {
        for (Coach coach : coaches) {
            if (coach.name.equals(coachName)) {
                coach.addTraningWithCoach(clientName, coachingSessions);
                return 0;
            }
        return -1;

    }

    public void addClient(String clientName){
        Client newClient = new Client(clientName);
        clients.add(newClient);
    };

    public void deleteClient(String clientName){
        Client newClient = new Client(clientName);
        clients.remove(newClient);
    };
}
