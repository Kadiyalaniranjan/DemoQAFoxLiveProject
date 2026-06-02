package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.java.en.*;

public class Register {
	
	@Given("I Launch the application")
	public void i_launch_the_application() {
	 
		Base.driver.get(Base.reader.getUrl());
	}

	@Given("I navigate to Account Registration page")
	public void i_navigate_to_account_registration_page() {

	}

	@When("I provided all the below valid details")
	public void i_provided_all_the_below_valid_details(io.cucumber.datatable.DataTable dataTable) {
	  
	}

	@When("I select the Privacy policy")
	public void i_select_the_privacy_policy() {
	   
	}

	@When("I click on Continue button")
	public void i_click_on_continue_button() {
	  
	}

	@Then("I should see that the User Account has successfully created")
	public void i_should_see_that_the_user_account_has_successfully_created() {
		
	}

}
