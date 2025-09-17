package packagePoly;
//Java program to illustrate method overloading
import java.io.*;
//class 1
//Helper class
class Product {
//method 1
	//multiplying two integer values
	public int multiply(int a, int b)
	{
		int prod = a * b;
		return prod;
	}
	//method 2
	//multiplying three integer values
	public int multiply(int a, int b,int c)
	{
		int prod = a * b * c;
		return prod;
	}
	//class 2
	//main class
	class priyaOverloading{
		
		//main driver method
	public static void main(String[] args) {
		
   //creating object of above class inside main()
		//method
		Product ob=new Product();
		 
		//calling method to multiply 2 numbers
		int Prod1=ob.multiply(1, 2);
		
		//printing product of 2 numbers
		System.out.println("product of the two integer value:+ Prod1");
		
		//calling method to multiply 3 numbers
		 int Prod2=ob.multiply(1,2,3);
		 
		 //printing printing of three numbers
		 System.out.println("product of three integer value:"+Prod2);
		 
		 float Prod3=ob.multiply(12323, 639263, 982712);
		 System.out.println("product of the three float value:"+Prod3);
		 
	}
	}
}
