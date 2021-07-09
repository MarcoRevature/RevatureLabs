package fixtures;

public class Room extends Fixture {
	private Room[] exits = new Room[10];
	private Fixture[] items;
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}
	
	public Room getExit(String direction) {
		return null;
	}
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	
	public void setExits(Room exit, int index) {
		this.exits[index] = exit;
	}
	
	public Fixture[] getItems() {
		return items;
	}
	
	public void setItems(Fixture... items) {
		this.items = items;
	}
}
