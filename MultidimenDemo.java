public class MultidimenDemo{
	
	public static void main(String args[])
	{
		int num[][][] ={{
		
			          {10,15,20,25,30} , 
		              {20,25,30,35,40}
		},
			{   
			          {1,2,3,4,5} , 
			           {6,7,8,9,10}
		    }   
			};
						
         for(int i=0; i<2; i++)
		 {
            for(int j=0; j<2; j++)
			{
				for(int k=0; k<5; k++)
                {
				  System.out.println("values"+ num[i][j][k]);  
			    }
			System.out.println();
			}
			 System.out.println();
		 }			
	}
}