package com.StepDef;

import org.testng.Assert;

import com.pages.HomePage;
import com.runner.Hooks;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDef {
	HomePage homePage;

	public HomeStepDef() {
		homePage = new HomePage(Hooks.driver);
	}

	@When("i click on Whats new section")
	public void i_click_on_whats_new_section() {
		homePage.clickOnWhatsNewSection();
	}

	@Then("It should show New in womens text on page")
	public void it_should_show_new_in_womens_text_on_page() throws InterruptedException {
		Thread.sleep(3000);
		String text = homePage.getTextOnWhats();
		Assert.assertTrue(text.contains("NEW IN WOMEN'S"));
	}

}
