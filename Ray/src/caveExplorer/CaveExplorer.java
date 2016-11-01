package caveExplorer;

import java.util.Scanner;

public class CaveExplorer {
	public static CaveRoom caves[][];
	public static Scanner in;
	public static CaveRoom currentRoom;
	public static Inventory inventory;
	public static void main(String args[]){
		caves = new CaveRoom[5][5];
		for(int i = 0; i<caves.length; i++){
			for(int j = 0; j<caves[0].length; j++){
				caves[i][j] = new CaveRoom("This caves has coordinates ("+i+","+j+").");
			}
		}
		currentRoom = caves[0][1];
		currentRoom.enter();
	}
}

