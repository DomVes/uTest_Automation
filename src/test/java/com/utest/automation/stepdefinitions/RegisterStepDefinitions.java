package com.utest.automation.stepdefinitions;

import com.utest.automation.drivers.ChromeDriver;
import com.utest.automation.questions.IsLogged;
import com.utest.automation.tasks.Register;
import com.utest.automation.utils.Excel;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class RegisterStepDefinitions {

    Excel excel = new Excel();
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^I find myself on the page$")
    public void IFindMyselfOnThePage() throws IOException {
        //Call the Excel file and get the Url for Test
        OnStage.theActorCalled("Esteban").can(BrowseTheWeb.with(ChromeDriver.ChromeWebDriver().on(excel.leerDatoExcel("Dominios", "Data.xlsx", 1, 0))));
    }


    @When("^I go to the registration module$")
    public void IGoToTheRegistrationModule() {
        //Invoke the Register Methods and Actions
        OnStage.theActorInTheSpotlight().attemptsTo(Register.onuTest());
    }

    @Then("^I can register successfully$")
    public void ICanRegisterSuccessfully() throws IOException {
        //Validate the element and Compare width the UserAccount on the Excel File
            OnStage.theActorInTheSpotlight()
                    .should(seeThat(IsLogged.onTheSite(),
                            equalTo(excel.leerDatoExcel("Credenciales", "Data.xlsx", 1, 13))));

        }
    }
