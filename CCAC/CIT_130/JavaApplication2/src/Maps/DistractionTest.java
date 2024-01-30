/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maps;

/**
 *
 * @author jgigl16
 */
import java.util.*;

public class DistractionTest {
    
    public static void main(String[] args) {
        HashMap<String, String> answers = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String input; 
        int Score;
        
        //Hardcoded answer Map
        answers.put("Dog", "Cat");
        answers.put("Plane" , "Golf");
        answers.put("Buffalo Bill", "Building");
        answers.put("Africa", "Toto");
        answers.put("Knuckles", "da Way");
        Set<String> set = answers.keySet();
        String[] ansKey = (String[]) set.toArray();
        
        
        for (int i = 0; i <= answers.size(); i++) {
            //System.out.println(answers. + " knows " +  );
            System.out.println("");
            input = scan.next();
        }
    }
    
}
