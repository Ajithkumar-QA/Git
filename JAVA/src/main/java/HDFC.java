
public class HDFC extends Abstraction {

	@Override
	public void currentAcco() {
		System.out.println("am waiting for Salary");
		
	}
	public static void main(String[] args) {
		HDFC h1=new HDFC();
		h1.Bank();
		h1.savingAccount();
		h1.currentAcco();
	}

}
