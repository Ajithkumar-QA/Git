import java.util.Scanner;
import java.io.InputStream;
public class sample extends Javaprograms {
	
	@Override
	public void name() {
		int k=10;
		System.out.println(k);
		super.name();
		//////Overriding(runtime polymorphism/dynamic binding)
		////we have different class
		////method name and  parameter will be same.
	}
	@Override
	public void role(String value) {
		System.out.println("QA Engineer");
		super.role(value);
	}
	public void companyname() {
		System.out.println("Aroopa");
	}
	
	public void Employeename(String name) {
		System.out.println("Employee name is "+name);
	}
	
	public void EmployeeAddress(String addreess,char state, int zipcode) {
System.out.println("Employee address :"+addreess+","+"State :"+state+","+"Zipcode :"+zipcode);
	}
	
	public static void main(String[] args) {
		sample sm=new sample();
		sm.name();
		sm.role(null);
		sm.companyname();
		sm.Employeename("Ajith");
		sm.EmployeeAddress("CHennai redhills", 'x', 621103);
		
	
	}				
}
