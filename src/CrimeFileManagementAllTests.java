import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CrimeFileUnitTest.class, CriminalReportUnitTest.class, LoginTest.class, MissingPersonUnitTest.class,
		MostWantedUnitTest.class, UserComplaintUnitTest.class })
public class CrimeFileManagementAllTests {
// This class is for test all unit test classes
}
