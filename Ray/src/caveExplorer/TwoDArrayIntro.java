package caveExplorer;

public class TwoDArrayIntro {

	public static void main(String[] args) {
		boolean[][] mines = new boolean[6][6];
		createMines(mines, 0);
		String[][] field = new String[mines.length][mines[0].length];
		matchValues(field, mines);
		printPic(field);
	}
		
	private static void matchValues(String[][] field, boolean[][] mines) {
		for(int row = 0; row < field.length; row++){
			for(int col = 0; col<field[0].length; col++){
				if(mines[row][col])
					field[row][col] = "X";
				else
					field[row][col] = countAdjacent(mines, row, col);
			}
		}
	}

	private static int countAdjacent(boolean[][] mines, int row, int col) {
		int count = 0;
		for(int r = row-1; r <= row+1; r++){
			for(int c = col-1; c<=col+1; c++){
				if(row != r && col != c){
					if(r >= 0 && r < mines.length && c >= mines[0].length )
				}
			}
		}
	}

	private static void createMines(boolean[][] mines, int numberOfMines) {
		if(numberOfMines <= mines.length){
			while(numberOfMines > 0){
				int row = (int)Math.random()*mines.length;
				int column = (int)Math.random()*mines[0].length;
				if(!mines[row][column]){
					mines[row][column] = true;
					numberOfMines--;
				}
			}
		}
	}

	public static int taxiDistance(){
		// d = |x1-x2|+|y1+y2|
		return -1;
	}
	public static void printStringArray2(String[][] arr){
		for(int i = 0; i<arr.length; i++){
			System.out.print("[");
			for(int j = 0; j<arr[i].length-1; j++){
				System.out.print(arr[i][j]+", ");
			}
			System.out.print(arr[i][arr[i].length-1]+"]");
			System.out.println();
		}
	}
	public static void printPic(String[][] arr){
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	/*public static final printPicStuff(){
		//arrays, items per array
				String[][] arr2D = new String[10][12];
				for(int i = 0; i<arr2D.length; i++){
					for(int j = 0; j<arr2D[0].length; j++){
						arr2D[i][j] = " ";
					}
				}
				for(int i = 7; i<arr2D.length; i++){
					for(int j = 0; j<arr2D[0].length; j++){
						arr2D[i][j] = "M";
					}
				}
				arr2D[0][1] = "\\";
				arr2D[0][2] = "|";
				arr2D[0][3] = "/";
				arr2D[1][1] = "-";
				arr2D[1][2] = "O";
				arr2D[1][3] = "-";
				arr2D[2][1] = "/";
				arr2D[2][2] = "|";
				arr2D[2][3] = "\\";
				
				for(int i = 0; i<arr2D.length; i++){
					arr2D[i][0] = ""+i;
				}
				int birds = 10;
				for(int i = 0; i<birds; i++){
					int coord = (int)(Math.random()*4)+3;
					int sec = (int)(Math.random()*12);
					while(birds > 0){
						if(arr2D[coord][sec].equals(" ")){
							arr2D[coord][sec] = "m";
							birds--;
						}
						else{
							coord = (int)(Math.random()*4)+3;
							sec = (int)(Math.random()*12);
						}
					}
				}
				for(int i = 0; i<arr2D[0].length; i++){
					arr2D[0][i] = "_";
				}
				String[][] dd = new String[10][10];
				printPic(arr2D);
			}*/
}
