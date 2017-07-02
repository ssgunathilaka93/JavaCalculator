package com.simplecalculator;

public class calculator {

	public static void main(String[] args) {
		
		if(args.length == 3)
		{
			validation val = new validation();
			if(!val.validateNumber(args[0])) {
				System.out.println("Invalid no1");
			}
			else if(!val.validateNumber(args[2])) {
				System.out.println("Invalid no2");
			}
			else {
				double no1 = Double.parseDouble(args[0]);
				String operator = args[1];
				double no2 = Double.parseDouble(args[2]);
				System.out.println(no1 + operator + no2);
				String result = null;
				Operations op = new Operations();
				
				switch (operator) {
				case "+":
					result = String.valueOf(op.sum(no1, no2));
					break;
				case "-":
					result = String.valueOf(op.sub(no1, no2));
					break;
				case "/":
					result = String.valueOf(op.div(no1, no2));
					break;
				case "*":
					result = String.valueOf(op.mul(no1, no2));
					break;
				case "^":
					result = String.valueOf(op.sqr(no1, no2));
					break;
				case "%":
					result = "Square root of no1 : " + String.valueOf(op.sqrt(no1)) + " and no2 : " + String.valueOf(op.sqrt(no2));
					break;
				default:
					System.out.println("Please enter valid operator");
				}
				System.out.println("Result is : " + result);
			}
		}
		else {
			System.out.println("Please enter proper format");
		}
	}

}
