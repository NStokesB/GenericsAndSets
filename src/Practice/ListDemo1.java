/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author NStokesBeamon
 */
public class ListDemo1 {
    public static void main(String[] args) {
        Set<String>shoppingList = new HashSet<>();
        shoppingList.add("Beer");
        shoppingList.add("Chips");
        shoppingList.add("Beer");
        shoppingList.add("Nuts");
        
//        Iterator<String> it = shoppingList.iterator();
//        while(it.hasNext()){
//            String item =it.next();
//            System.out.println(item);
//        }
        
        for(String s : shoppingList){
            System.out.println(s);
        }
        
//       for(int i = 0; i < shoppingList.size(); i++){
//           String item = shoppingList.get(i);
//           System.out.println(item);
//       }
    }
}
