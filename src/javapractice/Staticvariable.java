package javapractice;

public class Staticvariable {
	static int count=0;
	//creating method
	public Staticvariable() {
		count++;
	}
	public void details() {
		System.out.println("count:" +count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Staticvariable obj1=new Staticvariable();
obj1.details();
	}

}
