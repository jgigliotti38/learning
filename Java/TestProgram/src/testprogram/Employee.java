/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprogram;

/**
 *
 * @author giggysmalls
 */
public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    //CONSTRUCTORS
    public Employee(String str1, int x, String str2, String str3) {
        name = str1;
        idNumber = x;
        department = str2;
        position = str3;
    }
    public Employee(String str1, int x) {
        name = str1;
        idNumber = x;
        department = "";
        position = "";
    }
    public Employee() {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }
    
    //MUTATOR METHODS
    public void setName(String str) {
        name = str;
    }
    public void setIdNumber(int x) {
        idNumber = x;
    }
    public void setDepartment(String str) {
        department = str;
    }
    public void setPosition(String str) {
        position = str;
    }
    
    //ACCESSOR METHODS
    public String getName() {
        return name;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public String getDepartment() {
        return department;
    }
    public String getPosition() {
        return position;
    }
    
    //DISPLAYS ALL CLASS INFORMATION
    public void DisplayAll() {
        System.out.println("\n\n"+getName());
        System.out.println(getIdNumber());
        System.out.println(getDepartment());
        System.out.println(getPosition());
    }
    
    
}
