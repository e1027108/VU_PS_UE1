package Operators;

import Exceptions.UnexpectedBlockException;

public class Lesser extends Operation {

	@Override
	public void executeOperation() throws UnexpectedBlockException{
		int val1, val2;
		String result, element1, element2;

		element1 = stack.pop();
		element2 = stack.pop();

		try{
			val1 = Integer.parseInt(stack.pop());
			val2 = Integer.parseInt(stack.pop());
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

		if(val2 < val1){
			result = "1";
		}
		else{
			result = "0";
		}

		stack.push(result);
	}

}
