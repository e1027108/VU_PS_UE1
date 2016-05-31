package General;

import java.util.ArrayDeque;
import java.util.Deque;

import Operators.Copy;
import Operators.Negation;
import Operators.Operation;

public class Calculator {
	
	private String inputStream;
	private String outputStream;
	private Deque<String> stack;
	
	public Calculator(){
		stack = new ArrayDeque<String>();
		inputStream = "";
		outputStream = "";
	}
	
	public void executeInput(){
		//throws exception?
		String number = "";
		Operation o = null;
		for(int i = 0; i < inputStream.length(); i++){
			char c = inputStream.charAt(i);
			if(Character.isDigit(c)){
				number += c;
			}
			else{
				if(!number.equals("")){
					stack.push(number);
					number = "";
				}
				switch(c){
					case '~':
						o = new Negation();
						o.setStack(stack);
						o.executeOperation();
						break;
					case 'c':
						o = new Copy();
						o.setStack(stack);
						o.executeOperation();
						break;
					case 'w':
						while(stack.size() > 0) {
							outputStream += stack.pop() + '\n';							
						}
						break;
				}
			}
			
		}
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
