
public class UserComplaint {

	private String title;
	private String subject;
	private String complaint;
	private int complaintDate;
	private String adminReply;
	
	public String getAdminReply() {
		return adminReply;
	}
	public void setAdminReply(String adminReply) {
		this.adminReply = adminReply;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getComplaint() {
		return complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	public int getComplaintDate() {
		return complaintDate;
	}
	public boolean setComplaintDate(int complaintDate) {
		String fullDate = String.valueOf(complaintDate);
		if (fullDate.length() != 8) // input validation
			return true;
		//Separates the date to month and day
		int month = Integer.parseInt(String.valueOf(Character.digit(fullDate.charAt(4), 10))
				+ String.valueOf(Character.digit(fullDate.charAt(5), 10)));
		int day = Integer.parseInt(String.valueOf(Character.digit(fullDate.charAt(6), 10))
				+ String.valueOf(Character.digit(fullDate.charAt(7), 10)));

		if (month < 0 || month > 12 || day < 0 || day > 31) // input validation
			return true;

		this.complaintDate = complaintDate;
		return false;
	}
	
	
}
