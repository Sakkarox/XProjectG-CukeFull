package stepDefs;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Prop;
import utils.StaDr;

public class Hooks extends BaseTest{
	
	
	
	@Before // ("@current")
	public void openBrowser() {
		log.info("RUN => " + new Throwable().getStackTrace()[0].getMethodName());
		StaDr.init();
		if (Prop.get("browser").contains("headless")) {
            StaDr.getDriver().manage().window().setSize(new Dimension(1440, 900));
        } else {
            StaDr.getDriver().manage().window().maximize();
        }
		BaseTest.pageObjInit();
	}
	
	@After
	public void closeBrowser(Scenario scenario) {
		log.info("RUN => " + new Throwable().getStackTrace()[0].getMethodName());
		if (scenario.isFailed()) {
			try {
				scenario.write("Current Page URL is " + StaDr.getDriver().getCurrentUrl());
				byte[] screenshot = ((TakesScreenshot) StaDr.getDriver()).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException somePlatformsDontSupportScreenshots) {
				System.err.println(somePlatformsDontSupportScreenshots.getMessage());
			}
		}
		StaDr.finit();
		BaseTest.pageObjFinit();
		log.info("\n\n");
	}
	
	 
}



