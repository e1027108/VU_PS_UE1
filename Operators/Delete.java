package Operators;

import Exceptions.InvalidStackSizeException;
import Exceptions.UnexpectedBlockException;

public class Delete extends Operation {

	@Override
	public void executeOperation() throws InvalidStackSizeException, UnexpectedBlockException {
		
		String[] elements = new String[stack.size()];
		int origSize = stack.size();
		
		if(stack.size() > 1) {
									
			for(int i = 0; i < origSize; i++) {
				elements[i] = stack.pop();
			}
			
			
			int e = Integer.MAX_VALUE;
			if(!elements[0].contains("[")){
				e = Integer.parseInt(elements[0]);
			}
			else{
				throw new UnexpectedBlockException("cannot copy element" + elements[0]);
			}
			
			if(e < 0){
				throw new InvalidStackSizeException("delete cannot be applied to negative numbers");
			}
			
			if(e < elements.length){
				for(int i = elements.length-1; i > 0; i--) {
					if(e != i){
						stack.push(elements[i]);
					}
				}	
			}
			else{
				throw new InvalidStackSizeException("there is no " + elements[0] + "th element on the stack to delete");
			}					
			
		}
		else {
			throw new InvalidStackSizeException("" + (origSize-stack.size())); //TODO test validity of message
		}
	}

}
