public class StaticDemo{
	 String name;
	int age;
	
	static void talk(){
		System.out.println("hi hello this is a static block");
	}
	public void show()
	{
		System.out.println("name :"+name);
	    System.out.println("age :"+age);
	}
	
	
	public static void main(String[] args){
		
		//StaticDemo d=new StaticDemo();
		//d.name="swathi";
		//d.age=23;
		//d.show();
		talk();
		System.out.println("name :"+name);
		
	}
}