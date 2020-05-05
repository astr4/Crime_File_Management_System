import static org.junit.Assert.*;
import org.junit.Test;

public class MissingPersonUnitTest {

	MissingPerson mPerson = new MissingPerson();

	@Test
	public void nameTest() {
		mPerson.setName("Ayberk");
		assertEquals(mPerson.getName(), "Ayberk");

		mPerson.setName("12345");
		assertNotSame(mPerson.getName(), "12345");

		mPerson.setName("*@,.-%^+=");
		assertNotSame(mPerson.getName(), "*@,.-%^+=");
	}

	@Test
	public void surnameTest() {
		mPerson.setSurname("Ortancalar");
		assertEquals(mPerson.getSurname(), "Ortancalar");

		mPerson.setSurname("12345");
		assertNotSame(mPerson.getSurname(), "12345");

		mPerson.setSurname("*@,.-%^+=");
		assertNotSame(mPerson.getSurname(), "*@,.-%^+=");
	}

	@Test
	public void genderTest() {
		mPerson.setGender("Male");
		assertEquals(mPerson.getGender(), "Male");

		mPerson.setGender("Female");
		assertEquals(mPerson.getGender(), "Female");

		mPerson.setGender("12345");
		assertNotSame(mPerson.getGender(), "12345");

		mPerson.setGender("*@,.-%^+=");
		assertNotSame(mPerson.getGender(), "*@,.-%^+=");
	}

	@Test
	public void placeOfBirth() {
		mPerson.setPlaceOfbirth("Adana");
		assertEquals(mPerson.getPlaceOfbirth(), "Adana");

		mPerson.setPlaceOfbirth("12345");
		assertNotSame(mPerson.getPlaceOfbirth(), "12345");

		mPerson.setPlaceOfbirth("*@,.-%^+=");
		assertNotSame(mPerson.getPlaceOfbirth(), "*@,.-%^+=");
	}

	@Test
	public void dateOfBirthTest() {
		mPerson.setDateOfbirth(19980505);
		assertEquals(mPerson.getDateOfbirth(), 19980505);

		mPerson.setDateOfbirth(20001304);
		assertNotSame(mPerson.getDateOfbirth(), 20001304);

		mPerson.setDateOfbirth(1325416541);
		assertNotSame(mPerson.getDateOfbirth(), 1325416541);
	}

	@Test
	public void dateMissingTest() {
		mPerson.setDateOfbirth(19980505);
		assertEquals(mPerson.getDateOfbirth(), 19980505);

		mPerson.setDateOfbirth(20001304);
		assertNotSame(mPerson.getDateOfbirth(), 20001304);

		mPerson.setDateOfbirth(20050140);
		assertNotSame(mPerson.getDateOfbirth(), 20050140);

		mPerson.setDateOfbirth(1325416541);
		assertNotSame(mPerson.getDateOfbirth(), 1325416541);
	}

	@Test
	public void skinColorTest() {
		mPerson.setSkinColor("Black");
		assertEquals(mPerson.getSkinColor(), "Black");

		mPerson.setSkinColor("White");
		assertEquals(mPerson.getSkinColor(), "White");

		mPerson.setSurname("12345");
		assertNotSame(mPerson.getSkinColor(), "12345");

		mPerson.setSurname("*@,.-%^+=");
		assertNotSame(mPerson.getSkinColor(), "*@,.-%^+=");
	}

	@Test
	public void hairColorTest() {
		mPerson.setHairColor("Red");
		assertEquals(mPerson.getHairColor(), "Red");

		mPerson.setHairColor("Yellow");
		assertEquals(mPerson.getHairColor(), "Yellow");

		mPerson.setHairColor("Brown");
		assertEquals(mPerson.getHairColor(), "Brown");

		mPerson.setHairColor("12345");
		assertNotSame(mPerson.getHairColor(), "12345");

		mPerson.setHairColor("*@,.-%^+=");
		assertNotSame(mPerson.getHairColor(), "*@,.-%^+=");
	}

	@Test
	public void eyeColorTest() {
		mPerson.setEyeColor("Blue");
		assertEquals(mPerson.getEyeColor(), "Blue");

		mPerson.setEyeColor("Black");
		assertEquals(mPerson.getEyeColor(), "Black");

		mPerson.setEyeColor("12345");
		assertNotSame(mPerson.getEyeColor(), "12345");

		mPerson.setEyeColor("*@,.-%^+=");
		assertNotSame(mPerson.getEyeColor(), "*@,.-%^+=");
	}
}
