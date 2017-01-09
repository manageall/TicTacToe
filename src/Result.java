
public class Result {
	public Player pO;
	public Player pX;
	public Player winner;
	
	public String myResult;
	
	public Result(Player pO, Player pX){
		this.pX = pO;
		this.pX = pX;
	}
	
	public String getWinnerName(){
		if(winner != null){
			return winner.GetName();
		} else {
			return "Draw";
		}
	}
}
