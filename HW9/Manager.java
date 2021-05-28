package Gryshchenko.HW9;

import java.util.HashSet;
import java.util.Set;

public class Manager extends Human {

    Manager(String NAME) {
        name = NAME;
    }

    public Set<Client> clients = new HashSet<>();
    public Set<Coach> coaches = new HashSet<>();
    public Set<Massagist> massagists = new HashSet<>();

    public int addMassageSession(String clientName, int massageSession) {
        for (Massagist massagist : massagists) {
            if (massagist.massagistClients.contains(clientName)) {
                massagist.addMassageSession(clientName, massageSession) ;
                return 0;
            }
        }
        return -1;
    }

    public int addClientToCoach (String coachName, String clientName) {
        for (Coach coach : coaches) {
            if (coach.name.equals(coachName)) {
                coach.addCoachClient(clientName);
                return 0;
            }
        }
        return -1;
    }

    public int deleteClientFromCoach(String coachName, String clientName) {
        for (Coach coach : coaches) {
            if (coach.name.equals(coachName)) {
                coach.deleteCoachClient(clientName);
                return 0;
            }
        }
        return -1;
    }

    public int addClientToMassagist(String massagistName, String clientName) {
        for (Massagist massagist : massagists) {
            if (massagist.name.equals(massagistName)) {
                massagist.addMassagistClient(clientName);
                return 0;
            }
        }
        return -1;
    }

    public int deleteClientFromMassagist(String massagistName, String clientName) {
        for (Massagist massagist : massagists) {
            if (massagist.name.equals(massagistName)) {
                massagist.deleteMassagistClient(clientName);
                return 0;
            }
        }
        return -1;
    }

    public int addTraningWithCoach( String coachName, String clientName, int coachingSessions) {
        for (Coach coach : coaches) {
            if (coach.name.equals(coachName)) {
                coach.addTraningWithCoach(coachName, clientName, coachingSessions);
                return 0;
            }
        }
        return -1;
    }

    public void addClient (String clientName){
        Client newClient = new Client(clientName);
        clients.add(newClient);
    }

    public void deleteClient (String clientName){
        Client newClient = new Client(clientName);
        clients.remove(newClient);
    }

    public void addCoach (String coachName,int coachExperience){
        Coach coach = new Coach(coachName, coachExperience);
        coaches.add(coach);
    }

    public void deleteCoach (String coachName, int coachExperience){
        Coach coach = new Coach(coachName, coachExperience);
        coaches.remove(coach);
    }

    public void addMassagist (String massagistNaname,int massagistExperience){
        Massagist massagist = new Massagist(massagistNaname, massagistExperience);
        massagists.add(massagist);
    }

    public void deleteMassagist (String massagistNaname,int massagistExperience){
        Massagist massagist = new Massagist(massagistNaname, massagistExperience);
        massagists.remove(massagist);
    }

}