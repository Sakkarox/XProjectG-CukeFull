package stepDefs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjs.BasePage;
import pageObjs.CartPage;
import pageObjs.HomePage;
import pageObjs.LoginPage;
import utils.StaDr;



public class BaseTest {
	
	public static final Logger log = LogManager.getLogger(BaseTest.class.getName());
	
	public static HomePage hp;	
	public static CartPage cp;
	public static LoginPage lp; 
	// if this does not work then you gotta create test level setup methods which is called from hooks
	
	public static void pageObjInit() {
		hp = new HomePage();  	
		cp = new CartPage();
		lp = new LoginPage();
		BasePage.act = new Actions(StaDr.getDriver());
		BasePage.wait = new WebDriverWait(StaDr.getDriver(), 15);
	}
	
	public static void pageObjFinit() {
		if (hp != null) {
			hp = null;
		}
		if (cp != null) {
			cp = null;
		}
		if (lp != null) {
			lp = null;
		}
		if(BasePage.act != null) {
			BasePage.act = null;
		}
		if(BasePage.wait != null) {
			BasePage.wait = null;
		}
	}
		
	// you can store some information in a static hashmap in the base test class
	
	
}
