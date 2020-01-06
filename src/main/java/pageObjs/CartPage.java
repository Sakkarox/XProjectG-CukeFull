package pageObjs;

import org.openqa.selenium.By;

public class CartPage extends BasePage {

	// web locators and web elements
	By placeOrderBtn = By.cssSelector("#root > div > div > div > div > button");
	By countryDropdown = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select");
	By agreeTermsCheckbox = By.cssSelector("#root > div > div > div > div > input");
	By proceedBtn = By.cssSelector("#root > div > div > div > div > button");
	
	
	// constructor HomePage()
	public CartPage() {
		super();
	}
	
	// PAGE METHODS
	public CartPage clickPlaceOrderBtn() {
		clickOn(placeOrderBtn);
		return this;
	}
	
	
	public CartPage selectCountry(String countryName) {
		select(countryDropdown, countryName);
		return this;
	}
	
	public CartPage clickAgreeTermsCheckbox() {
		if(!isSelected(agreeTermsCheckbox)) {
			clickOnWithJS(agreeTermsCheckbox);
		}
		return this;
	}
	
	public CartPage clickProceedBtn() {
		clickOn(proceedBtn);
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

































