package game;

import java.util.Scanner;

public class Input {
	public static String[] collectInput() {
		// TODO: Implement method
		Scanner scan = new Scanner(System.in);
		String command = scan.nextLine();
		return command;
	}
	
	public static void parse(String[] command, Player player) {
		/*
		 * 'action' relates to the overall functionality we want to perform this
		 * includes, moving the player, interacting with an object and quitting
		 */
		String action = command[0].toUpperCase().intern();
		
		/*
		 * 'details' refers to additional options for the specific commands. Set to null
		 * initially, because we don't know if the player will enter an additional
		 * command...
		 */
		String details = null;

		if (command.length > 1) {
			details = command[1].toUpperCase().intern();
		}

		if (action == "GO" | action == "MOVE") {
			// What to do when the 'action' specified is to move
		} else if (action == "INTERACT") {
			// What to do when the 'action' specified is to interact
		} else if (action == "QUIT") {
			Main.endGame();
		}
	}

	public static void movePlayer(String details, Player player) {
		// TODO: Implement method
	}

	public static void objectInteraction(String details, Player player) {
		// TODO: Implement method
	}
}
