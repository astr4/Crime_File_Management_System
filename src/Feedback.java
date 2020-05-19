import java.util.regex.Pattern;

public class Feedback { // Feedback class keeps the information of user's feedback

	private String username;
	private String usersurname;
	private String feedback;
	private int feedbackdate;
	
	
	public String getUsername() {
		return username;
	}
	public boolean setUsername(String username) {
		if (Pattern.matches("[a-zA-Z]+", username) == false) { // input validation
			return true;
		}
		this.username = username;
		return false;
	}
	
	public String getUsersurname() {
		return usersurname;
	}
	public boolean setSurName(String surname) {
		if (Pattern.matches("[a-zA-Z]+", surname) == false) { // input validation
			return true;
		}
		this.usersurname = surname;
		return false;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public int getFeedbackdate() {
		return feedbackdate;
	}
	public boolean setFeedbackdate(int feedbackdate) {
		String feedbackd = String.valueOf(feedbackdate);
		if (feedbackd.length() != 8) // input validation
			return true;
		//Separates the date to month and day
		int month = Integer.parseInt(String.valueOf(Character.digit(feedbackd.charAt(4), 10))
				+ String.valueOf(Character.digit(feedbackd.charAt(5), 10)));
		int day = Integer.parseInt(String.valueOf(Character.digit(feedbackd.charAt(6), 10))
				+ String.valueOf(Character.digit(feedbackd.charAt(7), 10)));

		if (month < 0 || month > 12 || day < 0 || day > 31) // input validation
			return true;
		this.feedbackdate = feedbackdate;
		return false;
	}
	
	
}
