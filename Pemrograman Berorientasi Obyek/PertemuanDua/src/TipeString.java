/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zeerafle
 */
public class TipeString {
    public static void main(String [] args){
        String msg = "Welcome to Java";
        
        // Bisa juga dibuat dari collection of character
        char[] charArray = {'j','a','v','a'};
        String newMsg = new String(charArray);
        
        System.out.println(msg);
        System.out.println(charArray);
        System.out.println(newMsg);
    }
    
}
