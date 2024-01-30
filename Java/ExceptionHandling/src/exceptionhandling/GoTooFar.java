/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author giggysmalls
 * 
 * CIT 111 Project involving Exception Handling
 */
public class GoTooFar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] intArray = {1,2,3,4,5};
        
        try {
            //Code that displays intArray elements
            for (int i = 0; i <= intArray.length; i++) {
                System.out.println(intArray[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException tooLong) {
            System.out.println("Now you've gone too far!");
            
        }
    }
    
}
