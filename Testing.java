 class TestDemo
{
	int a;
	int b;
	
	public void add(int a, int b)
	{
	System.out.println(a+b);
	}
}
public class Testing
{
	public static void main(String[] args)
	{
		TestDemo T=new TestDemo();
		T.add(5,6);
	}
}