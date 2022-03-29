/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zeerafle
 */
public class ProcessingAnArray {
    public static void main(String[] args){
        // mencari nilai maksimum dari array
        double[] myList = {2,5,6,8};
        double max = myList[0];
        for (int i=1; i<myList.length; i++){
            if (myList[i] > max){
                max = myList[i];
            }
        }
        System.out.println(max);
        
        // sum
        double total = 0;
        for (int i=0; i<myList.length; i++){
            total += myList[i];
        }
        System.out.println(total);
    }
}
