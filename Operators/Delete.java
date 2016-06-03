package Operators;

import Exceptions.InvalidStackSizeException;

public class Delete extends Operation {

	@Override
	public void executeOperation() throws InvalidStackSizeException {
		stack.pop();
		String[] elements = new String[stack.size()];
		int origSize = stack.size();
		
		if(stack.size() > 0) {
			
			for(int i = stack.size()-1; i >= 0; i--) {
				elements[i] = stack.pop();
			}
					
			for(int i = 1; i < elements.length; i++) {
				stack.push(elements[i]);
			}			
			
		}
		else {
			throw new InvalidStackSizeException("" + (origSize-stack.size())); //TODO test validity of message
		}
	}

}
