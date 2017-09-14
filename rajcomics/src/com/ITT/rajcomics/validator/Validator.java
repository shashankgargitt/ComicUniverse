package com.ITT.rajcomics.validator;


 public class Validator implements ValidatorInterface{
	//GetInput getInput;
	public int validateOption(int numOptions){
		GetInput getInput = new GetInput();
		int option = getInput.getInput(numOptions);
		if(option == -2 ){
			System.out.println("number dal");			
		}
		if(option == -1 || option == 0)
			System.out.println("1 se " +numOptions+ " tak dal");
		return option;
	}
}