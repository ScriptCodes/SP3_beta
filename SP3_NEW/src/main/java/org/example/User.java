package org.example;

public class User {

    private String username;
    private String password;
    private boolean isAdmin;

    public User(String username, String password, boolean isAdmin){

        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;

    }
    public void createUser(String uInput, String pInput){
        

//Create new file.txt for both Watch Later and My List
    }
    public void setUsername(String username){
        this.username = username;

    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setIsAdmin(boolean isAdmin){
        this.isAdmin = isAdmin;

    }
    public String getUsername(){

        return username;
    }
    public String getPassword(){

        return password;
    }
    public boolean getIsAdmin(){

        return isAdmin;
    }


    @Override
    public String toString(){

        return username +","+password+","+ isAdmin;
    }
}
