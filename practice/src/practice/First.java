package practice;

public class First 
{
	private int id;
	private String name;
	private String city;
	private int age;
	public First(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public First(int id, String name, String city, int age) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
	}
	

	

	public void setCity(String city) {
		this.city = city;
	}

	

	public void setAge(int age) {
		this.age = age;
	}

	public void print()
	{
		System.out.println("id="+id);
		System.out.println("name="+name);
		System.out.println("city="+city);
		System.out.println("age="+age);
	}
}
