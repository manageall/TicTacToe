
public class Player {
	private String name;
	private char symbol;

	public void Set(String tName, char tSymbol){
		name = tName; // Single word
		symbol = tSymbol;
	}
	
	public String GetName(){
		return name;
	}
	
	public char GetSymbol(){
		return symbol;
	}
}
