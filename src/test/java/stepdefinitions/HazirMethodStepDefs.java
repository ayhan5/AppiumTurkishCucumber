package stepdefinitions;

import io.cucumber.java.en.When;
import utilities.ReusableMethods;

public class HazirMethodStepDefs {

    @When("kullanici {string} tiklasin")
    public void kullanici_tiklasin(String pageName) {
        ReusableMethods.clickOnPage(pageName);
    }
}
