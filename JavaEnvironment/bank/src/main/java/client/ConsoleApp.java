package client;

import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import common.pojo.Client;
import common.pojo.Product;
import dao.ProductDAO;
import service.ClientService;
import service.ProductService;

public class ConsoleApp {
	//Needs change into proper bank interaction page
	private static final Logger logger = LogManager.getLogger(ConsoleApp.class);

	private ProductService service = new ProductService();
	private ClientService cservice = new ClientService();
	
	private static Client client = null;

	private static Scanner input = new Scanner(System.in);

	public void start() {
		
		boolean quit = false;

		do {
			showMenu();
			
			System.out.println("Enter Action: ");
			String choice = input.next();
			
			switch (choice) {
				case"1":
					login(input);
					break;
				case"2":
					newClient(input);
					break;
				case"3":
					quit = true;
					break;
				case"4":
					test();
					break;
				default:
					break;
			}
		} while(!quit);
		
		input.close();
		
		System.out.println("Exited.");

	}

	private String getInput(String prompt, Scanner input) {
		System.out.print(prompt);
		return input.next();
	}

	private void showMenu() {
		System.out.println("1.Login\n"
				+"2.Create account\n"
				+"3.Quit\n"
				+ "4.Test");
	}

	private void login(Scanner input) {
		String name = getInput("Enter name: ", input);
		if(name == null) {
			System.out.println("No user found");
		}
		String pass = getInput("Enter password: ", input);
		if(pass != "password") {
			System.out.println("Invalid password " + name + "\n");
		}
		//check database
		client = new Client(name, pass);
		System.out.println("Logged in, welcome " + name);
		logger.info("Logged in");
		clientMenu(input);
	}
	
	private void newClient(Scanner input) {
		System.out.println("Create account");
		String newName = getInput("Enter client name: ", input);
		String newPass = getInput("Enter password: ", input);
	}
	
	private void test() {
		try {
			List<Client> clients = cservice.findAcc();
			printList(clients);
		} catch (Exception e) {
			System.err.println("System Error: "+e.getMessage());
		}
	}
	
	private void printList(List<Client> clients) {
		// header
		System.out.println("ID | Employee | Gender");
		// data
		for (Client c : clients) {
			System.out.println(c.getId() + " | " + c.getname() + " | " + c.getpass());
		}
	}
	
	private void clientMenu(Scanner input) {
		
		boolean quit = false;
		
		do {
			System.out.println("Client Menu: \n"
					+"1.Balance\n"
					+"2.Deposit\n"
					+"3.Withdraw\n"
					+"4.Transfer\n"
					+"5.Quit\n");
			String choice = getInput("Enter Action: ", input);
			
			switch (choice) {
				case"1":
					balance();
					break;
				case"2":
					deposit();
					break;
				case"3":
					withdraw();
					break;
				case"4":
					transfer();
					break;
				case "5":
					quit = true;
					break;
				default:
					break;
			}
		}while(!quit);
	}
	
		private void balance() {
			System.out.println("Your balance is: $");
		}
		
		private void deposit() {
			System.out.println("Enter deposit ammount: ");
			double deposit = input.nextDouble();
			System.out.println("New balance: " + deposit);
		}
		
		private void withdraw() {
			System.out.println("Enter deposit ammount: ");
			double withdraw = input.nextDouble();
			System.out.println("New balance: " + withdraw);
		}
		
		private void transfer() {
			System.out.println("Enter deposit ammount: ");
			double transfer = input.nextDouble();
			System.out.println("New balance: " + transfer);
		}
	
	
//	private void addView(Scanner input) {
//		
//		String title = getInput("Title:",input);
//		String category = getInput("Category:",input);
//		String price = getInput("Price: ",input); 
//		//TODO: handle invalid input (for ex: alphabets in price)
//		Product product = new Product(0,title,category,Double.parseDouble(price));
//		try {
//			service.save(product);
//			System.out.println("Added Product");
//		} catch (Exception e) {
//			System.out.println("Error: unable to save :"+e.getMessage());
//			logger.error(e);
//		}
//		
//	}
	
}
