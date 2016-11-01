package caveExplorer;

public class CaveRoom {
	//some flavor stuff
	private String description;
	private String contents;
	private String defaultContents;
	private String directions;
	//important stuff
	private Door[] doors;
	private String[] borderingRooms;
	//constants
	private static final int NORTH  = 0;
	private static final int EAST  = 1;
	private static final int WEST  = 2;
	private static final int SOUTH  = 3;
	public CaveRoom(String description){
		this.description = description;
	}
	//sets up cave for entrance
	public void enter() {
		this.contents = "x";
	}

}
