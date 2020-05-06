import java.util.regex.Pattern;

public class MissingPerson { // MissingPerson class keeps the information of Missing Person.

	private String name;
	private String surname;
	private String gender;
	private String placeOfbirth;
	private int dateOfbirth;
	private double weight;
	private double height;
	private int dateMissing;
	private String skinColor;
	private String hairColor;
	private String eyeColor;

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

	public String getPlaceOfbirth() {
		return placeOfbirth;
	}

	public boolean setPlaceOfbirth(String placeOfbirth) {
		if (Pattern.matches("[a-zA-Z]+", placeOfbirth) == false) { // input validation
			return true;
		}
		this.placeOfbirth = placeOfbirth;
		return false;
	}

	public int getDateOfbirth() {
		return dateOfbirth;
	}

	public boolean setDateOfbirth(int dateOfbirth) {
		String birthdate = String.valueOf(dateOfbirth);
		if (birthdate.length() != 8) // input validation
			return true;

		int month = Integer.parseInt(String.valueOf(Character.digit(birthdate.charAt(4), 10))
				+ String.valueOf(Character.digit(birthdate.charAt(5), 10)));
		int day = Integer.parseInt(String.valueOf(Character.digit(birthdate.charAt(6), 10))
				+ String.valueOf(Character.digit(birthdate.charAt(7), 10)));

		if (month < 0 || month > 12 || day < 0 || day > 31) // input validation
			return true;
		this.dateOfbirth = dateOfbirth;
		return false;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getDateMissing() {
		return dateMissing;
	}

	public boolean setDateMissing(int dateMissing) {
		String missingdate = String.valueOf(dateMissing);
		if (missingdate.length() != 8) // input validation
			return true;

		int month = Integer.parseInt(String.valueOf(Character.digit(missingdate.charAt(4), 10))
				+ String.valueOf(Character.digit(missingdate.charAt(5), 10)));
		int day = Integer.parseInt(String.valueOf(Character.digit(missingdate.charAt(6), 10))
				+ String.valueOf(Character.digit(missingdate.charAt(7), 10)));

		if (month < 0 || month > 12 || day < 0 || day > 31) // input validation
			return true;
		this.dateMissing = dateMissing;
		return false;
	}

	public String getSkinColor() {
		return skinColor;
	}

	public boolean setSkinColor(String skinColor) {
		if (Pattern.matches("[a-zA-Z]+", skinColor) == false) { // input validation
			return true;
		}
		this.skinColor = skinColor;
		return false;
	}

	public String getHairColor() {
		return hairColor;
	}

	public boolean setHairColor(String hairColor) {
		if (Pattern.matches("[a-zA-Z]+", hairColor) == false) { // input validation
			return true;
		}
		this.hairColor = hairColor;
		return false;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public boolean setEyeColor(String eyeColor) {
		if (Pattern.matches("[a-zA-Z]+", eyeColor) == false) { // input validation
			return true;
		}
		this.eyeColor = eyeColor;
		return false;
	}
}