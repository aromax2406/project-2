package websiteTask;

public class A {
public A() {
	this("java");
	
	// TODO Auto-generated constructor stub
	System.out.println("default constructor");
}
public A(int id ) {
	this(12345.4223f);
	// TODO Auto-generated constructor stub
	System.out.println(id);
	
}
public A ( String Name) {
	this('c');
	
	// TODO Auto-generated constructor stub
	System.out.println(Name);
}
public A( float balance) {
	// TODO Auto-generated constructor stub
	System.out.println(balance);
}
public A(char intial) {
	this(686);
	// TODO Auto-generated constructor stub
	System.out.println(intial);
}
public static void main(String[] args) {
	
	A c = new A();
}
}