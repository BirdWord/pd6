package caveExplorer;

import java.util.Scanner;

public class TwoDArrayIntro {
	public static String[][] arr2D;
	public static String[][] pic;
	public static int i;
	public static int j;
	public static Scanner in;
	public static void main(String[] args) {
		//printMap(5,5);
		arr2D = new String[5][4];
		for(int row = 0; row<arr2D.length; row++){
			for(int col = 0; col<arr2D[row].length; col++){
				arr2D[row][col] = "("+row+", "+col+")";
			}
		}
		pic = new String[5][4];
		for(int i = 0; i<pic.length; i++){
			for(int j = 0; j<pic[i].length; j++){
				pic[i][j] = " ";
			}
		}
		i = 2;
		j = 3;
		in = new Scanner(System.in);
		startExploring();
	}
	
	
	private static void startExploring() {
		while(true){
			pic[i][j] = "X";
			printPic(pic);
			System.out.println("You are in room "+arr2D[i][j]+".");
			System.out.println("What do you wanna do?");
			String input = in.nextLine();
			while(!isValid(input)){
				System.out.println("I do believe you need to enter either W, A, S or D.");
				input = in.nextLine();
			}
			interpretInput(input.toLowerCase());
		}
	}


	private static void interpretInput(String input) {
		int iOrig = i;
		int jOrig = j;
		if(input.equals("w") && i>0){
			pic[i][j] = " ";
			i--;
		}
		else if(input.equals("a") && j>0){
			pic[i][j] = " ";
			j--;
		}
		else if(input.equals("s") && i<arr2D.length-1){
			pic[i][j] = " ";
			i++;
		}
		else if(j<arr2D[0].length-1){
			pic[i][j] = " ";
			j++;
		}
		if(iOrig == i && jOrig == j)
			System.out.println("You're at the edge. You can go no further.");
	}


	private static boolean isValid(String input) {
		String lower = input.toLowerCase();
		String[] keys = {"w", "a", "s", "d"};
		for(String key: keys){
			if(key.equals(lower))
				return true;
		}
		return false;
	}


	/*private static void printMap(int row, int length) {
		String[][] map = new String[row][length];
		System.out.print(" ");
		for(int i = 0; i<row; i++){
			System.out.print("____");
		}
		System.out.println();
		for(int i = 0; i<row*3; i++){
			System.out.print("|");
			for(int j = 0; j<length; j++){
				System.out.print("   |");
			}
			System.out.println();
		}
	}*/
	private static void mines(){
		boolean[][] mines = new boolean[6][12];
		createMines(mines, 10);
		String[][] field = 
				new String[mines.length][mines[0].length];
		matchValues(field, mines);
		printPic(field);
	}

	private static void matchValues(String[][] field, boolean[][] mines) {
		for(int row = 0; row < field.length; row++){
			for(int col = 0; col < field[0].length; col++){
				if(mines[row][col])
					field[row][col]="X";
				else{
					field[row][col] = 
							countAdjacent(mines, row, col);
				}
			}
		}
	}


	private static String countAdjacent(boolean[][] mines, 
			int r, int c) {
		/*only works sometimes
		 * //r and c represent coordinates of element 
		//we are providing a 
		//String for
		int count = 0;
		//loop through row above to row below
		for(int row = r-1; row <= r+1; row++){
			//loop through col left to col right
			for(int col = c-1; col <= c+1; col++){
				//exclude this element when counting
				if(row !=r && col != c){
					if(row >=0 && row < mines.length && col >= 0 && col < mines[row].length)
						
				}
			}
		}*/
		// this ones super slow
		/*int count = 0;
		for(int row = 0; row < mines.length; row++){
			for(int col = 0; col < mines[row].length; row++){
				if(Math.abs(row-r)+Math.abs(col-c) == 1 && mines[row][col])
					count++;
			}
		}
		return count+"";*/
		//most specific
		int count = 0;
		//above
		count+=validAndTrue(mines, r-1, c);
		//below
		count+=validAndTrue(mines, r+1, c);
		//right
		count+=validAndTrue(mines, r, c+1);
		//left
		count+=validAndTrue(mines, r, c-1);
		return count+"";
	}


	private static int validAndTrue(boolean[][] mines, int i, int j) {
		if(i>=0 && i<mines.length&& j>=0 && j<mines[0].length && mines[i][j]){
			return 1;
		}
		else return 0;
	}


	private static void createMines(boolean[][] mines, 
			int numberOfMines) {
		while(numberOfMines >0){
			int row = (int)(Math.random()*mines.length);
			int col = (int)(Math.random()*mines[0].length);
			if(!mines[row][col]){
				mines[row][col] = true;
				numberOfMines --;
			}
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
