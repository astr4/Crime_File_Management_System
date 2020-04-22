import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEntrence {
	DatabaseConnection db = new DatabaseConnection();
    private String userID;
    private String userPass;
    Scanner input = new Scanner(System.in);
    
    public UserEntrence(){
    	String url = "jdbc:mysql://" + db.getHost() + ":" + db.getPort() + "/" + db.getName() + "?useUnicode=true&characterEncoding=utf8";

        try {
            Class.forName("com.mysql.jdbc.Driver");

        }
        catch(ClassNotFoundException ex){
            System.out.println("Driver not found");
        }
        try {
            db.setCon(DriverManager.getConnection(url, db.getUserName(), db.getPassword()));
            System.out.println("Connection successful.");
        } catch (SQLException ex) {
            System.out.println("Connection fail.");
        }
    }
    //This method is used for login to the system as user
    public boolean userLogin(){
    	boolean loginSuccess = false;
        System.out.println("Please enter your TC.Kimlik number: ");
        String tcNum = input.nextLine();
        System.out.println("Please enter your password: ");
        String uPass = input.nextLine();
        String search = "Select * From user";
        try {
        	db.setStatement(db.getCon().createStatement());
            ResultSet rs = db.getStatement().executeQuery(search);

            while(rs.next()) {
                userID= rs.getString("userID");
                userPass= rs.getString("userPass");
                if (tcNum.equals(getUserID()) && uPass.equals(getUserPass())) {
                    System.out.print("Login Successfull!");
                    loginSuccess = true;
                }
            }
            if(loginSuccess == false) {
                System.out.print("Wrong TC.Kimlik number or password!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return loginSuccess;
    }
    //This method is used for register the system  as user
    public void userRegister(){
        try {
            db.setStatement(db.getCon().createStatement());
            System.out.println("Please enter your TC.Kimlik number: ");
            String userID = input.nextLine();
            System.out.println("Please enter your password: ");
            String userPass = input.nextLine();
            System.out.println("Please re-enter your password: ");
            String uPass2 = input.nextLine();
            if (userPass.equals(uPass2)) {
                String search ="Insert Into user(userID,userPass) VALUES(" +"'" + userID + "'," + "'" + userPass + "')";
                db.getStatement().executeUpdate(search);
            }
            else {
                System.out.print("Passwords are not matching!");
            }
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    //This method used for adding a crime file
    public void addfile(CrimeFile cfile) {
    	System.out.println("Enter name");
    	String username = input.nextLine();
    	cfile.setUserName(username);
    	System.out.println("Enter address");
    	String address = input.nextLine();
    	cfile.setUserAddress(address);
    	System.out.println("Enter phone");
    	String phone = input.nextLine();
    	cfile.setUserPhone(phone);
    	System.out.println("Enter complaint type");
    	String complainttype = input.nextLine();
    	cfile.setComplaintType(complainttype);
    	System.out.println("Enter complaint description");
    	String complaintdesc = input.nextLine();
    	cfile.setComplaintDescription(complaintdesc);
    	System.out.println("Enter crime time");
    	String crimetime = input.nextLine();
    	cfile.setCrimeTime(crimetime);
    	System.out.println("Enter crime date");
    	String crimedate = input.nextLine();
    	cfile.setCrimeDate(crimedate);
    	System.out.println("Enter crime location");
    	String crimeloc = input.nextLine();
    	cfile.setCrimeLocation(crimeloc);
    
    	try {
			db.setStatement(db.getCon().createStatement());
			String query = "Insert into crimefile(userName,userAddress,userPhone,complaintType,complaintDescription,crimeTime,crimeDate,crimeLocation) "
					+ "VALUES(" + "'" + cfile.getUserName() + "'," + "'" + cfile.getUserAddress() + "'," + "'" + cfile.getUserPhone() + "'," + "'" + cfile.getComplaintType() +
					   "'," + "'" + cfile.getComplaintDescription() + "'," + "'" + cfile.getCrimeTime() + "'," + "'" + cfile.getCrimeDate() +  "'," + "'" + cfile.getCrimeLocation() + "')";
			db.getStatement().executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
   
    public String getUserID() {
        return userID;
    }

    public String getUserPass() {
        return userPass;
    }
    //User menu
    public void userdisplay() {
    	System.out.println("\nPress 1 for add a crime file...");
    	System.out.println("Press 2 for add a missing person file...");
    }
}
