package com.simplecalculator;

public class validation {
	
	
	public boolean validateNumber(String arg) {
		String regex = "[-+]?[0-9]{1,13}(\\.[0-9]*)?";
		if(arg.matches(regex))
			return true;
		else
			return false;
	}

}
