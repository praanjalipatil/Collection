package com.scp.collection;

import java.util.Comparator;

public class StudentNameSort implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2) 
	{
		return s1.getStudName().compareTo(s2.getStudName());
	}

}
