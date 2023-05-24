
public abstract class Abstraction {
	
	public void Bank() {
            System.out.println("Axis");
	}
	public void savingAccount() {
            System.out.println("1 Crore");
	}
	public abstract void currentAcco(); 
///////////////////////Hiding the implementation part///////////
	//it has two types//
	// Abstract class or Partially Abstraction//
	///it's supports both abstract method and non-abstract method///
	//// We can't create object for Abstract class. bcz there is no implementation////
	// we can access abstract class by using Extends keyword////
	//Public Abstract keywords is mandantory///
	
}
