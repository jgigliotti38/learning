/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory_Updater;

/**
 *
 * @author jgigl16
 */
import java.util.*;
public class Tokenizer {
    
    String input;
    final String DELIM = ",";
    int productColumn;
    
    int keyMarker;
    StringTokenizer st;
    //Inventory_Map inMap = new Inventory_Map();
    /*
    String ProductKey;
    ProductInfo values;
    Map<String, ProductInfo> inMap = new HashMap<>();
    */
    public void TokenizeAll(String input) {
        
        this.input = input;
        st = new StringTokenizer(input,DELIM);
        //Print(st);      
    } // tokenizes a string input
    
    @Override
    public String toString() {
        String t = "String has been Tokenized";
        return t;
    }
    
    public static void Print(StringTokenizer st) {
       while (st.hasMoreTokens()) {
           String info = st.nextToken();
           System.out.println(info);
       }
    } //Prints entire Tokenized object
    
    public void findColumn (String input, String name) {
        int count = 1;
        st = new StringTokenizer(input, DELIM);
        while (st.hasMoreTokens()) {
            if (!st.nextToken().equals(name)) {
                count++;
            }
            else {
                System.out.println(name + " column is: " + count);
                if (name.equals("Product Name")) {
                    productColumn = count;
                    System.out.println("COUNT IS " + productColumn);
                }
            }
        }

    } //Finds column numbers based on input
    
    public void findProductNames (String input) {

        st = new StringTokenizer(input, DELIM); 
            for (int i = 0; i < (productColumn-1); i++) {
                st.nextToken();
            }
            String productName = st.nextToken();
            System.out.println(productName);
    }
    
}