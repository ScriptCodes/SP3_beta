package org.example;

import java.util.ArrayList;

public class Streaming {
    ArrayList<User> users = new ArrayList<>();
    TextUI ui = new TextUI();
    Login login = new Login();

    public void setup(){
        login.login(users);

    }



}
