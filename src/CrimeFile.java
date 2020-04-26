

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
	public void setCrimeDate(int crimeDate) {
		this.crimeDate = crimeDate;
	}
	public void setUserName(String userName) {
		/*
		for(int i=0;i<userName.length();i++) {
			if(Character.isDigit(userName.charAt(i))) {
				//System.out.println("Please write ");
				userName = "NULL";
			}
		}*/
		
		this.userName = userName;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public void setUserPhone(long userPhone) {
		int length = String.valueOf(userPhone).length();
        if(length>11 || length<0) {
        	System.out.println("Wrong format user phone number!!!!");
        	userPhone = 0;
        }
		this.userPhone = userPhone;
	}
	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}
	public void setComplaintDescription(String complaintDescription) {
		this.complaintDescription = complaintDescription;
	}
	public void setCrimeTime(int crimeTime) {
		this.crimeTime = crimeTime;
	}
	
	public void setCrimeLocation(String crimeLocation) {
		this.crimeLocation = crimeLocation;
	}
    
}
