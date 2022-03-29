/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zeerafle
 */
public class ArrayInitiallization {
    public static void main(String[] args){
        // automatic
        double[] myList = {2,5,6,8};
        System.out.println(myList[0]);
        
        // manual
        double[] myList2 = new double[2];
        myList2[0] = 1.9;
        myList2[1] = 2.3;
        System.out.println(myList2[0]);
        
        // example of array data char type
        char[] city = {'S','a','m','a'};
        System.out.println(city);
        
        // array of string
        String[] name = {"Amita", "Sabal", "Pagan"};
        System.out.println(name[0]);
        System.out.println(name[1]);
    }
}
