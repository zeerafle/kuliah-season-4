/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TwoDimensionalArray;

/**
 *
 * @author zeerafle
 */
public class SampleProcessing {
    public static void main(String[] args){
        int[][] array = { {1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9} };
        int total = 0;
        
        for (int row=0; row<3; row++){
            for (int col=0; col<3; col++){
                System.out.printf("%3d", array[row][col]);
                total += array[row][col];
            }
            System.out.println();
        }
        System.out.println("Total " + total);
    }
}
