package bankProcessing;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import client.ConsoleApp;

public class Main {
	
	private static final Logger logger = LogManager.getLogger(Main.class);

	public static void main(String[] args) {
		
		ConsoleApp console = new ConsoleApp();
		logger.info("Starting Application ...");
		console.start();
		logger.info("Application Exited");
		
	}
}