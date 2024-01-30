/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program2;

/**
 *
 * @author giggysmalls
 */
import java.util.*;

public class Program2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String input = "";
        String compInput;
        int number;
        boolean flag = false;
        
        System.out.println("WELCOME!!\n****************************\n");
        //Runs Program until User chooses to Exit(ESC)
        do {
            //prevents the user from entering incorrect inputs and offers a way to leave program
            do {
                System.out.println("ENTER CHOICE or ENTER 'ESC':");
                input = scan.nextLine();
                input = input.toUpperCase();

            } while (!input.equals("ROCK") && !input.equals("PAPER") && !input.equals("SCISSOR") &&!input.equals("ESC"));

            if (!input.equals("ESC")) {
                compInput = computerResponse();
                System.out.println("\nYOU: "+input+"\t\tCOMPUTER: "+compInput);

                number = compareResponses(input,compInput);

                switch (number) {
                    case 1: System.out.println("YOU WON\n");
                        break;
                    case -1: System.out.println("COMPUTER WON\n");
                        break;
                    default: System.out.println("TIE\n");
                        break;
                }  
            }
            else {
                flag = true;
            }
        } while (flag == false);
    }
    
    //COMPUTER RESPONSE METHOD
    public static String computerResponse() {
        Random rand = new Random();
        String output;
        int num = (rand.nextInt(3)+1);
        switch (num) {
            case 1: output = "ROCK";
                break;
            case 2: output = "PAPER";
                break;
            case 3: output = "SCISSOR";
                break;
            default: output = "Invalid";
                break;
        }
        return output;
    }
    
    //TESTS YOUR RESPONSE WITH COMPUTER
    public static int compareResponses(String str1, String str2) {
        int number;
        if ( (str1.equals("ROCK")&&str2.equals("PAPER")) || (str1.equals("PAPER")&&str2.equals("SCISSOR")) ||
           (str1.equals("SCISSOR")&&str2.equals("ROCK")) ) {
               //LOSE
               number = -1;
           } 
           else if (str1.equals(str2)) {
               number = 0;
           }
           else {
               number = 1;
           }
        return number;
    }
    
}
