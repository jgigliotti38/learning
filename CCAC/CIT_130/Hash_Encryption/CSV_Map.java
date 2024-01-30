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

public class CSV_Map {
    
    Map<String, Coordinates> csvMap = new HashMap<>();
    
    public void CSV_Map(String key, Coordinates value) {
        
        csvMap.put(key,value);
    }
    
}
