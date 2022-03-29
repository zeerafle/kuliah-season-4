/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zeerafle
 */
public class NomorDua {
    public static void main(String[] args){
        int biaya = 800000;
        int tujuan = 2 * biaya;
        int tahun = 1;
        System.out.println("Uang semester awal Rp" + biaya);
        
        while (biaya <= tujuan){
            int bunga = biaya * 5/100;
            biaya = biaya + bunga;
            tahun++;
        }
        
        System.out.println("Uang semester mencapai Rp" + tujuan + " dengan bunga 5% pada tahun ke-" + tahun);
    }
}
