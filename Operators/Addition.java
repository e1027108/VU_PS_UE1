package Operators;

import Exceptions.UnexpectedBlockException;

public class Addition extends Operation{

	@Override
	public void executeOperation() throws UnexpectedBlockException {//no specific exception?
		int summand1, summand2;
		String element1, element2;
		
		element1 = stack.pop();
		element2 = stack.pop();
		
		try{
			summand1 = Integer.parseInt(element1);
			summand2 = Integer.parseInt(element2);
		} catch (NumberFormatException e){
			if(element1.contains("[")){
				throw new UnexpectedBlockException(element1);
			}
			else if(element2.contains("[")){
				throw new UnexpectedBlockException(element2);
			}
			else{
				throw e;
			}
		}
		
		stack.push(String.valueOf(summand1 + summand2));
	}

}
