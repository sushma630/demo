public class PersonDemo
{
	
	//these are instance variables
	
	String name;
	int age;
	String gender;
	
	public void setName(String name)
	{
	this.name=name;
	}
	
	public void Talk() //it is a method without return type and without retun stmt.
	{
		System.out.println("person who is talking : "+ name);
		System.out.println("Iam : "+ age + "years old");
	}
	public void Eat()
	{
		System.out.println("Iam eating");
	}
}