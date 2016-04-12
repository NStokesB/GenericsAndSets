/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author NStokesBeamon
 */
public class EqualityDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        
        if (s1.equals(s2)){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Strings are NOT equal");
        }
       
    }
}
