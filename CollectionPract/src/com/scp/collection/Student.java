package com.scp.collection;

public class Student implements Comparable<Student>
{
	int studId;
	String studName;
	
	public Student() 
	{
		super();
	}
	
	public Student(int studId, String studName) 
	{
		super();
		this.studId = studId;
		this.studName = studName;
	}
	
	@Override
	public String toString() 
	{
		return "\nStudent [studId=" + studId + ", studName=" + studName + "]";
	}

	public int getStudId() 
	{
		return studId;
	}

	public void setStudId(int studId) 
	{
		this.studId = studId;
	}

	public String getStudName() 
	{
		return studName;
	}

	public void setStudName(String studName) 
	{
		this.studName = studName;
	}

	@Override
	public int compareTo(Student o) 
	{
		return this.getStudId()-o.getStudId();
		//return this.getStudName().compareTo(o.getStudName());
	}

}
