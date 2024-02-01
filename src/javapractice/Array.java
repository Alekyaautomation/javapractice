package javapractice;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a[],b[];
//int a[];dimensional before variable is only applicable for first variable

//int[] x=new int [5];// array initialization 
 
//int [] [] y=new int[2][];
//y[0]=new int [2];
//y[1]=new int [3];


int []z= new int [6];
System.out.println(z); //whenever we are trying to print reference variable internally two string method classform@hashcode-in-hexadecimalform
System.out.println(z[1]);

//if we are trying to perform operation on null then we get null pointer Encapsation

int [] r =new int [4];
r[0]=10;
r[1]=20;
r[2]=30;
r[3]=40;
//a[4]=50;// if we are trying to access element out of range then we get array index out of Bounds Exception 
System.out.println(r[2]);



//we can create declare initialization in single line 
int [] p= {10,20,30};
char []ch= {'A','R'};
String []s= {"AA","RR"};//String objects stored in SAP

//length v/s length() method 

//length= length is a final variable applicable for array length variable represents size of the Array

int [] q= new int [6];
System.out.println(q.length);

//length method()= is a final method applicable for string object.it returns no. of characters present in the string.

String name= "AlekyaBaggi";
System.out.println(name.length());

String []S1= {"A","AA","AAA"};
System.out.println(S1[0].length());//1  no.of characters
System.out.println(S1[1].length());//2
System.out.println(S1[2].length());//3

System.out.println(S1.length);// 3  Size of Array variable 


int num=10;
char letter= 'a';
String person = "Java";
float weight=59.5f;
boolean b=true;

System.out.println("enter the value" + num);
System.out.println("Enter the first letter" + letter);
System.out.println("Enter the course" + name);
System.out.println("Enter the weight" + weight);
System.out.println("Enter the Statment" + b);


int[] k=new int [4];
System.out.println(k.length);//4 length variable represents size of the array




//for loop


int[] a = {4, 6, 3};
for (int i = 0; i < a.length; i++) //length variable represents size of the array

{
	System.out.println(a[i]);
}



int [] array1 = {2,5,7};
for (int i=0;i<3; i++)//length variable represents size of the array

{

System.out.println(array1[i]);

	}

//Array of String

String[] S= {"Core", "java" };

for(int i=0; i<S.length;i++)
{
	System.out.println(S[i]);
}
 
String[] S3 = {"core" ,"javaProgram"};
System.out.println(S3[0].length());
System.out.println(S3[1].length());
 }


	


//case 1: whenever we trying to assign one array to another array internal elements wont be copied just 
//internal reference element can be assigned
int[]c= {10,20,30};
int []d= {20,30};

//c=d
//d=c

{
	
	       
	
}
}





	
















	

