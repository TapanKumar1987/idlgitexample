package com.test.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionTest {

	public static void main(String[] args) {
		
	/*
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
	      list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes"); 
	      Integer arr[] = new Integer[list.size()];
	        arr = list.toArray(arr);
	        int[] array = list1.stream().mapToInt(i->i).toArray();
	    
	      //Printing the arraylist object   
	     // List<String> lt=list.subList(1, 3);
	     // list.addAll(2,list1);
	      System.out.println(arr.toString());  
	      */
	      HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
	      map.put(1,"Mango");  //Put elements in Map  
	      map.put(2,"Apple");    
	      map.put(3,"Banana");   
	      map.put(4,"Grapes");   
	          
	      System.out.println("Iterating Hashmap...");  
	      for(Map.Entry m : map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());  
	      }
	      for(int m: map.keySet()){    
		       System.out.println(m);  
		      }
	}

}
