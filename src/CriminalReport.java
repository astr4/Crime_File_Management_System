import java.util.regex.Pattern;

public class CriminalReport { // CriminalReport class keeps the information of CriminalReport.

	private String name;
	private String surname;
	private String gender;
	private String registrationnumber;
	private int dateofbirth;
	private int crimeDate;
	private String crimeLocation;
	private String charge;
	private String punishment;

	public String getName() {
		return name;
	}

	public boolean setName(String name) {
		if (Pattern.matches("[a-zA-Z]+", name) == false) { // input validation
			return true;
		}
		this.name = name;
		return false;
	}

	public String getSurname() {
		return surname;
	}

	public boolean setSurname(String surname) { 
		if (Pattern.matches("[a-zA-Z]+", surname) == false) { // input validation
			return true;
		}
		this.surname = surname;
		return false;
	}

	public String getGender() {
		return gender;
	}

	public boolean setGender(String gender) {
		if (Pattern.matches("[a-zA-Z]+", gender) == false) { // input validation
			return true;
		}
		this.gender = gender;
		return false;
	}

	public String getRegistrationnumber() {
		return registrationnumber;
	}

	public void setRegistrationnumber(String registrationnumber) {
		this.registrationnumber = registrationnumber;
	}

	public int getDateofbirth() {
		return dateofbirth;
	}

	public boolean setDateofbirth(int dateofbirth) {
		String birthdate = String.valueOf(dateofbirth);
		if (birthdate.length() != 8) // input validation
			return true;
		//Separates the date to month and day
		int month = Integer.parseInt(String.valueOf(Character.digit(birthdate.charAt(4), 10))
				+ String.valueOf(Character.digit(birthdate.charAt(5), 10)));
		int day = Integer.parseInt(String.valueOf(Character.digit(birthdate.charAt(6), 10))
				+ String.valueOf(Character.digit(birthdate.charAt(7), 10)));

		if (month < 0 || month > 12 || day < 0 || day > 31) // input validation
			return true;
		this.dateofbirth = dateofbirth;
		return false;
	}

	public int getCrimeDate() {
		return crimeDate;
	}

	public boolean setCrimeDate(int crimeDate) {
		String crimedate = String.valueOf(crimeDate);
		if (crimedate.length() != 8) // input validation
			return true;
		//Separates the date to month and day
		int month = Integer.parseInt(String.valueOf(Character.digit(crimedate.charAt(4), 10))
				+ String.valueOf(Character.digit(crimedate.charAt(5), 10)));
		int day = Integer.parseInt(String.valueOf(Character.digit(crimedate.charAt(6), 10))
				+ String.valueOf(Character.digit(crimedate.charAt(7), 10)));

		if (month < 0 || month > 12 || day < 0 || day > 31) // input validation
			return true;
		this.crimeDate = crimeDate;
		return false;
	}

	public String getCrimeLocation() {
		return crimeLocation;
	}

	public void setCrimeLocation(String crimeLocation) {
		this.crimeLocation = crimeLocation;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public String getPunishment() {
		return punishment;
	}

	public void setPunishment(String punishment) {
		this.punishment = punishment;
	}
}
