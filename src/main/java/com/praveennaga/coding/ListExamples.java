package com.praveennaga.coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class ListExamples
{
    public static void main( String[] args )
    {
        ArrayList al= new ArrayList();
        al.add(12);
        al.add(null);
        al.add(null);
        al.add(34);
        
        
        
        System.out.println(al);
        LinkedList ll= new LinkedList(al);
        System.out.println(ll);
      
        
        HashSet hs= new HashSet();
        hs.add(12);
        hs.add(null);
        hs.add(null);
        hs.add(34);
        
        System.out.println(hs);
        
        LinkedHashSet lhs= new LinkedHashSet();
        
        lhs.add(12);
        lhs.add(null);
        lhs.add(null);
        lhs.add(34);
        
        System.out.println(lhs);
        
        
        /* This is how to declare HashMap */
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        /*Adding elements to HashMap*/
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");
        
    
        for (Map.Entry me : hmap.entrySet()) {
            System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
          }
        
        Map<Integer, String> map = new TreeMap<Integer, String>(hmap); 
        System.out.println("After Sorting:");
        
        for (Map.Entry me : map.entrySet()) {
            System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
          }
        
        ArrayList alhmkey= new ArrayList(map.keySet());
        
        System.out.println(alhmkey);
        
        ArrayList alhmvalue= new ArrayList(map.values());
        
        System.out.println(alhmvalue);
        
        
        
    }
}
