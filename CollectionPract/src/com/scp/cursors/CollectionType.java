package com.scp.cursors;

import java.util.*;
import java.util.Map.Entry;

public class CollectionType 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(10, "abc");
		Employee e2 = new Employee(20, "prq");
		Employee e3 = new Employee(30, "xyz");
		Employee e4 = new Employee(20, "lmn");
		Employee e5 = e1;
		
		HashMap<Employee, String> hmap = new HashMap<>();
		
		hmap.put(e1, "emp1");	//null
		hmap.put(e2, "emp2");	//null
		hmap.put(e3, "emp3");	//null
		hmap.put(e4, "emp4");	//pqr
		hmap.put(e5, "emp5");	//abc
		
		System.out.println("Size of HashMap = "+hmap.size());
		System.out.println("Contents of HashMap : "+hmap);
		//10 abc|emp5     20 pqr|emp4     30 xyz|emp3
		
		System.out.println("\n-----Using keySet-----");
		Set<Employee> ekeys = hmap.keySet();
		Iterator<Employee> itrKey = ekeys.iterator();
		while(itrKey.hasNext())
		{
			Employee eKey = itrKey.next();
			String value = hmap.get(eKey);
			System.out.println("Key : "+eKey+"    "+"Value : "+value);
		}
		
		System.out.println("\n-----Using values-----");
		Collection<String> evalues = hmap.values();
		List<String> listOfVals = new ArrayList<String>(evalues);
		Iterator<String> itrVal = listOfVals.iterator();
		while(itrVal.hasNext())
		{
			System.out.println(itrVal.next());
		}
		
		System.out.println("\n-----Using entrySet-----");
		Set<Entry<Employee,String>> eEntries = hmap.entrySet();
		Iterator<Entry<Employee,String>> itrEntry = eEntries.iterator();
		while(itrEntry.hasNext())
		{
			Entry<Employee,String> entry = itrEntry.next();
			System.out.println("Key : " +entry.getKey()+"    "+"Value : " +entry.getValue());
		}
	
	}

}