public class ContinueStmt{
	
	public static void main (String[] args)
	{
		//break stmt
	/*	for(int i=1; i<=10; i++)
		{
			if(i==5)
			break;
			System.out.println("printing value"+ i);  
		 }
		 */
		 //continue stmt here 
		for(int i=1; i<=10; i++)
		{
			if(i<=7)
			continue;
			System.out.println("continu one"+ i);
		}
		 
		 System.out.println("code end here");
	
	
}
}