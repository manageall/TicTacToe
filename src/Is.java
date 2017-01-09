public final class Is {
	
	//Returns True if Argument is "y","Y","n" or "N"
	public static Boolean YesNo(String arg){
		if(arg.matches("^[yYnN]{1}")){
			return true;
		} else {
			return false;
		}
	}
	
	public static Boolean Word(String arg){
		if(arg.matches("^[a-zA-ZÂ≈‰ƒˆ÷¸‹È…Ë»]*")){
			return true;
		} else {
			return false;
		}	
	}
	
	public static Boolean Letter(String arg){
		if(arg.matches("\\p{L}{1}")){
			return true;
		} else {
			return false;
		}
	}
	
	public static Boolean Digit(String arg){
		if(arg.length() == 1 && Is.Int(arg)){
			return true;
		} else {
			return false;
		}
	}
	
	public static Boolean Int(String arg){
		if(arg == arg.replaceAll("\\D","")){
			return true;
		} else {
			return false;
		}
	}
	
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
	
	public static Boolean IntBetween(String arg, int floor, int ceiling){
		if(Is.Int(arg) && Is.DoubleBetween(arg, floor, ceiling)){
			return true;
		} else {
			return false;
		}
	}
}
