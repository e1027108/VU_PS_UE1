package General;

import java.util.ArrayDeque;
import java.util.Deque;

import Exceptions.InvalidStreamContentException;
import Operators.Operation;
import Operators.OperationFactory;

public class Calculator {
	
	private String inputStream;
	private String outputStream;
	private Deque<String> stack;
	
	private OperationFactory operationFactory;
	
	public Calculator(){
		stack = new ArrayDeque<String>();
		inputStream = "";
		outputStream = "";
		operationFactory = new OperationFactory();
	}
	
	public void executeInput() throws Exception{ //TODO deal with exception in Main? or here?
		String number = "";
		String block = "";
		int blockopen = 0;
		int blockclose = 0;
		Operation o = null;
		for(int i = 0; i < inputStream.length(); i++){
			char c = inputStream.charAt(i);
			
			if(!block.equals("")){
				block += c;
				if(c == '['){
					blockopen++;
				}
				if(c == ']'){
					blockclose++;
					if(blockopen == blockclose){
						stack.push(block);
						block = "";
					}
				}
			}
			else {				
				if(Character.isDigit(c)){
					number += c;
				}
				else{
					if(!number.equals("")){
						stack.push(number);
						number = "";
					}
					switch(c){
						case ' ':
							break;
						case '[':
							blockopen++;
							block += c;
							break;
						case '+':
							o = operationFactory.getAdditionInstance();
							o.setStack(stack);
							o.executeOperation();
							break;
						case '-':
							//check negative sign
							/*if(i < inputStream.length()-1){
								if(Character.isDigit(inputStream.charAt(i+1))){
									number += c;
									break;
								}
							}*/
							
							o = operationFactory.getSubtractionInstance();
							o.setStack(stack);
							o.executeOperation();
							break;
						case '*':
							o = operationFactory.getMultiplicationInstance();
							o.setStack(stack);
							o.executeOperation();
							break;
						case '/':
							o = operationFactory.getDivisionInstance();
							o.setStack(stack);
							o.executeOperation();
							break;
						case '%':
							o = operationFactory.getModuloInstance();
							o.setStack(stack);
							o.executeOperation();
							break;
						case '&':
							o = operationFactory.getAndInstance();
							o.setStack(stack);
							o.executeOperation();
							break;
						case '|':
							o = operationFactory.getOrInstance();
							o.setStack(stack);
							o.executeOperation();
							break;
						case '=':
							o = operationFactory.getEqualsInstance();
							o.setStack(stack);
							o.executeOperation();
							break;
						case '<':
							o = operationFactory.getLesserInstance();
							o.setStack(stack);
							o.executeOperation();
							break;
						case '>':
							o = operationFactory.getGreaterInstance();
							o.setStack(stack);
							o.executeOperation();
							break;
						case '~':
							o = operationFactory.getNegationInstance();
							o.setStack(stack);
							o.executeOperation();
							break;
						case 'a':
							/*o = operationFactory.getApplyInstance();
							o.setStack(stack);
							o.executeOperation();*/
							String b = stack.pop();
							
							if(b.charAt(0) == '['){
								b = b.substring(1, b.length()-1); 
								inputStream = inputStream.substring(0, i+1) + b + inputStream.substring(i+1);
							}
							else{
								throw new InvalidStreamContentException("Block expected for apply operator");
							}
							break;
						case 'b':
							o = operationFactory.readBlockInstance();
							o.setStack(stack);
							o.executeOperation();
							break;
						case 'c':
							o = operationFactory.getCopyInstance();
							o.setStack(stack);
							o.executeOperation();
							break;
						case 'd':
							o = operationFactory.getDeleteInstance();
							o.setStack(stack);
							o.executeOperation();
							break;
						case 'i':
							o = operationFactory.readIntegerInstance();
							o.setStack(stack);
							o.executeOperation();
							break;
						case 'w':
							if(stack.size() > 0) {
								outputStream += stack.pop() + '\n';							
							}
							break;
						case 'x':
							System.exit(0);
						default:
							throw new InvalidStreamContentException(String.valueOf(c));
					}
				}
			}
		}
	}	
	
	public void clear(){
		this.inputStream = "";
		this.outputStream = "";
		this.stack.clear();
	}

	public String getInputStream() {
		return inputStream;
	}

	public void setInputStream(String inputStream) {
		this.inputStream = inputStream;
	}

	public String getOutputStream() {
		return outputStream;
	}

	public void setOutputStream(String outputStream) {
		this.outputStream = outputStream;
	}

	public Deque<String> getStack() {
		return stack;
	}

	public void setStack(Deque<String> stack) {
		this.stack = stack;
	}	

}
