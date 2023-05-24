import java.util.Iterator;

public class ForStatement {
	public static void main(String[] args) {
		System.out.println("Start");
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <5; j++) {
				
				if (i==1) 
				{
					
					continue;
				}
				
				System.out.print(i);

			}
			System.out.println();
					}
		
	}

}
