
public class Board {
	private int x;
	private int y;
	private char[][] grid;
	
	public boolean isInsideBounds(int tx, int ty){
		if(tx >= x || ty >= y ){
			return false;
		}else{
			return true;
		}
	}
	
	public Board(int tx, int ty){
		x = tx;
		y = ty;
		CreateGrid();
	}
	
	public Board(int xy){
		x = y = xy;
		CreateGrid();
	}
	
	public void SetBox(char mySymbol, int x, int y){
		grid[y][x] = mySymbol;
	}
	
	public void Print(){
		// Print Grid
		System.out.print("V\\H");
		for(int i = 0; i < x; i++){
			System.out.print(" " + (i+1) + "");
		}
		for(int i = 0; i < y; i++){
			System.out.print("\n " + (i+1) + " |");
			for(int j = 0; j < x; j++){
				System.out.print(grid[i][j] + "|");
			}
		}
		System.out.print("\n");
	}
	
	private void CreateGrid(){
		grid = new char[x][y];
	}
	
	public boolean hasWinner(){	

		//Check rows
		char last = 0;
		for(int i = 0; i < y; i++){ // for each row
			for(int j = 0; j < x; j++){ // for each cell in row
				if(last == 0){
					last = grid[i][j]; 
				} else if(last != grid[i][j]) {
					break;
				} else if(j == x-1){
					// Row complete
					System.out.println("Row complete");
					return true;
				}
			}
		}
		
		//Check cols
		last = 0;
		for(int i = 0; i < x; i++){ // for each row
			for(int j = 0; j < y; j++){ // for each cell in row
				if(last == 0){
					last = grid[j][i]; 
				} else if(last != grid[j][i]) {
					break;
				} else if(j == x-1){
					// Column complete
					System.out.println("Column complete");
					return true;
				}
			}
		}		
		
		//Check left to right diagonal
		last = 0;
		for(int i = 0; i < x; i++){
			if(last == 0){
				last = grid[i][i]; 
			} else if(last != grid[i][i]) {
				break;
			} else if(i == x-1){
				// Left to right diagonal complete
				System.out.println("Diagonal complete");
				return true;
			}
		}	
		
		//Check left to right diagonal
		last = 0;
		for(int i = 0; i < x; i++){
			if(last == 0) {
				last = grid[i][i]; 
			} else if(last != grid[i][i]) {
				break;
			} else if(i == x-1) {
				// Left to right diagonal complete
				System.out.println("Diagonal complete");
				return true;
			}
		}
		
		return false;
	}
	
	public boolean isFull(){
		for(int i = 0; i < x; i++){ // for each row
			for(int j = 0; j < y; j++){ // for each cell in row
				if(grid[j][i] == 0){
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean boxIsFree(int moveX, int moveY){
		boolean foo = (grid[moveY][moveX] == 'O' || grid[moveY][moveX] == 'X') ? false : true;
		return foo;
	}
}
