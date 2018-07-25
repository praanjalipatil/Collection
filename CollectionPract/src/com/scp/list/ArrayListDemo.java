package com.scp.list;
import java.util.*;

public class ArrayListDemo 
{
   public static void main(String args[]) 
   {
      // create an array list
      ArrayList list = new ArrayList();
      System.out.println("Initial size of list: " + list.size());

      // add elements to the array list
      list.add("Dinesh");
      list.add("Sweety");
      list.add("Adesh");
      list.add("Vinesh");
      list.add("Mom");
      list.add("DAD");
      
      System.out.println("Size of list after additions: " + list.size());

      // display the array list
      System.out.println("Contents of list: " + list);
     
       System.out.println("Iterating list");
       Iterator itr = list.iterator();
       while(itr.hasNext())
       {
           System.out.println(itr.next());
       }
       
       System.out.println("Iterating list using for each loop");
       for(Object obj : list)
       {
            System.out.println(obj);
       }
       
       ArrayList al2 = new ArrayList();
       al2.add("Adesh");
       al2.add("Vinesh");
       
       list.addAll(al2);  

       Iterator itrt=al2.iterator();
       while(itrt.hasNext()){
        System.out.println(itrt.next());
       }
   }
}
