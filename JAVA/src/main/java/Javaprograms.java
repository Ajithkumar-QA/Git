import java.io.InputStream;
import java.util.Scanner;

public class Javaprograms {
	public int d=20;
	public void name() {
		//////////Overloading(compile time polymorphism/Static binding)
		//////// in The same class and method names wil be same
		////////argument and parameter will be differ based on data type and data type count and order.
		System.out.println("My name is :"+"Ajith");

		}
		public void role(String value) {
			System.out.println("My Role is :"+value);

		}
		
		public void Age(int b, int c) {
			
			if (b==c) {
				System.out.println("My age is :"+c);
			} else {
				System.out.println("My age is not equal"+c);
				
			}
			
		}
		
	
     public static void main(String[] args) {
	Javaprograms jp=new Javaprograms();
	System.out.println(jp.d);
	
	Scanner sc=new Scanner(System.in);
	int nextInt = sc.nextInt();
	int E=nextInt;
	 jp.Age(jp.d,E);
	System.out.println();
	
	
}

}
