/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LocationMap;

/**
 *
 * @author jgigl16
 */
import java.util.*;

public class LocationMap {
    public static void main(String[] args) {
        Map<String, Integer> gps = new HashMap<String, Integer>();
        Scanner scan = new Scanner(System.in);
        String input; 
        Integer output;
        boolean exit = false;
        
        gps.put("Australia", 6786);
        gps.put("USA", 4000);
        
        System.out.println("There are " + gps.size() + " Things in this map.");
        System.out.println();
        while (!exit) {
            System.out.println("\nType Location you want to look for: "); 
            input = scan.next();
            if (input.equals("exit")) {
                exit = true;
                System.out.println("Goodbye");
            }
            else {
                output = gps.get(input);

                System.out.println("Location Coordinate is: " + output);
            }
        }
        
        int i = gps.hashCode();
        System.out.println("hashcod is: " + i + gps.keySet());
    }
}
