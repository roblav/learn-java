package stepdefs;

import com.lavender.Calculator;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class CalculatorSteps {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable {
        assertNotNull(calculator);
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void i_add_and(int arg1, int arg2) throws Throwable {
        calculator.add(arg1, arg2);
    }

    @Then("^the result should be (\\d+)$")
    public void the_result_should_be(int result) throws Throwable {
        assertEquals(result, calculator.getResult());
    }
}

