package Operators;

import java.io.IOException;
import java.io.InputStreamReader;

public class Read_integer extends Operation {

	@Override
	public void executeOperation() {

		InputStreamReader in = new InputStreamReader(System.in);
		
		String input = "";
		boolean read = true;
		boolean digitstart = false;
		
		char[] buffer = new char[1];
		
		while(read){
			try {
				in.read(buffer, 0, 1);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if (buffer[0] > -1){
				if(Character.isDigit(buffer[0])){
					input = input + buffer[0];
					digitstart = true;
				}
				else{
					if(digitstart){
						stack.push(input);
						break;
					}
				}
								
			}
		}
				
	}

}
