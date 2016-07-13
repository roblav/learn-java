package stepdefs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        format = { "pretty", "html:target/cucumber" },
        features = "src/test/java/featurefiles/calculator.feature"
)
public class RunCalculatorTest {
}