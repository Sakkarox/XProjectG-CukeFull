package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {"@current"},
		dryRun = false,
		monochrome = true,
		glue = "stepDefs",
		features = "src/test/resources/features",
		plugin = {
				"pretty",
				"html:target",
				"json:target/cucumber.json",
				"junit:target/cucumber.xml"
		}
		)

public class CurRunner {

}



/*
 mvn test -Dcucumber.options="--tags @smoke"
 mvn test -Dcucumber.options="--help"
 java cucumber.api.cli.Main --help 
 */
