import static org.junit.Assert.*;

import org.junit.Test;

public class CriminalReportUnitTest {
	
	CriminalReport creport = new CriminalReport(); //CriminalReport Object
	@Test
	public void nameTest() { // Test for name validation
		creport.setName("Ayberk");
		assertEquals(creport.getName(), "Ayberk");

		creport.setName("12345");
		assertNotSame(creport.getName(), "12345");

		creport.setName("*@,.-%^+=");
		assertNotSame(creport.getName(), "*@,.-%^+=");
	}
	
	@Test
	public void surnameTest() { // Test for surname validation
		creport.setSurname("Ortancalar");
		assertEquals(creport.getSurname(), "Ortancalar");

		creport.setSurname("12345");
		assertNotSame(creport.getSurname(), "12345");

		creport.setSurname("*@,.-%^+=");
		assertNotSame(creport.getSurname(), "*@,.-%^+=");
	}

	@Test
	public void genderTest() { // Test for gender validation
		creport.setGender("Male");
		assertEquals(creport.getGender(), "Male");

		creport.setGender("Female");
		assertEquals(creport.getGender(), "Female");

		creport.setGender("12345");
		assertNotSame(creport.getGender(), "12345");

		creport.setGender("*@,.-%^+=");
		assertNotSame(creport.getGender(), "*@,.-%^+=");
	}
	
	@Test
	public void dateOfBirthTest() { // Test for date of birth validation
		creport.setDateofbirth(19980505);
		assertEquals(creport.getDateofbirth(), 19980505);

		creport.setDateofbirth(20001304);
		assertNotSame(creport.getDateofbirth(), 20001304);

		creport.setDateofbirth(1325416541);
		assertNotSame(creport.getDateofbirth(), 1325416541);
	}
	@Test
	public void crimeDateTest() { // Test for crime date validation
		creport.setCrimeDate(19980505);
		assertEquals(creport.getCrimeDate(), 19980505);

		creport.setCrimeDate(20001304);
		assertNotSame(creport.getCrimeDate(), 20001304);

		creport.setCrimeDate(20050140);
		assertNotSame(creport.getCrimeDate(), 20050140);

		creport.setCrimeDate(1325416541);
		assertNotSame(creport.getCrimeDate(), 1325416541);
	}
}
