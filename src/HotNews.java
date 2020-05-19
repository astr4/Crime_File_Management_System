
public class HotNews { //Keep the information about hot news

	private String title;
	private String text;
	private int newsDate;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getNewsDate() {
		return newsDate;
	}
	public boolean setNewsDate(int newsDate) {
		String fullDate = String.valueOf(newsDate);
		if (fullDate.length() != 8) // input validation
			return true;
		//Separates the date to month and day
		int month = Integer.parseInt(String.valueOf(Character.digit(fullDate.charAt(4), 10))
				+ String.valueOf(Character.digit(fullDate.charAt(5), 10)));
		int day = Integer.parseInt(String.valueOf(Character.digit(fullDate.charAt(6), 10))
				+ String.valueOf(Character.digit(fullDate.charAt(7), 10)));

		if (month < 0 || month > 12 || day < 0 || day > 31) // input validation
			return true;

		this.newsDate = newsDate;
		return false;
	}
	
	
}
