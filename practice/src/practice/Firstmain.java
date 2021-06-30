package practice;

public class Firstmain {

	public static void main(String[] args) {
		First e1=new First(100,"sachin");
		System.out.println("printing e1");
		e1.print();
		First e2=new First(100,"saurav","kolkata",49);
		System.out.println("printing e2");
		e2.print();
		e1.setCity("mumbai");
		e1.setAge(45);
		e1.print();
		
	}

}
