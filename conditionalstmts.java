public class conditionalstmts{
	
	 public static void main(String[] args)
	 {
		 
	    int a =10, b=5;
		
		// if else stmts
		if(a<b)
		{
		System.out.println("a is bigger than b");
	    }else{
		System.out.println("b is bigger than a");	
		}
		
		
	/*	//while stmts
		int n=1;
		while(n<10)
		{
			System.out.println(n);   
			n++;
		}
		//for loop stmts

        for(int k=11; k<=20; k++)
		{
			System.out.println("for loo stsmt values"+k);
			
		}	*/
		//do-while
		
		int i=1;
		do{
			System.out.println(i);
			i++;
		}while(i<=10);

         //break stmts

         int j=1;
		 do{
			System.out.println(j);
			j++;
			break;
		 }while(j>0);		 
		
	 }
}