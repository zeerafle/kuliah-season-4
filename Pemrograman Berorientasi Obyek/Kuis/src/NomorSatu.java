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
//        int baris = 5;
//        int c = 1;
//        
//        for (int i=0; i<baris; i++){
//            for (int ak=0; ak<=baris; ak++){
//                System.out.print(" ");
//            }
//            for (int j=0; j<=i; j++){
//                if (j==0|i==0){
//                    c = 1;
//                } else {
//                    c = c * (i-j+1)/j;
//                }
//                System.out.print(" "+c);
//            }
//            System.out.println();
//        }

        for (int i=1; i<=5; i++){
            int c = 1;
            for (int j=1; j<=i; j++){
                System.out.print(c + " ");
                c = c * (i - j)/i;
            }
            System.out.println();
        }
    }
}
