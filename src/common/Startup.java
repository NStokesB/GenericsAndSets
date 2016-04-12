package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Startup {

    public static void main(String[] args) {
//        Address a1 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        Address a2 = new Address("0234 Street", "Milwaukee", "222-222-2222");
//        Address a3 = new Address("9234 Street", "Milwaukee", "222-222-2222");
//        Address a4 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        
//        Set set = new HashSet();
//        set.add(a1);
//        set.add(a2);
//        set.add(a3);
//        set.add(a4);
//        
//        for(Object address : set) {
//            System.out.println(address);
//        }
        
//        System.out.println(a1);
//        System.out.println(a2);

//        if (a1.equals(a2)) {
//            System.out.println("The addresses are equal");
//        } else {
//            System.out.println("The addresses are NOT equal");
//        }

        Employee e1 = new Employee("Doe", "John", "111-11-1111");
        Employee e2 = new Employee("Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee("Mallay", "Fred", "222-22-2222");
        Employee e4 = new Employee("Evans", "Bob", "333-33-3333");
        
         Map<String, Employee> map = new HashMap<>();
        map.put("111-11-1111", e1);
        map.put("111-11-1111", e2);
        map.put("222-22-2222", e3);
        map.put("333-33-3333", e4);
        
        Employee emp = map.get("333-33-3333");
        System.out.println(emp);
        
        System.out.println("\nLooping over keys....");
        Set<String> keys = map.keySet();
        for(String key : keys) {
            Employee found = map.get(key);
            System.out.println(found.toString());
        }
        
        System.out.println("\nLooping over values....");
       
        Collection<Employee> values = map.values();
        for(Employee key : values) {
            System.out.println(key);
        }
        
//        Map<Employee, Integer> map2 = new TreeMap<>();
//        map2.put(e1,1);
//        map2.put(e2,3);
//        map2.put(e3,2);
//        map2.put(e4,4);
               
//        Set<Employee> set = new TreeSet<Employee>();
//        set.add(e1);
//        set.add(e2);
//        set.add(e3);
//        set.add(e4);
      
    }
}

