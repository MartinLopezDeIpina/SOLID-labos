package ejer5;

public class mainEjer5 {

	public static void main(String[] args) {
		
		GmailAccount gmailAccount = new GmailAccount("Antonio", "antonio@gmail.com");
		
		EmailSender.sendEmail(gmailAccount, "hola Antonio que tal");
	}

}
