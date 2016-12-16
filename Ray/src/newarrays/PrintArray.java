package newarrays;

public class PrintArray {
	private static boolean[][] grid;
	public static void main(String[] args) {
		grid = new boolean[5][5];
		grid[4][3] = true;
		grid[3][1] = true;
		grid[4][2] = true;
		print(grid);
	}
	public static void print(boolean[][] arr){
		for(boolean[] row: arr){
			for(boolean b: row){
				if(b)
					System.out.print("O");
				else
					System.out.print("X");
			}
			System.out.println();
		}
	}

}
