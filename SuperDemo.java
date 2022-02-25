 class SuperClassDemo
{
	int a,b,c;	
	// constructor
	SuperClassDemo(int a)
	{
		this.a=a;
		System.out.println("this is super class constructor");
		System.out.println("value"+a);
	}
	
	//add method
	 void add(int a, int b)
	{
		c=a+b;
		System.out.println("add :"+c);
	}
	
	//display method
	void display()
	{
	System.out.println("display method in super class");	
	}
}


 class SubclassDemo extends SuperClassDemo
 {
	int a,b,c;
	
	//constructor
	SubclassDemo(int a)
	{
		super(a);
	}
	
	//mul method
	void mul(int a, int b)
	{
		c=a*b;
		System.out.println("mul :"+c);
	}
	
	//method 
	void method1()
	{
		super.add(1,5);
		super.display();
		//System.out.println("display method in sub class");	
	}
 }
 
 
public class SuperDemo
{
	 public static void main(String[] args)
	 {
		 SubclassDemo obj=new SubclassDemo(6);
	//	 obj.add(10,5);
		 obj.mul(8,9);
		obj.method1();
	 }
}