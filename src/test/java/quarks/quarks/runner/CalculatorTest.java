package quarks.quarks.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue = {"quarks.quarks.stepDefs"},
		features = "src/test/resources/quarks/feature")
public class CalculatorTest {
}