package Operators;

public class Or extends Operation{

	@Override
	public void executeOperation(){
		String disjunct1, disjunct2, result;
		
		//TODO do NOT accept block
		
		disjunct1 = stack.pop();
		disjunct2 = stack.pop();
		
		if(disjunct1.equals("1") || disjunct2.equals("1")){
			result = "1";
		}
		else{
			result = "0";
		}
		
		stack.push(result);
	}
	
}
