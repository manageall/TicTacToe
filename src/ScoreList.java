import java.util.*;

public class ScoreList {
	private ArrayList<Result> results = new ArrayList<Result>();
	
	public void insert(Result tResult){
		results.add(tResult);
		return;
	}
	
	public void print(){
		Map<String, Integer> myMap = summarize();
		System.out.println("Score list\n--------------------------");
		System.out.println("Name\t\tWins");
		
		for ( String key : myMap.keySet() ) {
		    System.out.println( key + "\t\t" + myMap.get(key));
		}
	}
	
	private Map<String, Integer> summarize(){
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		
		for(int i = 0; i < results.size(); i++){
			String tName = results.get(i).getWinnerName();
			myMap.putIfAbsent(tName, 0);
			myMap.replace(tName, myMap.get(tName) + 1);
		}
		return myMap;
	}
}
