/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdiagrams.patternprinting;

/**
 *
 * @author jgigl16
 */
public class CoolShapeMaker implements PyramidPrinter{
    final String SIDE_UNIT_CHAR = "#@";
    final String SPACE = "";
    
    @Override
    public void printAPyramid(int baseSize) {
        int sizeChange = baseSize;
        for (int count = 0; count < baseSize; count++) {
            
            for (int i = 0; i < sizeChange; i++) {
                for (int j = 0; j < sizeChange; j++ ) {
                    
                }
                System.out.print(SIDE_UNIT_CHAR);
            }//For loop to decrement Pyramid
            
            sizeChange--;
            System.out.println("");
        }//For loop to count Pyramid size
    }//end method implementation
}
