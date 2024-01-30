/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hash_Encryption;

/**
 *
 * @author jgigl16
 */
import java.util.*;
public class StringToke1 {
    
    String input;
    String delim = ",";
    StringTokenizer st;
    
    public void Tokenize(String input) {
        
        this.input = input;
        st = new StringTokenizer(input, delim);
        Print(st);
        
       
    }
    @Override
    public String toString() {
        String t = "String has been Tokenized";
        return t;
    }
    public static void Print(StringTokenizer st) {
       while (st.hasMoreTokens()) {
           System.out.println(st.nextToken());
       }
    }
    
}