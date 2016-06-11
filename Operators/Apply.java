package Operators;

import General.Calculator;

public class Apply extends Operation {

	@Override
	public void executeOperation() throws Exception {
		// TODO
		Calculator c = new Calculator();
		String block = stack.pop();
		
		if(block.charAt(0) == '[' && block.charAt(block.length()-1) == ']'){
			block = block.substring(1, block.length()-1); 
			c.setInputStream(block);
			c.setStack(stack);
			c.executeInput();
		}
			
	}
	
}
