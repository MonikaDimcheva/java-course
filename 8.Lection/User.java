
public class User {


	String email;
	String password;
	
	
	public User() {

	}
	
	public User(String email, String password) throws Exception {
		super();
		setEmail(email);
		setPassword(password);
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws Exception {
		if(email.length()<6 && !email.contains("@")){
			throw new Exception("Error");
		}else{
		this.email = email;
		}
	}
	public String getPassword(String password) {
		
		return password;
	}
	public void setPassword(String password) throws Exception {
		if(password.length()<=6){
			throw new Exception("Error");
		}else{
		this.password = password;
	}
	}
	
	
}

