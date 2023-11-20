package org.example;
import java.io.File;
import java.util.Scanner;

public class Menu {
TextUI ui = new TextUI();




public void loginMenu(){
    System.out.println("Welcome!");
    System.out.println("1.Login"+"\n"+"2.Create new user");
    String loginOptions = ui.getInput("");
    switch (loginOptions){
        case "1":
            
            break;
        case "2":
            break;
        default:
            System.out.println("None of the options was chosen");
    }

}
public void displayUserOptions(){
    System.out.println("What do you want to do?: ");
    System.out.println("1.Watch movie"+"\n"+"2.Watch series"+ "\n"+"3.Go to My List"+"\n"+"4.Go to Watch Later"+"\n"+"5.Display movies/series by genre"+"\n"+"6.Display admin options");


    String options = ui.getInput("");

switch (options){
    case "1":
        displayMovies();
        break;
    case "2":
        displaySeries();
        break;
    case "3":
        displayMyList();
        break;
    case "4":
        displayWatchLater();
    case "5":
        displayByGenre();
        break;
    case "6":
        displayAdminOptions();
        break;
    default:
        System.out.println("None of the options was selected");

}




}


public void displayMyList(){


}


public void displayWatchLater(){

}


public void displaySeries(){


}

public void displayMovies(){


}


public void displayByGenre(){


}


public void displayAdminOptions(){

    File file = new File("src/main/java/org/example/100bedstefilm.txt");
   String aInput = ui.getInput("");




}

}
