package Operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read_block extends Operation{

	@Override
	public void executeOperation() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		input = br.readLine();
		input = "[" + input + "]";
		stack.push(input);
	}

}
