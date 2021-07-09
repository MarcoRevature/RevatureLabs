package game;

public class Main {
	private static RoomManager manager = new RoomManager(10);
	private static boolean running = true;
	
	public static void main(String[] args) {
		manager.init();
		Player player = new Player();
		Menus.printInstructions();
		player.setCurrentRoom(manager.getStartingRoom());
		
		while (running) {
			Menus.printRoom(player);
			String[] input = Input.collectInput();
			Input.parse(input, player);
		}
		
		if (!running) {
			System.out.println("Thanks for playing");
		}
	}
	
	public static void endGame() {
		running = false;
	}
}
