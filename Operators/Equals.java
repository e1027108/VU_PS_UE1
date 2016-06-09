package Operators;

public class Equals extends Operation{
	
	@Override
	public void executeOperation(){
		String val1, val2, result;
		
		val1 = stack.pop();
		val2 = stack.pop();
		
		if(val1.equals(val2)){
			result = "1";
		}
		else{
			result = "0";
		}
		
		stack.push(result);
	}
	
}
