package General;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Calculator Test		

		Calculator calc = new Calculator();
		
		Scanner scanner = new Scanner(System.in);
		
		String inputStream = "";
		
		while(!inputStream.equals("x")){
			
			inputStream = scanner.nextLine();
			calc.setInputStream(inputStream);
			try {
				calc.executeInput();
			} catch (Exception e) {
				System.out.println(e.getClass() + ": " + e.getMessage()); //TODO: set messages in Operations
				break;
			}		
			System.out.println(calc.getOutputStream());
			calc.clear();
			
		}
		
		
		// calc.setInputStream("4 5~6c ~78 ~9cw");
		//calc.setInputStream("4 4+-w");
		

	}

}
