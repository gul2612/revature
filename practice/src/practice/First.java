package practice;

public class First 
{
	private int x;
	private int y;
	public First(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public void add()
	{
		System.out.println("sum="+(x+y));
	}
	public void sub()
	{
		System.out.println("sub="+(x-y));
	}
	public void multiply()
	{
		System.out.println("multiply="+(x*y));
	}

}
