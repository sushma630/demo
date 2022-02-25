class SuperWide
{
	public void show()
	{
		System.out.println("super class widening");
	}
}

class SubWide extends SuperWide
{	
	public void show1()
	{
		System.out.println("sub class widening");
	}
}

public class WideningObjDemo
{
	public static void main(String[] args)
	{
		SuperWide SW; // creating reference to super class
		SW=new SubWide();  //assigning super clas ref to sub class object 
		SW.show();    //calling super class method, we can't call all method using widening
	}
}