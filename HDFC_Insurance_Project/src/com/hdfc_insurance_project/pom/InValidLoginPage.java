package com.hdfc_insurance_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InValidLoginPage extends BasePage
{
	
@FindBy(xpath="//span[@class='errormsg']")
private WebElement errorMsg;


public InValidLoginPage(WebDriver driver)
{
	super(driver);
	
PageFactory.initElements(driver, this);	
}


public void verfyErrorMsg()
{
Assert.assertTrue(errorMsg.isDisplayed());	
}

}
