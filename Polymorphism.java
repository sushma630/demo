 class polymorp
{	
//method overloding static 
	//method sum
	public void sum(int a, int b)
	{
		System.out.println("adding two numbers"+ (a+b));
	}
	
	//another method with same name sum	
	public void sum(int a, int b, int c)
	{
		System.out.println("adding two numbers"+ (a+b+c));
	}
	
	//same method name with diff data types
	public void sum(double a, double b)
	{
		System.out.println("adding two numbers"+ (a+b));
	}
	
	//same method name with change in order of parameter
	public void sum(int a, double b)
	{
		System.out.println("adding two numbers"+ (a+b));
	}
    public void sum(double a, int b)
	{
		System.out.println("adding two numbers"+ (a+b));
	}
}

public class Polymorphism
{
	public static void main(String[] args)
	{
		polymorp p=new polymorp();
		p.sum(2.2,2.8);
		p.sum(2,3.1);
		p.sum(2.5,5);
		p.sum(2,4);
		p.sum(5,9);
		
	}
}