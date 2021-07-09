package game;

import fixtures.Room;

public class Menus {
	public static void printRoom(Player player) {
		System.out.println(":::: CURRENT ROOM ::::");
		System.out.println("Name: " + player.getCurrentRoom().getName());
		System.out.println("Short Description: " + player.getCurrentRoom().getShortDescription());
		System.out.println("Long Description: " + player.getCurrentRoom().getLongDescription());
		Menus.printRoomExits(player);
		Menus.printInteractableObjects(player.getCurrentRoom());
	}
	
	public static void printInstructions() {
		System.out.println("To move the player, type one of the cardinal directions "
				+ "\n(North, South, East, West)"
				+ "\nUse 'look' to inspect the room to find exits or interactible objects"
				+ "\nUse 'interact' to interact with the object in the room"
				+ "\nUse 'quit' to exit game");
	}
	
	public static void printRoomExits(Player player) {
		// TODO: Implement Method
	}
	
	public static void printInteractableObjects(Room room) {
		// TODO: Implement Method
	}
}
