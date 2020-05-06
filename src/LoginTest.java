import static org.junit.Assert.*;

import org.junit.Test;

public class LoginTest {

	User user = new User(); // User Object
	Admin admin = new Admin(); // Admin Object

	@Test
	public void userLoginTest() { // Test for user Login, checks the user from database that exist
		assertEquals(user.userLogin(12345678910L, "1234"), true);
		assertEquals(user.userLogin(98754587471L, "1234"), false);

		assertNotEquals(user.userLogin(98754587471L, "1234"), true);
		assertNotEquals(user.userLogin(4522468777447868765L, "1234"), true);
	}

	@Test
	public void adminLoginTest() { // Test for admin Login, checks the admin from database that exist
		assertEquals(admin.adminLogin(12345, "admin"), true);
		assertNotEquals(admin.adminLogin(987545874, "1234"), true);
	}
}
