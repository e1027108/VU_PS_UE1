package Operators;

public class Or extends Operation{

	@Override
	public void executeOperation(){
		String disjunct1, disjunct2;
		String result = "";
		
		//TODO do NOT accept block
		
		disjunct1 = stack.pop();
		disjunct2 = stack.pop();
		
		if(disjunct1.equals("0") && disjunct2.equals("0")){
			result = "0";
		}
		else if(!disjunct1.equals("1") && !disjunct2.equals("1")){
			//TODO: throw exception
		}
		else{
			result = "1";
		}
		
		stack.push(result);
	}
	
}
