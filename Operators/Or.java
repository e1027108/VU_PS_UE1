package Operators;

import Exceptions.InvalidStreamContentException;
import Exceptions.NotATruthValueException;
import Exceptions.UnexpectedBlockException;

public class Or extends Operation{

	@Override
	public void executeOperation() throws UnexpectedBlockException, NotATruthValueException{
		String disjunct1, disjunct2;
		String result = "";
		
		//TODO do NOT accept block
		
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
