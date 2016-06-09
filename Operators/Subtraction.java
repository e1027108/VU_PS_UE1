package Operators;

import Exceptions.UnexpectedBlockException;

public class Subtraction extends Operation {

	@Override
	public void executeOperation() throws UnexpectedBlockException {
		int subtrahend, minuend;
		String element1, element2;

		element1 = stack.pop();
		element2 = stack.pop();

		try{
			subtrahend = Integer.parseInt(element1);
			minuend = Integer.parseInt(element2);
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

		stack.push(String.valueOf(minuend - subtrahend));
	}

}
