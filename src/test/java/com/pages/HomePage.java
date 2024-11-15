package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//*[@class='navigation']/ul/li[1]")
	private WebElement clickOnWhats;

	
	@FindBy(xpath ="//span[contains(text(),'New in women')]")
	private WebElement newPageText;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnWhatsNewSection() {
		clickOnWhats.click();
	}
	
	public String getTextOnWhats() {
		String text=newPageText.getText();
		return text;
	}
}
