import java.util.regex.Pattern;

public class MostWanted { // MostWanted class keeps the information of most wanted people.

	private String name;
	private String surname;
	private String gender;
	private int dateofbirth;
	private String placeofbirth;
	private String nationality;
	private String language;
	private String charges;

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

	public int getDateofBirth() {
		return dateofbirth;
	}

	public boolean setDateOfbirth(int dateOfbirth) {
		String birthdate = String.valueOf(dateOfbirth);
		if (birthdate.length() != 8) // input validation
			return true;
		//Separates the date to month and day
		int month = Integer.parseInt(String.valueOf(Character.digit(birthdate.charAt(4), 10))
				+ String.valueOf(Character.digit(birthdate.charAt(5), 10)));
		int day = Integer.parseInt(String.valueOf(Character.digit(birthdate.charAt(6), 10))
				+ String.valueOf(Character.digit(birthdate.charAt(7), 10)));

		if (month < 0 || month > 12 || day < 0 || day > 31) // input validation
			return true;
		this.dateofbirth = dateOfbirth;
		return false;
	}

	public String getPlaceofBirth() {
		return placeofbirth;
	}

	public boolean setPlaceofBirth(String placeofBirth) {
		if (Pattern.matches("[a-zA-Z]+", placeofBirth) == false) { // input validation
			return true;
		}
		this.placeofbirth = placeofBirth;
		return false;
	}

	public String getNationality() {
		return nationality;
	}

	public boolean setNationality(String nationality) {
		if (Pattern.matches("[a-zA-Z]+", nationality) == false) { // input validation
			return true;
		}
		this.nationality = nationality;
		return false;
	}

	public String getLanguage() {
		return language;
	}

	public boolean setLanguage(String language) {
		if (Pattern.matches("[a-zA-Z]+", language) == false) { // input validation
			return true;
		}
		this.language = language;
		return false;
	}

	public String getCharges() {
		return charges;
	}

	public void setCharges(String charges) {
		this.charges = charges;
	}
}