package Gryshchenko.HW9;

import java.util.HashMap;

public class Client extends Human{

    int massageSessions;
    HashMap<String, Integer> traningWithCoach = new HashMap<>();

    Client(){
        name = "No Name";
        massageSessions = 0;
    }


}
