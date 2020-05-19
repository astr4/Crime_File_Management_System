import static org.junit.Assert.*;

import org.junit.Test;

public class UserComplaintUnitTest {
	
	UserComplaint ucomp = new UserComplaint(); // UserComplaint Object
	
	@Test
	public void complaintDateTest() { // Test for complaint date validation
		ucomp.setComplaintDate(19980505);
		assertEquals(ucomp.getComplaintDate(), 19980505);

		ucomp.setComplaintDate(20001304);
		assertNotSame(ucomp.getComplaintDate(), 20001304);

		ucomp.setComplaintDate(20050140);
		assertNotSame(ucomp.getComplaintDate(), 20050140);

		ucomp.setComplaintDate(1325416541);
		assertNotSame(ucomp.getComplaintDate(), 1325416541);
	}

}
