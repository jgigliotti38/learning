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
public class ProductInfo {
    int productNum;
    String productName;
    float sellPrice;
    float unitCost;
    int inventoryAmount;
    
    public ProductInfo(int pNu, String pNm, float sP, float uC, int iA) {
        productNum = pNu;
        productName = pNm;
        sellPrice = sP;
        unitCost = uC;
        inventoryAmount = iA;
    }


}
