package com.hdfc_insurance_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ChkBox extends BasePage
{

	@FindBy(id="keepLoggedInCheckBox")
	private WebElement chkBox;
	
	
	public ChkBox(WebDriver driver)
	{
		super(driver);
	PageFactory.initElements(driver, this);	
	}
	
	
	public void clickChkBox()
	{
		chkBox.click();
		
	Assert.assertTrue(chkBox.isSelected());	
	}
}
