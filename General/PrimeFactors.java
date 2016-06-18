package General;

import java.util.Scanner;

public class PrimeFactors {

	public static Calculator ca = new Calculator();

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome, I'm the prime factor calculator.");
		System.out.println("You can shut me up by writing 'exit'.");

		String lastInput = "";

		do{
			ca.clear();
			System.out.println("Please input an integer for me to compute it's prime factors.");
			if(sc.hasNext()){
				lastInput = sc.next();
				lastInput = printFactors(lastInput);
			}
		}while(!lastInput.equals("exit"));
	}

	private static String printFactors(String next) {
		if(next.equals("exit")){
			printBye();
			return "exit";
		}

		int currentNumber;

		try{
			currentNumber = Integer.parseInt(next);
		} catch (NumberFormatException e){
			System.out.println("That was not a number, give me numbers only please.");
			printBye();
			return "exit";
		}

		if(currentNumber == 0){
			System.out.println("0 does not have prime factors, sorry!");
			printBye();
			return "exit";
		}
		else if(Math.abs(currentNumber) == 1){
			System.out.println("I couldn't find any prime factors for " + currentNumber + "!");
			return "";
		}
		else if(currentNumber < 0){
			currentNumber = Math.abs(currentNumber);
			System.out.println("I will give you the prime factors for " + currentNumber + " instead.");
			return printFactors(String.valueOf(currentNumber));
		}
		else if(currentNumber > 100){
			System.out.println("I am not powerful enough to tell you anything about numbers above 100.");
			return "";
		}
		else{
			String factors = computeFactors(currentNumber);
			if(factors == null){
				System.out.println("I'm sorry, something went wrong!");
				printBye();
				return "exit";
			}
			else{
				System.out.println(factors);
				return "";
			}
		}
	}

	private static void printBye() {
		System.out.println("Hope to see you soon, bye!");
	}

	private static String computeFactors(int currentNumber) {
		String primeInputStream = "";
		String standardBlock = "";
		String increaseBlock = "";
		String divideBlock = "";
		String answer;
		
		/*-------------------------------------------------------
		 *definition of standard, increase and divide blocks
		 *--------------------------------------------------------*/
		
		//1) huge block to compute modulo
		//1.1) copy input for further use
		standardBlock += " 2c";
		
		//1.2) copy divisor for further use
		standardBlock += " 2c";
		
		//1.3) compute modulo
		standardBlock += "%";
		
		//1.4) check whether modulo is greater 0
		standardBlock += "0>";
		
		//1.5) if greater -> 1 copies block 2, if not block 3 TODO these are currently blocks 1 and 2
		standardBlock += "3+c";
		
		//1.6) execute copied block
		standardBlock += "a";
		
		//-----
		//2.1) increment divisor block
		increaseBlock += "1+";
		
		//2.1.1) testing
		increaseBlock += "1cw";
		
		//2.2) do standard block again for input and new divisor
		increaseBlock += "[" + standardBlock + "]a";		
		
		//-----
		//3.1) print divisor
		divideBlock += " 1cw";
		
		//3.2) copy input
		divideBlock += " 2c";
		
		//3.3) copy divisor
		divideBlock += " 2c";
		
		//3.4) divide input
		divideBlock += "/";
		
		//TODO if divisor equals input/dividend, stop the program!!! otherwise there will be an infinite loop, i think
		
		//3.5) set divisor 2, because we start again
		divideBlock += "2";
		
		//3.6) delete old input, now we work with rest value
		divideBlock += " 4d";
		
		//3.7) delete old divisor as we have set another one
		divideBlock += "3dwww"; //TODO with triple-write program "aborts", remove when working
		
		//3.8) do standard block again for new input/divisor
		//divideBlock += "[" + standardBlock + "]a"; //TODO de-comment when working
		
		/*-------------------------------------------------------
		 *main program 
		 *for testing purposes last command should write 'w'
		 *--------------------------------------------------------*/
		
		//0) standard block to compute modulo and the such
		primeInputStream += "[" + standardBlock + "]";
		
		//1) block for modulo > 0
		primeInputStream += "[" + increaseBlock + "]";
		
		//2) block for modulo = 0
		primeInputStream += "[" + divideBlock + "]";
		
		//3) input
		primeInputStream += String.valueOf((int) Math.abs(currentNumber));
		
		//4) divisor
		primeInputStream += " 2";
		
		//5) copy and execute standard block
		primeInputStream += " 5ca";
		
		/*-------------------------------------------------------
		 *end
		 *--------------------------------------------------------*/

		ca.setInputStream(primeInputStream);
		try {
			ca.executeInput();
		} catch (Exception e) {
			//e.printStackTrace();
			return null;
		}
		answer = ca.getOutputStream();
		
		answer = answer.replaceAll("\n", " ");

		return answer;
	}

}
