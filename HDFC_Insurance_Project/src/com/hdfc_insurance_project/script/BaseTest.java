package com.hdfc_insurance_project.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutomationConstant
{
public WebDriver driver;


@BeforeMethod
public void preCondition()
{
driver=new FirefoxDriver();

driver.get("http://localhost/login.do");

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}


@AfterMethod
public void postCondition()
{
	driver.close();
}
	

}
