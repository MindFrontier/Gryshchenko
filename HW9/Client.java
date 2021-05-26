package Gryshchenko.HW9;

import java.util.HashMap;

public class Client extends Human{

    Client(String NAME){ name = NAME; }

    int massageSessions;
    HashMap<Coach, Integer> traningWithCoach = new HashMap<>();


}
