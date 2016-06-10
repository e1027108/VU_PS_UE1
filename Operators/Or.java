package Operators;

import Exceptions.InvalidStackSizeException;
import Exceptions.NotATruthValueException;
import Exceptions.UnexpectedBlockException;

public class Or extends Operation{

	@Override
	public void executeOperation() throws UnexpectedBlockException, NotATruthValueException, InvalidStackSizeException{
		String disjunct1, disjunct2;
		String result = "";
		
		if(stack.size() < 2){
			throw new InvalidStackSizeException(2);
		}
		
		disjunct1 = stack.pop();
		disjunct2 = stack.pop();
		
		if(disjunct1.equals("0") && disjunct2.equals("0")){
			result = "0";
		}
		else if(!disjunct1.equals("1") && !disjunct2.equals("1")){
			if(disjunct1.length() > 1){
				throw new UnexpectedBlockException(disjunct1);
			}
			else if(disjunct2.length() > 1){
				throw new UnexpectedBlockException(disjunct2);
			}
			else if(!disjunct1.equals("0") && !disjunct1.equals("1")){
				throw new NotATruthValueException(this.getClass().getName(), disjunct1);
			}
			else{
				throw new NotATruthValueException(this.getClass().getName(), disjunct2);
			}
		}
		else{
			result = "1";
		}
		
		stack.push(result);
	}
	
}
