package Operators;

import Exceptions.UnexpectedBlockException;

public class Negation extends Operation {

	@Override
	public void executeOperation() throws UnexpectedBlockException {
		String s = stack.pop();
		if(!s.contains("[")) {
			int n = Integer.parseInt(s);
			if(n != 0){
				n = n * -1;
			}
			stack.push(String.valueOf(n));
		}
		else {
			throw new UnexpectedBlockException(s);
		}
				
	}

}
