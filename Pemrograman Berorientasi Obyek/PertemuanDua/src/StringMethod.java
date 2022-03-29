/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zeerafle
 */
public class StringMethod {
    public static void main(String [] args){
        String msg = "Welcome";
        
        // length()
        System.out.println(msg.length());
        
        // charAt()
        System.out.println(msg.charAt(4));
        
        // concat()
        String msg2 = "To";
        System.out.println(msg.concat(msg2));
        
        // substring()
        System.out.println(msg.substring(1, 5));
        
        // toLowerCase()
        System.out.println(msg.toLowerCase());
    }
    
}
