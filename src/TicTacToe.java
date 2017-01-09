
public class TicTacToe {

	public static void main(String[] args) {
		if(Prompt.YesNo("Greetings professor Falken.\nShall we play a game?[Y/N]")){
			System.out.println("Great! Let's begin..\n");
			Boolean runAgain = true;
			ScoreList scoreList = new ScoreList();
			while(runAgain){
				
				Game game = new Game();
				Result result = game.Start();
				scoreList.insert(result);
				
				if(!Prompt.YesNo("Shall we give it another try?[Y/N]")){
					runAgain = false;
					scoreList.print();
				} else{
					System.out.println("Great! Get back up on that horse!");
				}
			}
		} else {
			System.out.println("Ok, perhaps another time then.");
		}
		System.out.println("\nGood bye.");
		System.exit(0);
	}
}
