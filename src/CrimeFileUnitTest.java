import static org.junit.Assert.*;

import org.junit.Test;

public class CrimeFileUnitTest {

	CrimeFile cFile = new CrimeFile();

	@Test
	public void userNameTest() {
		cFile.setUserName("Ayberk");
		assertEquals(cFile.getUserName(), "Ayberk");

		cFile.setUserName("12345");
		assertNotSame(cFile.getUserName(), "12345");

		cFile.setUserName("*@,.-%^+=");
		assertNotSame(cFile.getUserName(), "*@,.-%^+=");
	}

	@Test
	public void userPhoneTest() {

		cFile.setUserPhone(23244422689L);
		assertEquals(cFile.getUserPhone(), 23244422689L);

		cFile.setUserPhone(12345);
		assertNotSame(cFile.getUserPhone(), 12345);
	}

	@Test
	public void crimeDateTest() {
		cFile.setCrimeDate(19980505);
		assertEquals(cFile.getCrimeDate(), 19980505);

		cFile.setCrimeDate(20001304);
		assertNotSame(cFile.getCrimeDate(), 20001304);

		cFile.setCrimeDate(20050140);
		assertNotSame(cFile.getCrimeDate(), 20050140);

		cFile.setCrimeDate(1325416541);
		assertNotSame(cFile.getCrimeDate(), 1325416541);
	}

	@Test
	public void crimeTimeTest() {
		cFile.setCrimeTime(184530);
		assertEquals(cFile.getCrimeTime(), 184530);

		cFile.setCrimeTime(156825);
		assertNotSame(cFile.getCrimeTime(), 156825);

		cFile.setCrimeTime(251923);
		assertNotSame(cFile.getCrimeTime(), 251923);

		cFile.setCrimeTime(060675);
		assertNotSame(cFile.getCrimeTime(), 060675);

		cFile.setCrimeTime(1354564768);
		assertNotSame(cFile.getCrimeTime(), 1354564768);
	}

}
