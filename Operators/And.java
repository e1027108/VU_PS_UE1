package Operators;

public class And extends Operation{

	@Override
	public void executeOperation(){
		String conjunct1, conjunct2, result;
		
		//TODO do NOT accept block
		
		conjunct1 = stack.pop();
		conjunct2 = stack.pop();
		
		if(conjunct1.equals("1") && conjunct2.equals("1")){
			result = "1";
		}
		else{
			result = "0";
		}
		
		stack.push(result);
	}

}
