
public class TestBlocks 
{
	public static void main(String[] args) 
	{
		/*Parent p = new Parent();
		p.instanceMethod();
		Parent.staticMethod();*/
		
		System.out.println("inside main");
		
		Child c = new Child(10);
		c.instanceMethod();
		Child.staticMethod();
	}
}

class Parent
{
	int parentId;
	static int stParentId;
	
	Parent()
	{
		System.out.println("inside parent's default contructor");
	}
	
	Parent(int parentId)
	{
		System.out.println("inside parent's parameterised contructor");
	}
	
	static
	{
		System.out.println("inside parent's static block");
	}
	
	{
		System.out.println("inside parent's instance block");
	}
	
	public void instanceMethod()
	{
		System.out.println("inside parent's instance method");
	}
	
	static void staticMethod()
	{
		System.out.println("inside parent's static method");
	}
}

class Child extends Parent
{
	int childId;
	static int stChildId;
	
	Child(int childId)
	{
		System.out.println("inside child's parameterised contructor");
	}
	
	static
	{
		System.out.println("inside child's static block");
	}
	
	{
		System.out.println("inside child's instance block");
	}
	
	public void instanceMethod()
	{
		System.out.println("inside child's instance method");
	}
	
	static void staticMethod()
	{
		System.out.println("inside child's static method");
	}
}
