import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminEntrence {
	DatabaseConnection db = new DatabaseConnection();
    private int adminID;
    private String adminPass;
    private boolean loginSuccess = false;
    Scanner input = new Scanner(System.in);
    
    public AdminEntrence(){
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
    
    //This is for admin login method
    public void adminLogin(){

        System.out.println("Please enter your police ID: ");
        int policeId = input.nextInt();
        input.nextLine();
        System.out.println("Please enter your police password: ");
        String policePass = input.nextLine();
        String query = "select * from admin";
        try {
        	db.setStatement(db.getCon().createStatement());
            ResultSet rs = db.getStatement().executeQuery(query);

            while(rs.next()) {
            	adminID= rs.getInt("adminID");
                adminPass= rs.getString("adminPass");
                if ((policeId == getPoliceID()) && policePass.equals(getAdminPass())) {
                    System.out.println("Login Succesfull!");
                    loginSuccess = true;
                }
            }
            if(loginSuccess == false) {
                System.out.print("Wrong police ID  or admin password!");
            }
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
}
