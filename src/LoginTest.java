import static org.junit.Assert.*;

import org.junit.Test;

public class LoginTest {

	UserEntrence uEnterence = new UserEntrence();
	AdminEntrence aEnterence = new AdminEntrence();

	@Test
	public void userLoginTest() {
		assertEquals(uEnterence.userLogin(12345678910L, "1234"), true);
		assertEquals(uEnterence.userLogin(98754587471L, "1234"), false);

		assertNotEquals(uEnterence.userLogin(98754587471L, "1234"), true);
		assertNotEquals(uEnterence.userLogin(4522468777447868765L, "1234"), true);
	}

	@Test
	public void adminLoginTest() {
		assertEquals(aEnterence.adminLogin(12345, "admin"), true);
		assertNotEquals(aEnterence.adminLogin(987545874, "1234"), true);
	}
}
