package pageObjs;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.Prop;
import utils.StaDr;

public class BasePage {
	
	// REQUIRED FIELDS FOR OPERATIONS
	public static Actions act;
	public static WebDriverWait wait;
	public static final Logger log;
	
	
	// CONSTRUCTOR SETS FIELDS WHEN class is loaded
	static {
		log = LogManager.getLogger(BasePage.class.getName());
	}
	
	public BasePage() {
		System.out.println(new Throwable().getStackTrace()[0].getMethodName() + " instance is created for user Type : ");
	}
	
	
	
	//REUSSABLE METHODS 
	
	

	public void navigateTo(String urlName) {
		log.info("RUN => " + new Throwable().getStackTrace()[0].getMethodName() + " url: " + urlName);
		StaDr.getDriver().get(Prop.get(urlName));
	}
	
	public void clickOn(By locator) {
		log.info("RUN => " + new Throwable().getStackTrace()[0].getMethodName() + " locator: " + locator);
		waitToClickable(locator);
		act.moveToElement(StaDr.getDriver().findElement(locator)).click(StaDr.getDriver().findElement(locator)).build().perform();
	}
	
	public void clickOnWithJS(By locator) {
        ((JavascriptExecutor) StaDr.getDriver()).executeScript("arguments[0].scrollIntoView(true);", StaDr.getDriver().findElement(locator));
        ((JavascriptExecutor) StaDr.getDriver()).executeScript("arguments[0].click();", StaDr.getDriver().findElement(locator));
    }

	public String readFrom(By locator) {
		log.info("RUN => " + new Throwable().getStackTrace()[0].getMethodName() + " locator: " + locator);
		waitVisibility(locator);
		return StaDr.getDriver().findElement(locator).getText();
	}
	
	public void writeTo(By locator, String text) {
		log.info("RUN => " + new Throwable().getStackTrace()[0].getMethodName() + " locator: " + locator);
		waitVisibility(locator);
		StaDr.getDriver().findElement(locator).sendKeys(text);
	}

	public void waitToClickable(By locator) {
		log.info("RUN => " + new Throwable().getStackTrace()[0].getMethodName() + " locator: " + locator);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void waitVisibility(By locator) {
		log.info("RUN => " + new Throwable().getStackTrace()[0].getMethodName() + " locator: " + locator);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void waitFor(int seconds) {
		try {
			log.info("RUN => " + new Throwable().getStackTrace()[0].getMethodName() + " for: " + seconds);
			Thread.sleep(seconds * 1000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select(By locator, String value) {
		waitVisibility(locator);
		Select selection = new Select(StaDr.getDriver().findElement(locator));
		selection.selectByValue(value);
	}
	
	public String getAttributeFrom(By locator, String attributeName) {
		log.info("RUN => " + new Throwable().getStackTrace()[0].getMethodName() + " locator: " + locator);
		waitVisibility(locator);
		return StaDr.getDriver().findElement(locator).getAttribute(attributeName);
	}
	
	public int getSize(By locator) {
		return StaDr.getDriver().findElements(locator).size();
	}
	
	public boolean isSelected(By locator) {
		waitVisibility(locator);
		return StaDr.getDriver().findElement(locator).isSelected();
	}
	
	// user verify that "ordermessage" is "ordermessage"
	public void verifyThat(String actual, String expected) {
		Assert.assertEquals(actual, expected);
	}
	
	
	

}
