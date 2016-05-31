package Operators;

public class Negation extends Operation {

	@Override
	public void executeOperation() {
		String s = stack.pop();
		if(!s.contains("[")) {
			int n = Integer.parseInt(s);
			if(n != 0){
				n = n * -1;
			}
			stack.push(String.valueOf(n));
		}
		else {
			//throw exception -> not an integer
		}
				
	}

}
