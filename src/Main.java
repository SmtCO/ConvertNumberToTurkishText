import java.util.Scanner;
import ConvertText.NumToText;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int lengthRule;
		
		
		do {
			try { 
		        System.out.print("Enter the number to be converted to text:");
				String input = scan.nextLine();
				lengthRule = input.length();
				if(lengthRule < 13) {
					System.out.println(NumToText.ConvertNumToText(input));
				} else {
					System.out.println("Please don't enter more than one hundred billion number! Try again.");
				}
		    } catch(NumberFormatException e) { 
		    	System.out.println("Please enter only numeric value! Try again.");
		    }
		} while (true);
	}

}