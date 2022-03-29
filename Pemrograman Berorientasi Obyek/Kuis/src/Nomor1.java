/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zeerafle
 */
public class Nomor1 {
    public static void main(String[] args){
        int j, k, s = 8, batas = 32;
        for (int i=1; i<batas; i*=2){
            for (int jarak=s; jarak>0; jarak--){
                System.out.print(" ");
            }
            System.out.print("1 ");
            
            for (j=2; j<=i; j*=2){
                System.out.print(j + " ");
            }
            
            j = j/2;
            for (k=j/2;k>=2;){
                System.out.print(k + " ");
                k = k/2;
            }
            
            if (i>1){
                System.out.print("1");
            }
            System.out.println();
            s -= 2;
        }
    }
}
