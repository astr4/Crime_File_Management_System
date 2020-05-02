import java.sql.Connection;
import java.sql.Statement;

public class DatabaseConnection {

	private final String userName = "root";

	private final String password = "35083508"; //You should change the password in order to access the database

	private final String name = "crimefilemanagementdb";

	private final String host = "localhost";

	private final int port = 3306;
	
	private Connection con = null; 
	
    private Statement statement = null;
    
	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getHost() {
		return host;
	}

	public int getPort() {
		return port;
	}
	
    }
