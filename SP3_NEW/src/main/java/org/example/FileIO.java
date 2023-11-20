package org.example;
import java.io.File;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileIO {

    public ArrayList<User> readUserData(){

        ArrayList<User> users = new ArrayList<>();

        File file = new File("src/main/java/org/example/database.txt");

        try {
            Scanner scan = new Scanner(file);
            scan.nextLine(); 
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                String [] userData = line.split(",");

                String username = userData[0].trim();
                String password = userData[1].trim();
                boolean isAdmin = Boolean.parseBoolean(userData[2].trim());

                User user = new User(username,password,isAdmin);
                users.add(user);
            }
        }catch (FileNotFoundException e){
            System.out.println("file not found");
        }
        return users;
    }
    public void saveUserData(ArrayList<User> users){
        try {
            Path filePath = Path.of("src/main/java/org.example/database.txt");
            if (!Files.exists(filePath)) {
                Files.createFile(filePath);
            }
            List<String> existingUsers = new ArrayList<>();
            for (User user : users){
                existingUsers.add(user.toString());
            }
            Files.write(filePath,existingUsers);
            } catch(IOException e){
            System.out.println("Error saving user data");
        }
    }
}
