public class CommandLine{
	
	public static void main (String[] args)
	{
		int n =args.length;
		
		System.out.println("no of args" + n);
		for(int i=0; i<n; i++)
		{
			System.out.println(args[i]);
		}			
	}
}