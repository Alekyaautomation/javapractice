package javapractice;

public class Static {
	static int x=10;//Static variables can be initialized when declared or in a static block.
     int y=20;
	/*In Java, a static variable is a class-level variable that belongs to the class rather than any specific instance of the class.
	 *  It is also known as a class variable because it is associated with the class and shared among all instances of the class. */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Static s1=new Static();
s1.x=10;
s1.y=20;
Static s2=new Static();
System.out.println(s1.x+s2.y);/*Static variables can be accessed using the class name followed by the dot (.) 
operator or through an instance of the class.*/
	}

}
