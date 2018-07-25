package com.scp.list;

import java.util.*;

public class CollectionBasics 
{

	public static void main(String[] args) 
	{
		List<Integer> li1 = new ArrayList<>();
		List<Integer> li2 = new ArrayList<>();
HashSet<Object> h=new HashSet<>();
		h.add(li1);
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(40);
		li1.add(50);
		
		System.out.println("list1 "+li1);
		
		li2.add(60);
		li2.add(10);
		li2.add(80);
		
		System.out.println("list2 "+li2);
		
		li2.addAll(li1);
		System.out.println("list2 after addAll "+li2);
		
		li2.retainAll(li1);
		System.out.println("list2 after retainAll "+li2);
		
		/*li2.removeAll(li1);
		System.out.println("list2 after removeAll"+li2);*/
	}

}
