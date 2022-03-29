/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zeerafle
 */

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        
        System.out.print("Masukkan angka : ");
        try {
            number = input.nextInt();
            System.out.println(number);        
        } catch (Exception e) {
            System.out.println("Salah input woy " + e.toString());
        }
    }
    
}
