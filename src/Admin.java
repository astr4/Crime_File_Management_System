import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Admin { // Admin Class to Login and make operations in the system
	DatabaseConnection db = new DatabaseConnection(); // DatabeseConnection Object
	private int adminID;
	private String adminPass;
	Scanner input = new Scanner(System.in); // Scanner for input

	public Admin() { // Admin Constructor for database connection
		String url = "jdbc:mysql://" + db.getHost() + ":" + db.getPort() + "/" + db.getName()
				+ "?useUnicode=true&characterEncoding=utf8";

		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException ex) {
			System.out.println("Driver not found");
		}
		try {
			db.setCon(DriverManager.getConnection(url, db.getUserName(), db.getPassword()));
			System.out.println("Connection successful.");
		} catch (SQLException ex) {
			System.out.println("Connection fail.");
		}
	}
	public boolean adminLogin(int policeId, String policePass) { // Admin Login takes police id and password
		boolean loginSuccess = false; // login status
		String query = "select * from admin"; // query for admin login
		try {
			db.setStatement(db.getCon().createStatement());
			ResultSet rs = db.getStatement().executeQuery(query);

			while (rs.next()) {
				adminID = rs.getInt("adminID"); // get the adminID from result set
				adminPass = rs.getString("adminPass"); // get the adminPass from result set
				if ((policeId == getPoliceID()) && policePass.equals(getAdminPass())) { // if admin information matches with database
					System.out.println("Login Succesfull!");
					loginSuccess = true; // makes login success true
				}
			}
			if (loginSuccess == false) { // if login is not successful
				System.out.print("Wrong police ID  or admin password!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return loginSuccess; // returns the status
	}
	public void viewmissingperson() { //Displays the  all missing persons
		String query = "select * from missingperson"; //Query 

		try {
			db.setStatement(db.getCon().createStatement()); // database statement
			ResultSet rs = db.getStatement().executeQuery(query);

			while (rs.next()) { // gets the data from database and prints it to the screen
				String name = rs.getString("name");
				String surname = rs.getString("surname");
				String gender = rs.getString("gender");
				String placeofbirth = rs.getString("placeofbirth");
				Date dateofbirth = rs.getDate("dateOfbirth");
				double weight = rs.getDouble("weight");
				double height = rs.getDouble("height");
				Date dateMissing = rs.getDate("dateMissing");
				String skincolor = rs.getString("skinColor");
				String haircolor = rs.getString("hairColor");
				String eyecolor = rs.getString("eyeColor");

				System.out.println("Name: " + name);
				System.out.println("Surname: " + surname);
				System.out.println("Gender: " + gender);
				System.out.println("Place of birth: " + placeofbirth);
				System.out.println("Date of birth: " + dateofbirth);
				System.out.println("Weight: " + weight);
				System.out.println("Height: " + height);
				System.out.println("Date missing: " + dateMissing);
				System.out.println("Skin color: " + skincolor);
				System.out.println("Hair color: " + haircolor);
				System.out.println("Eye color: " + eyecolor);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void viewmostwantedperson() { //Displays the  all missing persons
		String query = "select * from mostwanted"; //Query

		try {
			db.setStatement(db.getCon().createStatement()); // database statement
			ResultSet rs = db.getStatement().executeQuery(query);

			while (rs.next()) { // gets the data from database and prints it to the screen
				String name = rs.getString("name");
				String surname = rs.getString("surname");
				String gender = rs.getString("gender");
				Date dateofbirth = rs.getDate("dateOfbirth");
				String placeofbirth = rs.getString("placeofbirth");
				String nationality = rs.getString("nationality");
				String language = rs.getString("language");
				String charges = rs.getString("charges");

				System.out.println("Name: " + name);
				System.out.println("Surname: " + surname);
				System.out.println("Gender: " + gender);
				System.out.println("Date of birth: " + dateofbirth);
				System.out.println("Place of birth: " + placeofbirth);
				System.out.println("Nationality: " + nationality);
				System.out.println("Language: " + language);
				System.out.println("Charges: " + charges);
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void viewcriminalreports() { //Displays the  all criminal reports
		String query = "select * from criminalreport"; //Query for criminal report

		try {
			db.setStatement(db.getCon().createStatement()); //database statement
			ResultSet rs = db.getStatement().executeQuery(query);

			while (rs.next()) { // gets the data from database and prints it to the screen
				String name = rs.getString("name");
				String surname = rs.getString("surname");
				String gender = rs.getString("gender");
				String regnumber = rs.getString("regnumber");
				Date dateofbirth = rs.getDate("dateOfbirth");
				Date crimeDate = rs.getDate("crimedate");
				String location = rs.getString("crimelocation");
				String charge = rs.getString("charge");
				String punishment = rs.getString("punishment");

				System.out.println("Name: " + name);
				System.out.println("Surname: " + surname);
				System.out.println("Gender: " + gender);
				System.out.println("Registration number: " + regnumber);
				System.out.println("Date of birth: " + dateofbirth);
				System.out.println("Crime Date: " + crimeDate);
				System.out.println("Location: " + location);
				System.out.println("Charges: " + charge);
				System.out.println("Punishment: " + punishment);
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void viewuserscomplaints() { //Displays the  all user complaints
		String query = "select * from usercomplaint"; //Query for user complaint

		try {
			db.setStatement(db.getCon().createStatement()); //database statement
			ResultSet rs = db.getStatement().executeQuery(query);

			while (rs.next()) { // gets the data from database and prints it to the screen
				int complaintid = rs.getInt("complaintid");
				String title = rs.getString("comptitle");
				String complaint = rs.getString("usercomplaint");
				String subject = rs.getString("compsubject");
				Date compdate = rs.getDate("compdate");
				
				System.out.println("Complaint id: " + complaintid);
				System.out.println("Title: " + title);
				System.out.println("Complaint: " + complaint);
				System.out.println("Subject: " + subject);
				System.out.println("Complaint Date: " + compdate);
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void viewusersfeedback() { //Displays the  all user feedback
		String query = "select * from feedback"; //Query for user feedback

		try {
			db.setStatement(db.getCon().createStatement()); //database statement
			ResultSet rs = db.getStatement().executeQuery(query);

			while (rs.next()) { // gets the data from database and prints it to the screen
				int feedbackid = rs.getInt("feedbackid");
				String name = rs.getString("name");
				String surname = rs.getString("surname");
				String feedback = rs.getString("feedback");
				Date feedbackdate = rs.getDate("feedbackdate");
				
				System.out.println("Feedback id: " + feedbackid);
				System.out.println("Name: " + name);
				System.out.println("Surname: " + surname);
				System.out.println("Feedback: " + feedback);
				System.out.println("Feedback Date: " + feedbackdate);
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void addReplytoComplaint(UserComplaint ucomp) { // creates new user complaint, update the adminreply and  adds it to the DB
		viewuserscomplaints(); //display users complaints
		System.out.println("Do you want to reply ? (yes or no)");
		String answer = input.nextLine(); //getting reply answer
		if(answer.equals("yes")) {
			System.out.println("Enter your reply: ");
			String reply = input.nextLine(); //getting reply message
			ucomp.setAdminReply(reply);
			
			System.out.println("Please enter the id that you want to reply: ");
			int replyid = input.nextInt();
			String query = "update usercomplaint set adminreply = ? where complaintid = ?";
			
			try { // update the data to the database
				db.setPstatement(db.getCon().prepareStatement(query));
				db.getPstatement().setString(1,reply);
				db.getPstatement().setInt(2,replyid);
				db.getPstatement().executeUpdate();
				
				System.out.println("Reply entered succesfully");
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
		
	}
	
	public void addmostwantedperson(MostWanted mwanted) { // creates new most wanted person and adds it to the DB
		System.out.println("Enter name");
		String personname = input.nextLine();
		while (mwanted.setName(personname)) { // input validation
			System.out.println("Please use only letters!");
			System.out.println("Enter name again: ");
			personname = input.nextLine();
			mwanted.setName(personname);
		}

		System.out.println("Enter surname");
		String personsurname = input.nextLine(); 
		while (mwanted.setSurname(personsurname)) { // input validation
			System.out.println("Please use only letters!");
			System.out.println("Enter surname again: ");
			personsurname = input.nextLine();
			mwanted.setSurname(personsurname);
		}

		System.out.println("Enter gender");
		String persongender = input.nextLine();
		while (mwanted.setGender(persongender)) { // input validation
			System.out.println("Please use only letters!");
			System.out.println("Enter gender again: ");
			persongender = input.nextLine();
			mwanted.setGender(persongender);
		}

		do {
			try {
				System.out.println("Enter date of birth");
				int persondateofbirth = input.nextInt();
				while (mwanted.setDateOfbirth(persondateofbirth)) { // input validation
					System.out.println("Invalid Date!");
					System.out.println("Enter Date again: ");
					persondateofbirth = input.nextInt();
					mwanted.setDateOfbirth(persondateofbirth);
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Wrong format!");
			}
			input.nextLine();
		} while (true);

		input.nextLine();

		System.out.println("Enter place of birth");
		String personplaceofbirth = input.nextLine();
		while (mwanted.setPlaceofBirth(personplaceofbirth)) { // input validation
			System.out.println("Please use only letters!");
			System.out.println("Enter place of birth again");
			personplaceofbirth = input.nextLine();
			mwanted.setPlaceofBirth(personplaceofbirth);
		}

		System.out.println("Enter nationality");
		String nationality = input.nextLine();
		while (mwanted.setNationality(nationality)) { // input validation
			System.out.println("Please use only letters!");
			System.out.println("Enter nationality again");
			nationality = input.nextLine();
			mwanted.setNationality(nationality);
		}

		System.out.println("Enter language");
		String language = input.nextLine();
		while (mwanted.setLanguage(language)) { // input validation
			System.out.println("Please use only letters!");
			System.out.println("Enter language again");
			language = input.nextLine();
			mwanted.setLanguage(language);
		}

		System.out.println("Enter charges");
		String charges = input.nextLine();
		mwanted.setCharges(charges);

		try { // insert the data to the database
			db.setStatement(db.getCon().createStatement());
			String query = "Insert into mostwanted(name, surname, gender, dateOfbirth,placeofbirth, nationality, language, charges) "
					+ "VALUES(" + "'" + mwanted.getName() + "'," + "'" + mwanted.getSurname() + "'," + "'"
					+ mwanted.getGender() + "'," + "'" + mwanted.getDateofBirth() + "'," + "'"
					+ mwanted.getPlaceofBirth() + "'," + "'" + mwanted.getNationality() + "'," + "'"
					+ mwanted.getLanguage() + "'," + "'" + mwanted.getCharges() + "')";
			db.getStatement().executeUpdate(query);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void addmissingperson(MissingPerson mperson) { // Adds new missing person to database

		System.out.println("Enter name");
		String personname = input.nextLine();
		while (mperson.setName(personname)) { // input validation
			System.out.println("Please use only letters!");
			System.out.println("Enter name");
			personname = input.nextLine();
			mperson.setName(personname);
		}

		System.out.println("Enter surname");
		String personsurname = input.nextLine();
		while (mperson.setSurname(personsurname)) { // input validation
			System.out.println("Please use only letters!");
			System.out.println("Enter surname");
			personsurname = input.nextLine();
			mperson.setSurname(personsurname);
		}

		System.out.println("Enter gender");
		String persongender = input.nextLine();
		while (mperson.setGender(persongender)) { // input validation
			System.out.println("Please use only letters!");
			System.out.println("Enter gender");
			persongender = input.nextLine();
			mperson.setGender(persongender);
		}

		System.out.println("Enter place of birth");
		String personplaceofbirth = input.nextLine();
		while (mperson.setPlaceOfbirth(personplaceofbirth)) { // input validation
			System.out.println("Please use only letters!");
			System.out.println("Enter place of birth again");
			personplaceofbirth = input.nextLine();
			mperson.setPlaceOfbirth(personplaceofbirth);
		}

		do {
			try {
				System.out.println("Enter date of birth");
				int persondateofbirth = input.nextInt();
				while (mperson.setDateOfbirth(persondateofbirth)) { // input validation
					System.out.println("Invalid Date!");
					System.out.println("Enter Date again: ");
					persondateofbirth = input.nextInt();
					mperson.setDateOfbirth(persondateofbirth);
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Wrong format!");
			}
			input.nextLine();
		} while (true);

		System.out.println("Enter weight");
		double personweight = input.nextDouble();
		mperson.setWeight(personweight);

		System.out.println("Enter height");
		double personheight = input.nextDouble();
		mperson.setHeight(personheight);

		do {
			try {
				System.out.println("Enter date missing");
				int personmissingdate = input.nextInt();
				while (mperson.setDateMissing(personmissingdate)) { // input validation
					System.out.println("Invalid Date!");
					System.out.println("Enter Date again: ");
					personmissingdate = input.nextInt();
					mperson.setDateMissing(personmissingdate);
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Wrong format!");
			}
			input.nextLine();
		} while (true);

		System.out.println("Enter skin color");
		String personskincolor = input.nextLine();
		while (mperson.setSkinColor(personskincolor)) { // input validation
			System.out.println("Please use only letters!");
			System.out.println("Enter skin color again");
			personskincolor = input.nextLine();
			mperson.setSkinColor(personskincolor);
		}

		System.out.println("Enter hair color");
		String personhaircolor = input.nextLine();
		while (mperson.setHairColor(personhaircolor)) { // input validation
			System.out.println("Please use only letters!");
			System.out.println("Enter hair color again");
			personhaircolor = input.nextLine();
			mperson.setHairColor(personhaircolor);
		}

		System.out.println("Enter eye color");
		String personeyecolor = input.nextLine();
		while (mperson.setEyeColor(personeyecolor)) { // input validation
			System.out.println("Please use only letters!");
			System.out.println("Enter eye color again");
			personeyecolor = input.nextLine();
			mperson.setEyeColor(personeyecolor);
		}

		try { // insert the data to the database
			db.setStatement(db.getCon().createStatement());
			String query = "Insert into missingperson(name, surname, gender, placeOfbirth, dateOfbirth, weight, height, dateMissing, skinColor, hairColor, eyeColor) "
					+ "VALUES(" + "'" + mperson.getName() + "'," + "'" + mperson.getSurname() + "'," + "'"
					+ mperson.getGender() + "'," + "'" + mperson.getPlaceOfbirth() + "'," + "'"
					+ mperson.getDateOfbirth() + "'," + "'" + mperson.getWeight() + "'," + "'" + mperson.getHeight()
					+ "'," + "'" + mperson.getDateMissing() + "'," + "'" + mperson.getSkinColor() + "'," + "'"
					+ mperson.getHairColor() + "'," + "'" + mperson.getEyeColor() + "')";
			db.getStatement().executeUpdate(query);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// This method used for adding a criminal report
	public void addcriminalreport(CriminalReport creport) {
		System.out.println("Enter name");
		String personname = input.nextLine();
		while (creport.setName(personname)) { // input validation
			System.out.println("Please use only letters!");
			System.out.println("Enter name");
			personname = input.nextLine();
			creport.setName(personname);
		}

		System.out.println("Enter surname");
		String personsurname = input.nextLine();
		while (creport.setSurname(personsurname)) { // input validation
			System.out.println("Please use only letters!");
			System.out.println("Enter surname");
			personsurname = input.nextLine();
			creport.setSurname(personsurname);
		}

		System.out.println("Enter gender");
		String persongender = input.nextLine();
		while (creport.setGender(persongender)) { // input validation
			System.out.println("Please use only letters!");
			System.out.println("Enter gender");
			persongender = input.nextLine();
			creport.setGender(persongender);
		}

		System.out.println("Enter registration number");
		String regnumber = input.nextLine();
		creport.setRegistrationnumber(regnumber);

		do {
			try {
				System.out.println("Enter date of birth");
				int persondateofbirth = input.nextInt();
				while (creport.setDateofbirth(persondateofbirth)) { // input validation
					System.out.println("Invalid Date!");
					System.out.println("Enter Date again: ");
					persondateofbirth = input.nextInt();
					creport.setDateofbirth(persondateofbirth);
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Wrong format!");
			}
			input.nextLine();
		} while (true);

		do {
			try {
				System.out.println("Enter crime date");
				int crimedate = input.nextInt();
				while (creport.setCrimeDate(crimedate)) { // input validation
					System.out.println("Invalid Date!");
					System.out.println("Enter Crime Date again: ");
					crimedate = input.nextInt();
					creport.setCrimeDate(crimedate);
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Wrong format!");
			}
			input.nextLine();
		} while (true);

		input.nextLine();

		System.out.println("Enter crime location");
		String location = input.nextLine();
		creport.setCrimeLocation(location);

		System.out.println("Enter charges ");
		String charge = input.nextLine();
		creport.setCharge(charge);

		System.out.println("Enter punishment ");
		String punishment = input.nextLine();
		creport.setPunishment(punishment);

		try { // insert the data to the database
			db.setStatement(db.getCon().createStatement());
			String query = "Insert into criminalreport(name, surname, gender, regnumber, dateOfbirth, crimedate, crimelocation, charge, punishment) "
					+ "VALUES(" + "'" + creport.getName() + "'," + "'" + creport.getSurname() + "'," + "'"
					+ creport.getGender() + "'," + "'" + creport.getRegistrationnumber() + "'," + "'"
					+ creport.getDateofbirth() + "'," + "'" + creport.getCrimeDate() + "'," + "'"
					+ creport.getCrimeLocation() + "'," + "'" + creport.getCharge() + "'," + "'"
					+ creport.getPunishment() + "')";
			db.getStatement().executeUpdate(query);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	// This method used for adding a hot news
	public void addHotNews(HotNews hotnews) {
		System.out.println("Enter news title");
		String title = input.nextLine();
		hotnews.setTitle(title);
		
		System.out.println("Enter news: ");
		String news = input.nextLine();
		hotnews.setText(news);
		
		
		do {
			try {
				System.out.println("Enter news date");
				int newsdate = input.nextInt();
				while (hotnews.setNewsDate(newsdate)) { // input validation
					System.out.println("Invalid New Date!");
					System.out.println("Enter News Date again: ");
					newsdate = input.nextInt();
					hotnews.setNewsDate(newsdate);
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Wrong format!");
			}
			input.nextLine();
		} while (true);
		
		try { // insert the data to the database
			db.setStatement(db.getCon().createStatement());
			String query = "Insert into hotnews(title, text, newsdate)"
					+ "VALUES(" + "'" + hotnews.getTitle() + "'," + "'" + hotnews.getText() + "'," + "'"
					+ hotnews.getNewsDate() + "')";
			db.getStatement().executeUpdate(query);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deletemostwantedperson(int mostwantedid) { // delete the most wanted person from database
		String query = "Delete from mostwanted where id = ?";

		try {
			db.setPstatement(db.getCon().prepareStatement(query));
			db.getPstatement().setInt(1, mostwantedid);
			db.getPstatement().executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deletemissingperson(int missingpersonid) { // delete the missing person from database
		String query = "Delete from missingperson where id = ?";

		try { // delete the data from database
			db.setPstatement(db.getCon().prepareStatement(query));
			db.getPstatement().setInt(1, missingpersonid);
			db.getPstatement().executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void deletehotnews(int hotnewsid) { // delete the hot news from database
		String query = "Delete from hotnews where newsid = ?";

		try { // delete the data from database
			db.setPstatement(db.getCon().prepareStatement(query));
			db.getPstatement().setInt(1, hotnewsid);
			db.getPstatement().executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void deletefeedback(int feedbackid) { // delete the feedback from database
		String query = "Delete from feedback where feedbackid = ?";

		try { // delete the data from database
			db.setPstatement(db.getCon().prepareStatement(query));
			db.getPstatement().setInt(1, feedbackid);
			db.getPstatement().executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public int getPoliceID() {
		return adminID;
	}

	public String getAdminPass() {
		return adminPass;
	}
	
	public void admindisplay() { // Displays the admin menu
		System.out.println("\nPress 1 for add a most wanted person...");
		System.out.println("Press 2 for view most wanted person...");
		System.out.println("Press 3 for add missing person...");
		System.out.println("Press 4 for view missing person...");
		System.out.println("Press 5 for delete most wanted person...");
		System.out.println("Press 6 for delete missing person...");
		System.out.println("Press 7 for add criminal report...");
		System.out.println("Press 8 for view criminal report...");
		System.out.println("Press 9 for add hot news...");
		System.out.println("Press 10 for delete hot news...");
		System.out.println("Press 11 for view users complaint...");
		System.out.println("Press 12 for replying a complaint...");
		System.out.println("Press 13 for view users feedback...");
		System.out.println("Press 14 for delete users feedback...");
	}
}
