//method overriding is possible through inheritance

class Methodoverriding
{
	public void add(int a, int b)
	{
		System.out.println("adding two numbers " + (a+b));
	}
}

class SubMethod extends Methodoverriding
{
	public void add(int a, int b)
	{
		System.out.println("multiplication of  two numbers " + (a*b));
	}
	
}

public class MethodOverridingDemo
{
	public static void main(String[] args)
	{
		// creating object for subclass ie child
		
		SubMethod S=new SubMethod();
		S.add(3,3);
	}
}