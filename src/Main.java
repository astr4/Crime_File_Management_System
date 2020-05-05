
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		UserEntrence ue = new UserEntrence();
		AdminEntrence ae = new AdminEntrence();

		while (true) {
			displayMenu();
			System.out.print("Please select your choice: ");
			int selection = input.nextInt();
			switch (selection) {
			case 0:
				System.out.println("Have a good day, system terminated...");
				System.exit(0);
			case 1:
				System.out.println("Please enter your TC.Kimlik number: ");
				long tcNum = input.nextLong();
				input.nextLine();
				System.out.println("Please enter your password: ");
				String uPass = input.nextLine();
				if (ue.userLogin(tcNum, uPass)) { // Check the user information according to the database
					ue.userdisplay(); // Display the user menu
					System.out.print("\nPlease select your option: ");
					int option = input.nextInt();
					switch (option) {
					case 1:
						System.out.println("Welcome to the Crime File Management System!");
						CrimeFile cfile = new CrimeFile();
						ue.addfile(cfile);
						break;
					case 2:
						MissingPerson mperson = new MissingPerson();
						ue.addmissingperson(mperson);
						break;
					}
				} else {
					System.out.println("\nAccess Denied");
				}
				break;
			case 2:
				System.out.println("Please enter your police ID: ");
				int policeId = input.nextInt();
				input.nextLine();
				System.out.println("Please enter your police password: ");
				String policePass = input.nextLine();
				if (ae.adminLogin(policeId, policePass)) { // You can type police ID as 12345 adminPass as admin to
															// login
					ae.admindisplay();
					System.out.print("\nPlease select your option: ");
					int option = input.nextInt();
					switch (option) {
					case 1:
						System.out.println("Welcome to the Crime File Management System!");
						MostWanted mwanted = new MostWanted();
						ae.addmostwantedperson(mwanted);
						break;
					case 2:
						ae.viewmostwantedperson();
						break;
					case 3:
						MissingPerson mperson = new MissingPerson();
						ae.addmissingperson(mperson);
						break;
					case 4:
						ae.viewmissingperson();
						break;
					case 5:
						System.out.println("Enter the most wanted id for delete: ");
						int id = input.nextInt();
						ae.deletemostwantedperson(id);
						break;
					case 6:
						System.out.println("Enter the missing person id for delete: ");
						int mid = input.nextInt();
						ae.deletemissingperson(mid);
						break;
					case 7:
						CriminalReport creport = new CriminalReport();
						ae.addcriminalreport(creport);
						break;
					case 8:
						ae.viewcriminalreports();
						break;
					}

				} else {
					System.out.println("\nAccess Denied");
				}
				break;
			case 3:
				ue.userRegister();
				break;
			default:
				System.out.println("Invalid number entered!");
			}
		}

	}
	// This is the main menu
	public static void displayMenu() {
		System.out.println("\nPress 0 for exit");
		System.out.println("Press 1 for user login");
		System.out.println("Press 2 for admin login");
		System.out.println("Press 3 for user register");
	}
}
