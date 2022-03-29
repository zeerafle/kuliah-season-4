/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zeerafle
 */
public class NomorSatu {
    public static void main(String[] args){
        for (int i=1; i<=7; i+=2){
            int c = 1;
            for (int j=1; j<=i; j++){
                System.out.print(c + " ");
                c = c * (i - j)/j;
                System.out.println(Integer.toString(c) + Integer.toString(i-j) + Integer.toString((i - j)/j));
            }
            System.out.println();
        }
    }
}
