package Operators;

public class Copy extends Operation {

	@Override
	public void executeOperation() {
		String[] elements = new String[stack.size()];
		if(stack.size() > 1) {			
			
			for(int i = stack.size()-1; i >= 0; i--) {
				elements[i] = stack.pop();
			}
			
			elements[elements.length-1] = elements[0];
			
			for (String element : elements){
				stack.push(element);
			}			
			
		}
		else {
			// throw exception -> no sufficient number of elements on stack
		}
		
	}

}
