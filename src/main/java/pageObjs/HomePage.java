package pageObjs;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
	
	
	// web locators and web elements 
	By plusIcon = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div[2]/a[2]");
	By productContainer = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div");
	By productName = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/h4");
	By productCount = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div[2]/input");
	By cartBtn = By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]");
	By proceedToCheckoutBtn = By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button");
	
	
	// constructor HomePage()
	public HomePage() {
		super();
	}
	
	
	// PAGE METHODS
	public HomePage clickPlusBtn(String count, String productName) {
		
		for (int i = 1; i <= getSize(productContainer); i++) {
			String currentProductName = readFrom(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[" + i + "]/h4"));
			if(currentProductName.contains(productName)) {
				int currentProductCount = Integer.parseInt(getAttributeFrom(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[" + i + "]/div[2]/input"), "value"));
				while(Integer.parseInt(count) > currentProductCount) {
					clickOn(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[" + i + "]/div[2]/a[2]"));
					currentProductCount = Integer.parseInt(getAttributeFrom(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[" + i + "]/div[2]/input"), "value"));
				}
				break;
			}
		}
		return this;
	}
	
	public HomePage clickAddToCartBtn(String productName) {
		
		for (int i = 1; i <= getSize(productContainer); i++) {
			String currentProductName = readFrom(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[" + i + "]/h4"));
			if(currentProductName.contains(productName)) {
				clickOn(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[" + i + "]/div[3]/button"));
				break;
			}
		}
		return this;
	}
		
	public HomePage clickBagBtn() {
		
		clickOn(cartBtn);
		return this;
	}
	
	public HomePage clickProceedToCheckoutBtn() {
		
		clickOn(proceedToCheckoutBtn);
		return this;
	}
	
	
	
	
	
	
	
	
}
