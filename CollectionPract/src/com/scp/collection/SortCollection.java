package com.scp.collection;

import java.util.*;

public class SortCollection 
{
	public static void main(String[] args) 
	{
		System.out.println("List of Integers -->");
		List<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(7);
		numList.add(3);
		numList.add(1);
		numList.add(0);
		System.out.println("Unsorted List : "+numList);
		Collections.sort(numList);
		System.out.println("Sorted List : "+numList);
		
		System.out.println("\nList of Strings -->");
		List<String> strList = new ArrayList<>();
		strList.add("zb");
		strList.add("sc");
		strList.add("GX");
		strList.add("Gc");
		strList.add("7f");
		System.out.println("Unsorted List : "+strList);
		Collections.sort(strList);
		System.out.println("Sorted List : "+strList);
		
		Student st1 = new Student(11,"stud11");
		Student st2 = new Student(22,"stud22");
		Student st3 = new Student(33,"stud33");
		Student st4 = new Student(44,"stud44");
		Student st5 = new Student(55,"stud55");
		
		System.out.println("\nList of Students -->");
		List<Student> studList = new ArrayList<>();
		studList.add(st4);
		studList.add(st1);
		studList.add(st5);
		studList.add(st4);
		studList.add(st2);
		studList.add(st3);
		
		System.out.println("Unsorted List : "+studList);
				
		System.out.println("\n--Comparable--");
		Collections.sort(studList);
		System.out.println("Sorted List : "+studList);
		
		System.out.println("\n--Comparator StudentIdSort--");
		Collections.sort(studList,new StudentIdSort());
		System.out.println("Sorted List : "+studList);
		
		System.out.println("\n--Comparator StudentNameSort--");
		Collections.sort(studList,new StudentIdSort());
		System.out.println("Sorted List : "+studList);

	}
}


