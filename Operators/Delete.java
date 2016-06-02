package Operators;

public class Delete extends Operation {

	@Override
	public void executeOperation() {
		stack.pop();
		String[] elements = new String[stack.size()];
		if(stack.size() > 0) {
			
			for(int i = stack.size()-1; i >= 0; i--) {
				elements[i] = stack.pop();
			}
					
			for(int i = 1; i < elements.length; i++) {
				stack.push(elements[i]);
			}			
			
		}
		else {
			//TODO: throw exception -> no sufficient number of elements on stack
		}
	}

}
