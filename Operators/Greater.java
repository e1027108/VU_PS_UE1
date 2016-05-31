package Operators;

public class Greater extends Operation {

	@Override
	public void executeOperation(){
		int val1, val2;
		String result;
		
		//TODO blocks
		
		val1 = Integer.parseInt(stack.pop());
		val2 = Integer.parseInt(stack.pop());
		
		if(val2 > val1){
			result = "1";
		}
		else{
			result = "0";
		}
		
		stack.push(result);
	}

}
