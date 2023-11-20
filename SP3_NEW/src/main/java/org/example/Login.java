
package org.example;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    private static final String Filepath = "src/main/java/org.example/database.txt";
    private String usernameInput;
    private String passwordInput;
    FileIO io = new FileIO();
    TextUI ui = new TextUI();
    ArrayList<User> users = io.readUserData();
    public void login(ArrayList<User> uers) {
        Scanner scan = new Scanner(System.in);
        ui.displayMsg("Enter username");
        usernameInput = scan.nextLine();

        ui.displayMsg("Enter password");
        passwordInput = scan.nextLine();

        for (User user : users) {
            if (usernameInput.equalsIgnoreCase(user.getUsername()) && passwordInput.equals(user.getPassword())) {
                ui.displayMsg("You have succesfully logged in");

                if (user.getIsAdmin()) {
                    ui.displayMsg("You have admin features");
                }
                scan.close();
                return;
            }
        }

        ui.displayMsg("invalid username or password");
scan.close();
    }

}
