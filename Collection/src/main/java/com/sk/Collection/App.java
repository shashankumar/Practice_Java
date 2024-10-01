package com.sk.Collection;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;


/**
 * Hello world!
 *
 */
public class App 
{
	 int start;
	  	int end;
    public static void main( String[] args )
    {
    	System.out.println(System.getProperty("user.home"));
    	Path p = Paths.get("user/home");
    	System.out.println(p.getFileName().toString());
        System.out.println( "Hello World!" );
        ArrayList<Integer> ar = new ArrayList(20);
        ar.add(1);
        ar.add(2);
        ar.add(3);
        for (Integer in : ar) {
			System.out.println(in);
		}
        Integer integer = ar.get(2);
        System.out.println(integer);
        
        ListIterator<Integer> iterator = ar.listIterator();
        while (iterator.hasNext()) {
			Integer nt = (Integer) iterator.next();
			System.out.println(nt);
			
		}
        while (iterator.hasPrevious()) {
			Integer i2 = (Integer) iterator.previous();
			System.out.println(i2);
			
		}
        
        Set set = new HashSet();
        set.add("1");
        boolean c = set.add("Anuradha");
        boolean b = set.add("Shashank");
        boolean a = set.add("Anuradha");
        for (Object object : set) {
			System.out.println(object);
		}
       
        System.out.println(c+" "+b);
        System.out.println(set);
        
        Set tset = new TreeSet<>();
        
        tset.add("ShashankT");
        tset.add("AnuradhaT");
        tset.add("AnuradhaT");
       
      App.rotetArray();
      
    }
   
    public static void rotetArray() {
    	int arr[] = {1,2,3,4,5};
    	App a= new App();
    	for (int i = 0; i < arr.length-1; i++) {
			System.out.print(i+" ");
			a.start = arr[arr.length-1];
			arr[i]=arr[i+1];
			a.start++;
		}
    	
    	for (int i = 0; i < arr.length; i++) {
			System.out.println(i);
		}
    	
    	
    }
}
