package client;

import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import common.pojo.Client;
import common.pojo.Product;
import dao.ProductDAO;
import service.ProductService;

public class ConsoleApp {
	//Needs change into proper bank interaction page
	private static final Logger logger = LogManager.getLogger(ConsoleApp.class);

	private ProductService service = new ProductService();
	
	private static Client client = null;

	private static Scanner input = new Scanner(System.in);

	public void start() {
		
		boolean quit = false;

		do {
			// show menu
			showMenu();
			//account
			//balance
			//withdraw
			//deposit
			
			System.out.println("Enter Action: ");
			String choice = input.next();
			
			switch (choice) {
				case"1":
					login(input);
					break;
				case "3":
					addView(input);
					break;
				case "6":
					quit = true;
					break;
				default:
					break;
			}
		} while(!quit);
		
		input.close();
		
		System.out.println("Exited.");

//		updateView();
//		deleteView();

	}

	private void addView(Scanner input) {
		
		String title = getInput("Title:",input);
		String category = getInput("Category:",input);
		String price = getInput("Price: ",input); 
		//TODO: handle invalid input (for ex: alphabets in price)
		Product product = new Product(0,title,category,Double.parseDouble(price));
		try {
			service.save(product);
			System.out.println("Added Product");
		} catch (Exception e) {
			System.out.println("Error: unable to save :"+e.getMessage());
			logger.error(e);
		}
		
	}

	private String getInput(String prompt, Scanner input) {
		System.out.println(prompt);
		return input.next();
	}

	private void showMenu() {
		System.out.println("1.List");
		System.out.println("2.Search");
		System.out.println("3.Add");
		System.out.println("4.Update");
		System.out.println("5.Delete");
		System.out.println("6.Quit");
	}

	private void login(Scanner input) {
		System.out.println("Enter name: ");
		String user = input.next();
		if(user == null) {
			System.out.println("No user found");
		}
		System.out.println("Enter password: ");
		String pass = input.next();
		if(pass != passInSQL) {
			System.out.println("Invalid password " + user);
		}
		//check database
		client = new Client(user,pass);
		System.out.println("Logged in, welcome " + user);
		logger.info("Logged in");
	}
	
}
