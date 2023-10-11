package ejer5;

public class EmailSender {
	
	public static void sendEmail(EmailInformation emailInformation, String message){
		//Envía un mensaje a la dirección de correo electrónico del
		String email = emailInformation.getEmailAddress();
		
		System.out.println(String.format("Mensaje enviado a: %s, %s", email, message));

		}
}
	