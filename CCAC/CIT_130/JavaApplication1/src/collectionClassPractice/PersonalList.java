/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionClassPractice;

/**
 *
 * @author jgigl16
 */
import java.util.LinkedList;
import java.util.Scanner;
import collectionClassPractice.FootballPlayer;

public class PersonalList {
    
    
    
    
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    LinkedList list = new LinkedList<FootballPlayer>();
    
    
    boolean exit = false;
    System.out.println("WELCOME! \n\nFootball List \n\nSelect an Option:");
    displayMenu();
    
    while (!exit) {
        int selection = scan.nextInt();
        
        if (selection == 0) {
            exit = true;
        }// exit program
       
        else if (selection == 1) {
            if (list.isEmpty()) {
                System.out.println("Your list is EMPTY!!!!");
            }
            else {
                System.out.println("NOT EMPTY");
            }
        }
        else if (selection == 2) {
            FootballPlayer player = new FootballPlayer();
            System.out.println("Enter Name: ");
            player.playerName = scan.next();
            System.out.println("Enter Number: ");
            player.playerNumber = scan.nextInt();
            System.out.println("Enter Position: ");
            player.position = scan.next();
            
            list.add(player);
            displayMenu();
        }
        else if (selection == 3) {
            //FootballPlayer player = new FootballPlayer();
            list.peek();
            System.out.println("Player Name: " + FootballPlayer.playerName);
            System.out.println("Number: " + FootballPlayer.playerNumber);
            System.out.println("Position: " + FootballPlayer.position);
            
            displayMenu();
        }
        else if (selection == 4) {
            list.remove();
            displayMenu();
        }
        else if (selection == 5){
            list.clear();
        }
        else {
            exit = true;
        }
        

        }

    
    }  
    
    public static void displayMenu() {
        System.out.println("1. CheckList \n2. Add Player info \n3. Peek \n4. Remove \n5. Clear List \n0. Exit \n\n");
    }
    
    //List of METHODS

    
}
