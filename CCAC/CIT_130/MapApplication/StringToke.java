/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MapApplication;

/**
 *
 * @author jgigl16
 */
import java.util.*;
public class StringToke {
    
    public static void main(String[] args) {
        
        String test1 = "Hello People. This is a test";
        StringTokenizer st = new StringTokenizer(test1);
        stTest(st);
        
        
        System.out.println(st.toString());
    }
    public static void stTest(StringTokenizer st) {
       while (st.hasMoreTokens()) {
           System.out.println(st.nextToken());
       }
    }
    
}