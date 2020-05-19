import static org.junit.Assert.*;

import org.junit.Test;

public class MostWantedUnitTest {
	
	MostWanted mwanted = new MostWanted(); //MostWanted Object
	@Test
	public void nameTest() { // Test for name validation
		mwanted.setName("Ayberk");
		assertEquals(mwanted.getName(), "Ayberk");

		mwanted.setName("12345");
		assertNotSame(mwanted.getName(), "12345");

		mwanted.setName("*@,.-%^+=");
		assertNotSame(mwanted.getName(), "*@,.-%^+=");
	}
	
	@Test
	public void surnameTest() { // Test for surname validation
		mwanted.setSurname("Ortancalar");
		assertEquals(mwanted.getSurname(), "Ortancalar");

		mwanted.setSurname("12345");
		assertNotSame(mwanted.getSurname(), "12345");

		mwanted.setSurname("*@,.-%^+=");
		assertNotSame(mwanted.getSurname(), "*@,.-%^+=");
	}

	@Test
	public void genderTest() { // Test for gender validation
		mwanted.setGender("Male");
		assertEquals(mwanted.getGender(), "Male");

		mwanted.setGender("Female");
		assertEquals(mwanted.getGender(), "Female");

		mwanted.setGender("12345");
		assertNotSame(mwanted.getGender(), "12345");

		mwanted.setGender("*@,.-%^+=");
		assertNotSame(mwanted.getGender(), "*@,.-%^+=");
	}

	@Test
	public void placeOfBirth() { // Test for place of birth validation
		mwanted.setPlaceofBirth("Adana");
		assertEquals(mwanted.getPlaceofBirth(), "Adana");

		mwanted.setPlaceofBirth("12345");
		assertNotSame(mwanted.getPlaceofBirth(), "12345");

		mwanted.setPlaceofBirth("*@,.-%^+=");
		assertNotSame(mwanted.getPlaceofBirth(), "*@,.-%^+=");
	}

	@Test
	public void dateOfBirthTest() { // Test for date of birth validation
		mwanted.setDateOfbirth(19980505);
		assertEquals(mwanted.getDateofBirth(), 19980505);

		mwanted.setDateOfbirth(20001304);
		assertNotSame(mwanted.getDateofBirth(), 20001304);

		mwanted.setDateOfbirth(1325416541);
		assertNotSame(mwanted.getDateofBirth(), 1325416541);
	}
	
	@Test
	public void nationalityTest() { // Test for nationality validation
		mwanted.setNationality("Turkey");
		assertEquals(mwanted.getNationality(), "Turkey");

		mwanted.setNationality("20001304");
		assertNotSame(mwanted.getNationality(), "20001304");

		mwanted.setNationality("*@,.-%^+=");
		assertNotSame(mwanted.getNationality(), "*@,.-%^+=");
	}

	@Test
	public void languageTest() { // Test for language validation
		mwanted.setLanguage("Turkish");
		assertEquals(mwanted.getLanguage(), "Turkish");

		mwanted.setLanguage("1304");
		assertNotSame(mwanted.getLanguage(), "1304");

		mwanted.setLanguage("*@,.-%^+=");
		assertNotSame(mwanted.getLanguage(), "*@,.-%^+=");
	}

}
