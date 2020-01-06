package stepDefs;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Prop;

public class UITest extends BaseTest{

	// LOGIN FUNCTION TESTING STEPS=========================================================================================
	@Given("{string} logins with valid credentials")
	public void logins_with_valid_credentials(String userType) {
		
		String username = (userType.equalsIgnoreCase("student")) ? Prop.get("studentUsername") : Prop.get("teacherUsername");
		String password = (userType.equalsIgnoreCase("student")) ? Prop.get("studentPassword") : Prop.get("teacherPassword");
		
		lp
		.inputUsername(username)
		.inputPassword(password)
		.clickSubmitBtn();		
		
	}
	
	
	// PURCHASE FUNCTION TESTING STEPS=========================================================================================
	@Given("user navigates to {string} page")
	public void user_navigates_to_page(String urlAddress) {
	 	
		hp.navigateTo(urlAddress);
		
	}

	@Given("user adds {string} of {string} into cart")
	public void user_adds_of_into_cart(String countOfProduct, String product) {
		
		hp
		.clickPlusBtn(countOfProduct, product)
		.clickAddToCartBtn(product);
		
	}

	@Given("user proceeds to checkout")
	public void user_proceeds_to_checkout() {
		
		hp
		.clickBagBtn()
		.clickProceedToCheckoutBtn();
		
	}

	@When("user places order from {string}")
	public void user_places_order_from(String country) {
		
		cp
		.clickPlaceOrderBtn()
		.selectCountry(country)
		.clickAgreeTermsCheckbox()
		.clickProceedBtn();
		
	}

	@Then("verify that {string} is {string}")
	public void verify_that_is(String actualMessage, String expectedMessage) {
		String[] list = expectedMessage.split("&&&");
		
		cp.verifyThat(cp.readFrom(By.cssSelector("#root > div > div > div > div > span")),  list[0] + "\n" + list[1]);
		
	}
	

}































