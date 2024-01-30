/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory_Updater;

/**
 *
 * @author jgigl16
 * 
 * 
 */
import java.io.*;
import java.util.*;
//import Hash_Encryption.Tokenizer;
public class Inventory_Updater {
    
    //StringTokenizer st;
    static Scanner scan = new Scanner(System.in);
    static String fileName;
    static String fileLocation;
    static Tokenizer st = new Tokenizer();
    static Tokenizer inMap = new Inventory_Map();
     
    final static String KEY_COLUMN_NAME = "Product No.";
    final static String PRODUCT_COLUMN_NAME = "Product Name";
    final static String CURRENT_INVENTORY_COLUMN_NAME = "Current Inventory";
    final static String PRICE_COLUMN_NAME = "Price($)";
    final static String COST_COLUMN_NAME = "Cost($)";
    final static String STARTING_INVENTORY_COLUMN_NAME = "Starting Inventory";
   
    
    public static void main(String[] args) {
        System.out.println("EnterFileNAME: \n");
        fileName = scan.nextLine();
        fileLocation = "C:\\Users\\jgigl16\\Documents\\NetBeansProjects\\Inventory_Updater\\" + fileName + ".csv";
        File file = new File(fileLocation);
        try {
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String s;
            String t;
            
            //******************************************************
            br.mark(1);
            st.findColumn(br.readLine(), KEY_COLUMN_NAME);
            br.reset();        
            st.findColumn(br.readLine(), PRODUCT_COLUMN_NAME);
            br.reset();
            st.findColumn(br.readLine(), CURRENT_INVENTORY_COLUMN_NAME);
            br.reset();
            st.findColumn(br.readLine(), PRICE_COLUMN_NAME);
            br.reset();
            st.findColumn(br.readLine(), COST_COLUMN_NAME);
            br.reset();
            st.findColumn(br.readLine(), STARTING_INVENTORY_COLUMN_NAME);
            br.reset();
            System.out.println();
            //****** SEARCHES COLUMNS FOR HEADERS
            
            br.readLine();
            while ((t = br.readLine()) != null) {
                st.findProductNames(t);
            }
            
            while ((s = br.readLine()) != null) {
                //System.out.println(s); //-> Will directly Print
                System.out.println();
                st.TokenizeAll(s); // Prints entire .csv file
            }
            System.out.println();
            //System.out.println(st); //"String has been Tokenized"
            
            
            
        } catch (IOException e) {
            System.out.println("File Not Found!");
        }
        
        
    }

    
}
