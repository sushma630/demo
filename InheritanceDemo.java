 class SuperDemo
{
	int a,b,c;
	 void add(int a, int b)
	{
		
		c=a+b;
		System.out.println("add :"+c);
	}
}
 class SubDemo extends SuperDemo{
	int a,b,c;
	void mul(int a, int b)
	{
		
		c=a*b;
		System.out.println("mul :"+c);
	}
 }

public class InheritanceDemo
{
	
	 public static void main(String[] args)
	 {
		 SubDemo obj=new SubDemo();
		 obj.add(10,5);
		 obj.mul(8,9);
	 }
}

