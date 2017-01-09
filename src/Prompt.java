import java.util.*;

/* Class below does not conform to DRY piciple
 * Will correct later
 */

public final class Prompt {
	private static Scanner myScanner = new Scanner(System.in);

	// Wants "Y" (Yes) or "N" (No)
	public static boolean YesNo(String prompt){
		String userInput = "";
		Boolean repeat = true;
		while(repeat){
			System.out.print(prompt + ": ");
			userInput = myScanner.nextLine();
			if(Is.YesNo(userInput)){
				//repeat = false;
				break;
			} else {
				System.out.println("Your input did not match the request \"" + prompt + "\"\n");
			}
		}
		if(userInput.matches("[yY]")){
			return true;
		} else {
			return false;
		}
	}

	public static String Match(String prompt, String expression){
		String userInput = "";
		Boolean repeat = true;
		while(repeat){
			System.out.print(prompt + ": ");
			userInput = myScanner.nextLine();
			if(userInput.matches(expression)){
				repeat = false;
			} else {
				System.out.println("Your input did not match the request \"" + prompt + "\"");
			}
		}
		return userInput;
	}
	
	public static String Word(String prompt){
		String userInput = "";
		Boolean repeat = true;
		while(repeat){
			System.out.print(prompt + ": ");
			userInput = myScanner.nextLine();
			if(Is.Word(userInput)){
				repeat = false;
			} else {
				System.out.println("Your input did not match the request \"" + prompt + "\"");
			}
		}
		return userInput;
	}
	
	public static int Int(String prompt){
		String userInput = "";
		Boolean repeat = true;
		while(repeat){
			System.out.print(prompt + ": ");
			userInput = myScanner.nextLine();
			if(Is.Int(userInput)){
				repeat = false;
			} else {
				System.out.println("Your input did not match the request \"" + prompt + "\"");
			}
		}
		return Integer.parseInt(userInput);
	}

	public static int IntBetween(String prompt, int floor, int ceiling){
		String userInput = "";
		Boolean repeat = true;
		while(repeat){
			System.out.print(prompt + ": ");
			userInput = myScanner.nextLine();
			if(Is.IntBetween(userInput, floor, ceiling)){
				repeat = false;
			} else {
				System.out.println("Your input did not match the request \"" + prompt + "\"");
			}
		}
		return Integer.parseInt(userInput);
	}
	
	public static int DoubleBetween(String prompt, double floor, double ceiling){
		String userInput = "";
		Boolean repeat = true;
		while(repeat){
			System.out.print(prompt + ": ");
			userInput = myScanner.nextLine();
			if(Is.DoubleBetween(userInput, floor, ceiling)){
				repeat = false;
			} else {
				System.out.println("Your input did not match the request \"" + prompt + "\"");
			}
		}
		return Integer.parseInt(userInput);
	}
	
	public static int Digit(String prompt){
		String userInput = "";
		Boolean repeat = true;
		while(repeat){
			System.out.print(prompt + ": ");
			userInput = myScanner.nextLine();
			if(Is.Digit(userInput)){
				repeat = false;
			} else {
				System.out.println("Your input did not match the request \"" + prompt + "\"");
			}
		}
		return Integer.parseInt(userInput);
	}

	public static String Letter(String prompt){
		String userInput = "";
		Boolean repeat = true;
		while(repeat){
			System.out.print(prompt + ": ");
			userInput = myScanner.nextLine();
			if(Is.Letter(userInput)){
				repeat = false;
			} else {
				System.out.println("Your input did not match the request \"" + prompt + "\"");
			}
		}
		return userInput;
	}
}
