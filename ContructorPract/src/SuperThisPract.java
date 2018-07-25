//import SuperThisDemo.Child1;

public class SuperThisPract 
{
	int var=1;
	int num;
	/*static*/ final int fnum;

	public SuperThisPract() 
	{
		super();
		fnum=100;
		//this(); //recursive constructor invocation not allowed
		
		int no=20;
		System.out.println("no="+no);
		System.out.println("inside default constructor");
		
		//return 0;
	}
	
	public SuperThisPract(int i) 
	{
		super();
		fnum=200;
		//super(5); //constructor Object(int) not defined
		num=i;
		//super();
		System.out.println("i="+i);
		System.out.println("inside parameterised constructor");
		//return i;
	}

	public static void main(String[] args) 
	{
		SuperThisPract obj1 = new SuperThisPract();
		SuperThisPract obj2 = new SuperThisPract(10);
		
		Child1 c = new Child1();
	}

}

class Child1 extends SuperThisPract
{
	int var=2;
	
	Child1()
	{
		System.out.println("super var="+super.var);
		System.out.println("child var="+this.var);
	}
}

