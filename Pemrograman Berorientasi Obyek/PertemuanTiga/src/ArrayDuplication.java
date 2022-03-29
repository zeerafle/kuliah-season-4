/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zeerafle
 */
public class ArrayDuplication {
    public static void main(String[] args){
        // Incorrect way
        int[] sourceArray = {2,3,4,5,2};
        int[] targetArray;
        targetArray = sourceArray; // targetArray akan mengarah ke sourceArray, tidak menduplikasi
        
        // Correct way
        int[] targetArrayCorrect = new int[5];
        for (int i=0; i<5; i++){
            targetArrayCorrect[i] = sourceArray[i];
        }
    }
}
