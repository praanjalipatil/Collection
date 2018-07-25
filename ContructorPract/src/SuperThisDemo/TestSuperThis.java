package SuperThisDemo;

public class TestSuperThis 
{

	public static void main(String[] args) 
	{
		System.out.println("Inside main()");
		//Child c1 = new Child();
		Child c2 = new Child(20);
		Child c3 = new Child(30);

		
		Parent p1 = new Parent();
	}

}

class GrandParent
{
	final int var1=10;
	final int var2;
	
	GrandParent() 
	{
		var2=20;
		System.out.println("Inside GrandParent DC");
	}
	
	GrandParent(int a)
	{
		var2=20;
		System.out.println("Inside GrandParent PC");		
	}
}

class Parent extends GrandParent
{
	static final int pVar1;
	//final int pVar2;
	final int pVar3;

	
	static
	{
		pVar1 = 100;
		//p1.pVar2 = 200;
		
	}
	
	{
		pVar3 = 300;
	}
	
	Parent()
	{
		System.out.println("Inside Parent DC");		
	}
	
	Parent(int a)
	{
		System.out.println("Inside Parent PC");		
	}
}

class Child extends Parent
{
	
	/*Child()
	{
		System.out.println("Inside Child DC");		
	}*/
	
	final int cVar;
	
	Child(int a)
	{
		cVar = a;
		System.out.println("Inside Child PC");
		System.out.println("final cVar : "+ cVar);
	}
}
