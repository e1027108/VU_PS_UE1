package Operators;

import java.util.ArrayDeque;
import java.util.Deque;

public abstract class Operation {

	protected Deque<String> stack;
	
	public Operation() {
		this.setStack(new ArrayDeque<String>());
	}

	public Deque<String> getStack() {
		return stack;
	}

	public void setStack(Deque<String> stack) {
		this.stack = stack;
	}
	
	//throws different exceptions for different Operators
	public abstract void executeOperation() /*throws Exception*/;//TODO activate exception throw
	
	//TODO later: recursive method for blocks?
}