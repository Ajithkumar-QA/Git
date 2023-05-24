
public class Constructor1 {
	public Constructor1() {
		this("ajith");
		System.out.println("1");
	}
	/////////////A Constructor java is special method that is used to initalize objects.
	//////////// it's doesn't have any return types.
	////////////when we create an object. default constructor will execute automatically. and
	/////////// it's support Method overloading only.
	//////////// it's has two types
	////////// 1.Default Constructor or Non Parameterized Constructor//////
////////////////A Constructor is called Default Constructior when It doesn't have any parameter.
	///////// 2.parameterized constructor////
	////A Constructor which has specific number of Parameter is called parameterized constructor.
	
	////////////keyword this and super///
	/// this -it's current class reference/////
	////super -it's parent class reference/////
	
	
	
	
	public Constructor1(int number){
		
		System.out.println("2nd :" +number);
	}
    
	public Constructor1(String name){
		this(10.08);
		System.out.println("3 nd :"+name);
	}
	public Constructor1(Double phone){
		this(10);
		System.out.println("4 th :"+phone);
	}
	
public static void main(String[] args) {
	Constructor1 c1=new Constructor1();
}
}
