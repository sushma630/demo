public class ArraysDemo{
	
	public static void main(String[] args)
	{
		int Marks[]={10,20,30};
		int total=0;
		int size=Marks.length;
		
		for(int i=0; i<size; i++)
		{
			total =total+Marks[i];
			System.out.println(Marks[i]);
           		
		}
		System.out.println("total marks obtained "+ total);
		}
}