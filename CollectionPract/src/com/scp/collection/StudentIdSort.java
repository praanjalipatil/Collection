package com.scp.collection;

import java.util.Comparator;

public class StudentIdSort implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2) 
	{
		return (s1.getStudId()-s2.getStudId());
	}

}
