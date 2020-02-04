package cakess;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class Cakescucumber {

	
		@Given("i have some cakes in my place")
		public void i_have_some_cakes_in_my_place() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("in my place");
		    //throw new cucumber.api.PendingException();
		}

		@When("i ask my team to collect it")
		public void i_ask_my_team_to_collect_it() {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new cucumber.api.PendingException();
		    System.out.println("collect");
		}

		@Then("my cakes disappear")
		public void my_cakes_disappear() {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new cucumber.api.PendingException();
			System.out.println("disappear");
		}
		// TODO Auto-generated method stub


}








