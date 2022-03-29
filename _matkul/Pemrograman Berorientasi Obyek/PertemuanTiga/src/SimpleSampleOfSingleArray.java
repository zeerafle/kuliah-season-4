/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zeerafle
 */
public class SimpleSampleOfSingleArray {
    public static void main(String[] args){
        final int numStd = 4;
        double[] gpa = new double[4];
        String[] name = {"Amita", "Sabal", "Pagan", "Ajay"};
        
        for (int i=0; i<numStd; i++){
            gpa[i] = 3 + ((double) i / 10);
        }
        
        System.out.printf("%-10s %4s\n", "Name", "GPA");
        for (int j=0; j<numStd; j++){
            System.out.printf("%-10s %1.2f\n", name[j], gpa[j]);
        }
    }
}
