/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hash_Encryption;

/**
 *
 * @author jgigl16
 * 
 * 
 */
import java.io.*;
import java.util.*;
//import Hash_Encryption.StringToke1;
public class HashAlgorithm {
    
    //StringTokenizer st;
    static Scanner scan = new Scanner(System.in);
    static String fileName;
    static String fileLocation;
    static StringToke1 st = new StringToke1();
   
    
    public static void main(String[] args) {
        System.out.println("EnterFileNAME: \n");
        fileName = scan.nextLine();
        fileLocation = "C:\\Users\\jgigl16\\Documents\\NetBeansProjects\\HashEncryption\\src\\" + fileName;
        File file = new File(fileLocation);
        try {
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String s;
            br.readLine();
            
            while ((s = br.readLine()) != null) {
                //System.out.println(s); -> Will directly Print
                System.out.println();
                st.Tokenize(s);
            }
            System.out.println();
            System.out.println(st);
            
            
        } catch (IOException e) {
            System.out.println("File Not Found!");
        }
        
        
    }
    
    
}
