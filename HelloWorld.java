public class Hello
{
	int a,b,c;
	public Hello()
	{
		a=10;
		b=20;
	}
	public void add()
	{
		System.out.println("I am from add method")
		c=a+b;
	}
    public static void main(String args[])
	{
		System.out.println("Inside Main block");
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello Jenkins:---------" +i);
		}
		System.out.println("Outside Main block");
	    System.out.println("Exited from Program");
	    System.out.println("///////////////////////////");
	    
	    
	}
}
