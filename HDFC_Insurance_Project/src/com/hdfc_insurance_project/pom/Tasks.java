package com.hdfc_insurance_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasks extends BasePage
{

@FindBy(xpath="//div[.='Tasks']")
private WebElement task;



@FindBy(xpath="//input[@name='visiableFilterString']")
private WebElement filterTask;


public Tasks(WebDriver driver)
{
	super(driver);
	
PageFactory.initElements(driver, this);	
}


public void clickTask()
{
	task.click();
}

public void sendFilterTaskName(String name)
{
	filterTask.sendKeys(name);
}
	
}
