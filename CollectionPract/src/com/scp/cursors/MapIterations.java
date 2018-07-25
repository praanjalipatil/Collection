package com.scp.cursors;

import java.util.HashMap;
import java.util.Map;

public class MapIterations {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hmap = new HashMap<>();
		System.out.println(hmap.put(1, "value1"));
		System.out.println(hmap.put(2, "value2"));
		System.out.println(hmap.put(1, "value3"));
		System.out.println(hmap.put(4, "value4"));
		System.out.println(hmap.put(2, "value2"));
		
		System.out.println("Size of hmap : "+hmap.size());
		System.out.println("Contents of hmap : "+hmap);
		
		System.out.println("----------Iterating HashMap----------");
		for (Integer in : hmap.keySet()) 
		{
			System.out.println("Key : "+in);
		}
		for (String value : hmap.values()) 
		{
			System.out.println("Value : "+value);
		}
		
		for (Map.Entry<Integer, String> entry : hmap.entrySet()) 
		{
			System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
		}

	}

}
