public class AbstractClassDemo
{
	public static void main(String[] args)
	{
		// we cannot create object for abstract class
		
		RTC B=new RTC();
		Railway R= new Railway();  //created two new objects for rtc and railway class
		
		ABDemo A;  //creating reference to abstract class
		
		A=B;
		A.method1();
		A.transport();
		A.vehicles();
		B.travel();
		
		A=R;
		A.method1();
		A.transport();
		A.vehicles();
		R.travels();
		
	}
}