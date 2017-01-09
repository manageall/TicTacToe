public class Game {
	private Board board;
	Player pX = new Player();
	Player pO = new Player();
	Result result =  new Result(pX, pO);
	
	public Game(){
		String pXName = Prompt.Word("What is the name of player \"X\"?");
		String pOName = Prompt.Word("What is the name of player \"O\"?");
		
		pX.Set(pXName, 'X');
		pO.Set(pOName, 'O');	

		int boardSize = Prompt.Int("How big a board do you want (2-9)?");

		board = new Board(boardSize, boardSize);
	}
	
	public Result Start(){
		Player[] player = {pX,pO};
		
		board.Print();
		
		boolean isNoWinner = true;
		int turn = 0;
		while(isNoWinner){
			// Ask next player to enter coords
			String moveStr = Prompt.Match(player[turn].GetName() + " (" + player[turn].GetSymbol() + ")" + ", please enter coords H [space] V", "\\d+ \\d+");

			//Split into Ints
			String[] move = moveStr.split(" ");
			int x = Integer.parseInt(move[0])-1;
			int y = Integer.parseInt(move[1])-1;
			// check if box is free. if not re-ask
			if(board.isInsideBounds(x, y) == false){
				System.out.println("Your move is out of bounds. Try again.");
			} else if(board.boxIsFree(x, y)){
				board.SetBox(player[turn].GetSymbol(), x, y);			
				isNoWinner = !board.hasWinner() && !board.isFull();
				board.Print();
				
				if(turn == 0 && isNoWinner){
					turn = 1;
				} else if (isNoWinner) {
					turn = 0;
				}

			} else {
				System.out.println("Sorry. That box is taken. Try again.");
			}
		}
		
		if(board.hasWinner()){
			result.winner = player[turn]; // Player who did the last move
			System.out.println(result.winner.GetName() + " won.");
		} else if (board.isFull()){
			result.myResult = "It is a draw";
			result.winner = null;
		} else {
			result.myResult = "How did you end up here?"; // Should be impossible
		}
		return result;
	}
}
