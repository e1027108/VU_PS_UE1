package Operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read_block extends Operation{

	@Override
	public void executeOperation() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		try {
			input = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		input = "[" + input + "]";
		stack.push(input);
	}

}
