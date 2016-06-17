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
		else if(Math.abs(currentNumber) > 100){
			System.out.println("I am not powerful enough to tell you anything about numbers above 100 (or below -100).");
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
		String answer;
		
		//1) input
		primeInputStream += String.valueOf((int) Math.abs(currentNumber));
		
		//2) divisor
		primeInputStream += " 2";
		
		//3) block to create space
		primeInputStream += "[]";
		
		//4) copy input for further use
		primeInputStream += "3c";
		
		//5) copy divisor for further use
		primeInputStream += "3c";
		
		//6) compute modulo
		primeInputStream += "%";
		
		//7) check whether modulo is greater 0
		primeInputStream += "0>w";
		
		/*8) if 1 --> increase divisor, if 0 --> write quotient, how to do this?
		 * multiply 1 by number of steps to copy sth?
		 * multiply 0 --> copies 0 (basically doing nothing)
		 * then 0 makes some block invalid
		 * 1 prints quotient or sth like that
		 * after that delete massive amounts of stuff and start again?
		 */
		
		//TODO adjust above steps such that prime factors are computed, also add further steps
		//TODO for example add an iteration integer directly after divisor, then iterate it? or iterate divisor itself?

		ca.setInputStream(primeInputStream);
		try {
			ca.executeInput();
		} catch (Exception e) {
			//e.printStackTrace();
			return null;
		}
		answer = ca.getOutputStream();
		
		answer = answer.replaceAll("\n", " ");

		if(currentNumber < 0){
			answer = "-" + answer;
		}
		
		return answer;
	}

}
