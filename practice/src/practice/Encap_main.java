package practice;

public class Encap_main {

	public static void main(String[] args) {
		Encap c= new Encap();
		c.setId(10);
		c.setName("sachin");
		c.print();
		Encap c1=new Encap(20,"saurav");
		c1.print();
	}

}
