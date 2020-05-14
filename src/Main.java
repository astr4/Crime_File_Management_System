import java.util.Scanner;

public class Main { // Main class to run project
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // Scanner Object
		User user = new User(); // User Object
		Admin admin = new Admin(); // Admin Object

		while (true) {
			displayMenu(); // Displays the menu
			System.out.print("Please select your choice: ");
			int selection = input.nextInt(); // get the selection from user
			switch (selection) {
			case 0: //terminate the system.
				System.out.println("Have a good day, system terminated...");
				System.exit(0); //terminate
			case 1: // User Login
				System.out.println("Please enter your TC.Kimlik number: ");
				long tcNum = input.nextLong(); // get TC from user
				input.nextLine();
				System.out.println("Please enter your password: ");
				String uPass = input.nextLine(); //get password from user
				if (user.userLogin(tcNum, uPass)) { // Check the user information according to the database
					user.userdisplay(); // Display the user menu
					System.out.print("\nPlease select your option: ");
					int option = input.nextInt(); // get the choice from user.
					switch (option) {
					case 1: // Adding new crime file to database
						System.out.println("Welcome to the Crime File Management System!");
						CrimeFile cfile = new CrimeFile(); // new CrimeFile Object
						user.addfile(cfile); // adding here
						break;
					case 2: // Adding new missing person to database
						MissingPerson mperson = new MissingPerson();// new MissingPerson Object
						user.addmissingperson(mperson); // adding the missing person here
						break;
					case 3:
						user.viewhotnews();
						break;
					case 4:
						UserComplaint ucomp = new UserComplaint();
						user.addComplaint(ucomp);
						break;
					case 5:
						Feedback feedback = new Feedback();
						user.addFeedback(feedback);
						break;
					}
				} else { // if user login not successful
					System.out.println("\nAccess Denied");
				}
				break;
			case 2:
				System.out.println("Please enter your police ID: ");
				int policeId = input.nextInt(); // get the police id from admin
				input.nextLine();
				System.out.println("Please enter your police password: ");
				String policePass = input.nextLine(); // get the password from admin
				if (admin.adminLogin(policeId, policePass)) { // You can type police ID as 12345 adminPass as admin to login
					admin.admindisplay(); // displays the admin menu
					System.out.print("\nPlease select your option: ");
					int option = input.nextInt(); // gets the choice from admin
					switch (option) {
					case 1: // Adding new most wanted person
						System.out.println("Welcome to the Crime File Management System!");
						MostWanted mwanted = new MostWanted(); // new MostWantedPerson Object
						admin.addmostwantedperson(mwanted);
						break;
					case 2: // Displays all most wanted persons
						admin.viewmostwantedperson();
						break;
					case 3: // Adding new missing person
						MissingPerson mperson = new MissingPerson(); // new MissingPerson Object
						admin.addmissingperson(mperson);
						break;
					case 4: // Displays all missing persons
						admin.viewmissingperson();
						break;
					case 5: // Deletes the most wanted person according to id
						System.out.println("Enter the most wanted id for delete: ");
						int id = input.nextInt(); // get the most wanted id from user
						admin.deletemostwantedperson(id);
						break;
					case 6: // Deletes the missing person according to id
						System.out.println("Enter the missing person id for delete: ");
						int mid = input.nextInt(); // get the missing person id from user
						admin.deletemissingperson(mid);
						break;
					case 7: // Adding new Criminal Report the database
						CriminalReport creport = new CriminalReport(); // new CriminalReport Object
						admin.addcriminalreport(creport);
						break;
					case 8: // Displays Criminal Reports
						admin.viewcriminalreports();
						break;
					case 9:
						HotNews hnews = new HotNews();
						admin.addHotNews(hnews);
						break;
					case 10:
						System.out.println("Enter the hotnews id for delete: ");
						int hnewsid = input.nextInt(); // get the hot news id 
					    admin.deletehotnews(hnewsid); 
						break;
					case 11:
						admin.viewuserscomplaints();
						break;
					case 12:
						UserComplaint ucomp = new UserComplaint();
						admin.addReplytoComplaint(ucomp);
						break;
					case 13:
						admin.viewusersfeedback();
						break;
					case 14:
						System.out.println("Enter the feedback id for delete: ");
						int fid = input.nextInt(); // get the feedback id from user
						admin.deletefeedback(fid);
						break;
					}
				} else { // if admin login not successful
					System.out.println("\nAccess Denied");
				}
				break;
			case 3: // Adds new User to datebase
				user.userRegister();
				break;
			default: // if entered number is not found
				System.out.println("Invalid number entered!");
			}
		}
	}
	public static void displayMenu() { // Displays the main menu
		System.out.println("\nPress 0 for exit");
		System.out.println("Press 1 for user login");
		System.out.println("Press 2 for admin login");
		System.out.println("Press 3 for user register");
	}
}
