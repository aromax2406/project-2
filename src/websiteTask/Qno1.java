package websiteTask;

public class Qno1 {


	public Qno1() {
		this(9997978687897l);
		
		// TODO Auto-generated constructor stub
		
		System.out.println("this is default");
	}
	public Qno1(int no) {
		// TODO Auto-generated constructor stub
		
	System.out.println("the int no is "+no);
	
	}
	public Qno1(String name ) {
		this(11234);
		//t TODO Auto-generated constructor stub
		
		System.out.println("this string name is "+ name);
		
	}
	public Qno1(long pHno) {
		// TODO Auto-generated constructor stub
		this("xavi");
		
		System.out.println("the long phno is "+pHno);
		
	}
	public static void main(String[] args) {
		Qno1 n = new Qno1();
		
	}
}
