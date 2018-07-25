
public class Demo 
{
	final int var;
	int no;

	public Demo()
	{
		var = 100;
		no=80;
		System.out.println("Default Constructor : "+"No="+no);
	}
	public Demo(int i) 
	{
		this();
		no = i;
		System.out.println("Parameterised Constructor : "+"No="+no);
	}

	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		Demo d2 = new Demo(10);
		System.out.println(d1.var);
		System.out.println(d2.var);

	}

}
