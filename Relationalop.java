public class Relationalop{
	
	public static void main(String[] args)
	{
		int a,b;
		a=10;
		b=5;
		
	//	System.out.println("value"+ (b++));
		//System.out.println("value"+ (b));
		
	// relational operators
		
		System.out.println("a equals to b:"+ (a==b));
		System.out.println("a is not equals to b:"+ (a!=b));
		System.out.println("a is greater than b:"+ (a>b));
		System.out.println("a is less than b:"+ (a<b));
		System.out.println("a is greater than or equals to b:"+ (a>=b));
		System.out.println("a is less than or equals to b:"+ (a<=b));
	
	//logical operators
	
		System.out.println("logical and operation :"+ ((a==b)&&(a!=b)));
		System.out.println("logical or operation :"+ ((a==b)||(a!=b)));
	    System.out.println("logical not operation :"+ (!(a==b)));
		
/*	//unary operators
 
        System.out.println("pre increment of a:"+ (++a)); //11
		System.out.println("post increment of b:"+ (b++)); //5
		System.out.println("value of b:"+ (b));           //6
		System.out.println("pre decrement of  b:"+ (--b));  //5
		System.out.println("post decrement of b:"+ (b--));   //5
        System.out.println("value of b:"+ (b));           //4
		*/
	}
	
}