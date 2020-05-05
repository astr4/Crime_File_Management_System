import java.util.regex.Pattern;

public class CrimeFile {

	private String userName;
	private String userAddress;
	private long userPhone;
	private String complaintType;
	private String complaintDescription;
	private int crimeTime;
	private int crimeDate;
	private String crimeLocation;

	public String getUserName() {
		return userName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public long getUserPhone() {
		return userPhone;
	}

	public String getComplaintType() {
		return complaintType;
	}

	public String getComplaintDescription() {
		return complaintDescription;
	}

	public int getCrimeTime() {
		return crimeTime;
	}

	public String getCrimeLocation() {
		return crimeLocation;
	}

	public int getCrimeDate() {
		return crimeDate;
	}

	public boolean setCrimeDate(int crimeDate) {
		String fullDate = String.valueOf(crimeDate);
		if (fullDate.length() != 8)
			return true;

		int month = Integer.parseInt(String.valueOf(Character.digit(fullDate.charAt(4), 10))
				+ String.valueOf(Character.digit(fullDate.charAt(5), 10)));
		int day = Integer.parseInt(String.valueOf(Character.digit(fullDate.charAt(6), 10))
				+ String.valueOf(Character.digit(fullDate.charAt(7), 10)));

		if (month < 0 || month > 12 || day < 0 || day > 31)
			return true;

		this.crimeDate = crimeDate;
		return false;
	}

	public boolean setUserName(String userName) {
		if (Pattern.matches("[a-zA-Z]+", userName) == false) {
			return true;
		}
		this.userName = userName;
		return false;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public boolean setUserPhone(long userPhone) {

		int length = String.valueOf(userPhone).length();
		if (length > 11 || length < 11) {
			return true;
		}
		this.userPhone = userPhone;
		return false;

	}

	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}

	public void setComplaintDescription(String complaintDescription) {
		this.complaintDescription = complaintDescription;
	}

	public boolean setCrimeTime(int crimeTime) {
		String fullTime = String.valueOf(crimeTime);
		if (fullTime.length() != 6)
			return true;

		int hour = Integer.parseInt(String.valueOf(Character.digit(fullTime.charAt(0), 10))
				+ String.valueOf(Character.digit(fullTime.charAt(1), 10)));
		int min = Integer.parseInt(String.valueOf(Character.digit(fullTime.charAt(2), 10))
				+ String.valueOf(Character.digit(fullTime.charAt(3), 10)));
		int sec = Integer.parseInt(String.valueOf(Character.digit(fullTime.charAt(4), 10))
				+ String.valueOf(Character.digit(fullTime.charAt(5), 10)));

		if (hour <= 0 || hour >= 24 || min < 0 || min >= 60 || sec < 0 || sec >= 60)
			return true;
		this.crimeTime = crimeTime;
		return false;
	}

	public void setCrimeLocation(String crimeLocation) {
		this.crimeLocation = crimeLocation;
	}
}
