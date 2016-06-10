package Operators;

import Exceptions.InvalidStackSizeException;
import Exceptions.NotATruthValueException;
import Exceptions.UnexpectedBlockException;

public class And extends Operation{

	@Override
	public void executeOperation() throws UnexpectedBlockException, NotATruthValueException, InvalidStackSizeException{
		String conjunct1, conjunct2;
		String result = "";
		
		if(stack.size() < 2){
			throw new InvalidStackSizeException(2);
		}
		
		conjunct1 = stack.pop();
		conjunct2 = stack.pop();
		
		if(conjunct1.equals("1") && conjunct2.equals("1")){
			result = "1";
		}
		else if(!conjunct1.equals("0") && !conjunct2.equals("0")){
			if(conjunct1.length() > 1){
				throw new UnexpectedBlockException(conjunct1);
			}
			else if(conjunct2.length() > 1){
				throw new UnexpectedBlockException(conjunct2);
			}
			else if(!conjunct1.equals("0") && !conjunct1.equals("1")){
				throw new NotATruthValueException(this.getClass().getName(), conjunct1);
			}
			else{
				throw new NotATruthValueException(this.getClass().getName(), conjunct2);
			}
		}
		else{
			result = "0";
		}
		
		stack.push(result);
	}

}
