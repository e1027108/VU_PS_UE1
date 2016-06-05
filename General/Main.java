package General;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Calculator Test
		

				Calculator calc = new Calculator();
				
				// calc.setInputStream("4 5~6c ~78 ~9cw");
				calc.setInputStream("4 4+-w");
				try {
					calc.executeInput();
				} catch (Exception e) {
					System.out.println(e.getClass() + ": " + e.getMessage()); //TODO: set messages in Operations
				}		
				System.out.println(calc.getOutputStream());

	}

}
