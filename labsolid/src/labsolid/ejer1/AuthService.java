package labsolid.ejer1;

public class AuthService {
	public boolean signIn(String service, String log, String pass) {
		if(service.compareTo("Facebook") == 0) {
			return singInWithFB(log, pass);
		}
		if(service.compareTo("google") == 0) {
			return singInWithGoogle(log, pass);
		}
		if(service.compareTo("twitter") == 0) {
			return singInWithTwitter(log, pass);
		}
		if(service.compareTo("Apple") == 0) {
			return singInWithApple(log, pass);
		}
		return false;
	}
	
	public boolean singInWithFB(String log, String pass) {
		//use de FB api
		return true;
	}
	public boolean singInWithGoogle(String log, String pass) {
		//use te google api
		return true;
	}
	public boolean singInWithTwitter(String log, String pass) {
		//use the Twitter api
		return true;
	}
	public boolean singInWithApple(String log, String pass) {
		//use the Apple api
		return true;
	}
}
