package com.ITT.rajcomics.validator;

import java.util.Scanner;

public class GetInput{
	public int getInput(int numOptions){
		Scanner scanner = new Scanner(System.in);
		if(!scanner.hasNextInt()){
			return -2;
		}
		else{	
			int enteredOption = scanner.nextInt();
			if(enteredOption > numOptions || enteredOption<=0)
				return -1;
			else 
				return enteredOption;
		}	
			
		//scanner.close();
	}
}
