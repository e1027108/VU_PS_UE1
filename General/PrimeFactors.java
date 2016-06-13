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
		else{
			String factors = computeFactors(currentNumber);
			if(factors == null){
				System.out.println("I'm sorry, something went wrong!");
				printBye();
				return "exit";
			}
			System.out.println(computeFactors(currentNumber));
			return "";
		}
	}

	private static void printBye() {
		System.out.println("Hope to see you soon, bye!");
	}

	private static String computeFactors(int currentNumber) {
		String primeInputStream = "";
		String answer;
		
		// TODO how do I actually get the calculator input for that number?
		/* call to method */
		
		ca.setInputStream(primeInputStream);
		try {
			ca.executeInput();
		} catch (Exception e) {
			return null;
		}
		answer = ca.getOutputStream();
		
		answer = answer.replaceAll("\n", " ");
		
		return answer;
	}
	
}
