class SuperNarrow
{
	public void display1()
	{
		System.out.println("this is super class");
	}
}

class SubNarrow extends SuperNarrow
{
	public void display2()
	{
		System.out.println("this is sub class");
	}
}

public class NarrowObjDemo
{
	public static void main(String[] args)
	{
		SuperNarrow SN;       //creating ref to superclass
		SN =new SubNarrow();   //assign super class ref to sub class object
		
		SubNarrow S =(SubNarrow)SN;  //creating subclass ref assigning superclass ref sn by narrowing with subclass
		// S.display1();
		 S.display2();
	}
}