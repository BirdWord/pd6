package caveExplorer;

public class Inventory {
	private boolean hasMap;
	private String map;
	public Inventory(){
		hasMap = true;
		updateMap();
	}
	public boolean isHasMap() {
		return hasMap;
	}
	public void setHasMap(boolean hasMap) {
		this.hasMap = hasMap;
	}
	public String getDescription() {
		if(hasMap)
			return map;
		return "There is nothing in your inventory.";
	}
	public static void updateMap(){
		
	}
}
