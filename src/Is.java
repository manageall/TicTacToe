public final class Is {
	
	//Returns true if arg is "y","Y","n" or "N"
	public static Boolean YesNo(String arg){
		if(arg.matches("^[yYnN]{1}")){
			return true;
		} else {
			return false;
		}
	}
	
	//Returns true if arg is a word without punctuations and spaces.
	public static Boolean Word(String arg){
		if(arg.matches("^[a-zA-ZåÅäÄöÖüÜéÉèÈ]*")){
			return true;
		} else {
			return false;
		}	
	}
	
	//Returns true if arg is a letter
	public static Boolean Letter(String arg){
		if(arg.matches("\\p{L}{1}")){
			return true;
		} else {
			return false;
		}
	}
	
	//Returns true id arg is a digit
	public static Boolean Digit(String arg){
		if(arg.length() == 1 && Is.Int(arg)){
			return true;
		} else {
			return false;
		}
	}
	
	//Returns true if arg is and integer
	public static Boolean Int(String arg){
		if(arg == arg.replaceAll("\\D","")){
			return true;
		} else {
			return false;
		}
	}
	
	//Returns true if arg is a double between floor and ceiling
	//converts Integer input to double
	public static Boolean DoubleBetween(String arg, double floor, double ceiling){
		double dArg = Double.parseDouble(arg); // Not working
		double dFloor = floor;
		double dCeiling = ceiling;
		if(dFloor <= dArg && dArg <= dCeiling){
			return true;
		} else {
			return false;
		}
	}
	
	//Returns true if arg is a double between floor and ceiling
	public static Boolean IntBetween(String arg, int floor, int ceiling){
		if(Is.Int(arg) && Is.DoubleBetween(arg, floor, ceiling)){
			return true;
		} else {
			return false;
		}
	}
}
