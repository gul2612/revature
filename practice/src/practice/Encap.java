package practice;

public class Encap {
	private int id;
	private String name;
	public Encap()
	{
		
	}
	public Encap(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void print()
	{
		System.out.println("id="+id);
		System.out.println("name="+name);
	}

}
