package pageObjs;

public class LoginPage extends BasePage{

	
	
	// web locator
	
	// constructor
	public LoginPage() {
		super();
	}
	
	
	//methods
	public LoginPage inputUsername(String username) {
		
		System.out.print(username);
		return this;
	}
	
	public LoginPage inputPassword(String password) {
		
		System.out.println(password);
		return this;
	}
	
	public LoginPage clickSubmitBtn() {
		
		return this;
	}
	
	
}
