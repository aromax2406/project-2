package org.jain;

public class UsingSuper extends Usingthis {
public UsingSuper()
{
	
	this("hero", 5656);
	
	System.out.println("default no two");
		
}
public UsingSuper(int id) {


	System.out.println("the id is "+id);
		
}
public UsingSuper(String state) {
	 
	this(909090909090l);
	
	System.out.println("the state  name is "+state);
		
}
public UsingSuper(String bikename, int bikenum ) {
this("tamil nadu");

	System.out.println("the bike name is "+ bikename);
	System.out.println("the bike num is "+ bikenum);
}
public UsingSuper(long moNo) {
	super("theni");

	
	System.out.println("the moNo is " +moNo);
	
		
}
public static void main(String[] args) {
	 
	UsingSuper b = new UsingSuper();
	
}
}