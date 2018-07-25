
public class SuperThisPract3 
{
	final int i;
	int num;
	
	public SuperThisPract3()
	{
		i=10;
	}
	
	public SuperThisPract3(int num)
	{
		this();
		this.num=num;
		System.out.println(num);
	}
	
	
	/*public void show()
	{
		final int locVar;
		System.out.println("Hello");
		locVar=20;
		System.out.println(locVar);
	}*/
	public static void main(String[] args) 
	{
		SuperThisPract3 obj = new SuperThisPract3();
		SuperThisPract3 obj2 = new SuperThisPract3(20);

		//obj.show();
	}

}