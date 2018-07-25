package com.scp.cursors;

import java.util.*;
import java.util.Map.Entry;

public class CollectionIterations 
{
	public static void main(String[] args) 
	{
		HashMap<Employee, String> mapOfEmps = getDummyData(10);
		System.out.println("Size of mapOfEmps : "+mapOfEmps.size());
		System.out.println("Content of mapOfEmps : \n"+mapOfEmps);	
		
		Employee emp1 = retriveKeyBasedOnvalue("Employee22",mapOfEmps);
		System.out.println("Employee22 has key "+emp1);
		
		Set<Employee> empKeys = mapOfEmps.keySet();
		usingIterator(empKeys);
		
		Collection<String> empValues = mapOfEmps.values();
		List<String> list = new ArrayList<>(empValues);
		usingListIterator(list);
		
		Vector<Employee> v = new Vector<>(empKeys);
		usingEnumaration(v);

	}

	private static void usingIterator(Collection<Employee> c) 
	{		
		System.out.println("\n-----Using Iterator "+c.getClass()+"-----");
		Iterator<Employee> itr = c.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	private static void usingListIterator(List li) 
	{		
		System.out.println("\n-----Using ListIterator "+li.getClass()+"-----");
		ListIterator<Employee> listItr = li.listIterator();
		while(listItr.hasNext())
		{
			System.out.println(listItr.next());
		}
	}
	
	private static  void usingEnumaration(Object ob)
	{
		System.out.println("\n-----Using Enumeration "+ob.getClass()+"-----");
		Enumeration<Object> enumM;
		if(ob instanceof Vector)
		{
			 Vector<Object> v = (Vector<Object>)ob;
			 enumM= v.elements();
			 while(enumM.hasMoreElements())
			 {
				 System.out.println(enumM.nextElement());
			 }
		 }
		else if(ob instanceof Hashtable)
		{
			 Hashtable<Object, Object> ht = (Hashtable<Object, Object>) ob;
			 enumM= ht.elements();
			 while(enumM.hasMoreElements()){
				 System.out.println(enumM.nextElement());
			 }
		 }
		else
		{
			 System.out.println("\nIts not object of Legacy Class.. Can't Enumerate..");
		 }
	}

	private static HashMap<Employee, String> getDummyData(int noOfEmps) 
	{
		HashMap<Employee, String> hmap = new HashMap<>();
		for(int i=1; i<=noOfEmps; i++)
		{
			hmap.put((new Employee(i,"e"+i)), "  Employee"+i);
		}
		
		System.out.println(hmap.get(new Employee(1,"e1")));
		
		hmap.put(new Employee(2, "e2"), "Employee22");
		hmap.put(new Employee(5, "e55"), "Employee55");
		hmap.put(new Employee(7, "e7"), "Employee77");
		
		System.out.println(hmap.get(new Employee(2,"e2")));
		System.out.println(hmap.get(new Employee(5,"e55")));
		System.out.println(hmap.get(new Employee(7,"e7")));
		
		return hmap;
	}	
	
	private static Employee retriveKeyBasedOnvalue(String val, HashMap<Employee, String> mapOfEmps) 
	{
		Set<Entry<Employee, String>> entrySet = mapOfEmps.entrySet();
		Iterator<Entry<Employee, String>> entryItr = entrySet.iterator();
		while(entryItr.hasNext())
		{
			Entry<Employee, String> entry = entryItr.next();
			if(entry.getValue().equals(val))
			{
				return entry.getKey();
			}
		}
		return null;
	}
	
}