package ejer5;

public class GmailAccount implements EmailInformation{
	String name, emailAddress;
	
	public GmailAccount(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }


	@Override
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void sendEmail(String message) {
		EmailSender.sendEmail(this, message);
	}

}
