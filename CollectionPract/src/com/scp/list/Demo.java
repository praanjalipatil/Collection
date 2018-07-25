package com.scp.list;

public class Demo {

	public static void main(String[] args) {
		Empl e = new Empl();
		System.out.println(e);
		System.out.println(e.hashCode());
		System.out.println(e.toString());

	}
}
class Empl
{
	int id=10;
	String name="abc";
	
}
