package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Driver;

public class FirstClass {
    @Given("App telefonda acilsin")
    public void app_telefonda_acilsin() {
        Driver.getAppiumDriver();
    }

    @When("kullanici API demos tiklasin")
    public void kullanici_api_demos_tiklasin() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("kullanici Preference tiklasin")
    public void kullanici_preference_tiklasin() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("kullanici Preference Dependencies tiklasin")
    public void kullanici_preference_dependencies_tiklasin() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("kullanici checkbox tik atsin")
    public void kullanici_checkbox_tik_atsin() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("kullanici WiFi settings tiklasin")
    public void kullanici_wi_fi_settings_tiklasin() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("kullanici kutiya yazi gondersin {string}")
    public void kullanici_kutiya_yazi_gondersin(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("kullanici OK tiklasin")
    public void kullanici_ok_tiklasin() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
