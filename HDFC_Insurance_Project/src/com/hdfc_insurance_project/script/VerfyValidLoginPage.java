package com.hdfc_insurance_project.script;

import org.testng.annotations.Test;

import com.hdfc_insurance_project.pom.LoginPage;

public class VerfyValidLoginPage extends BaseTest
{

@Test
public void verfyValidLoginPage()
{
	LoginPage l1=new LoginPage(driver);
	          l1.setUserName("admin");
	          l1.setPassWord("manager");
	          l1.clickLoginButton();
}
	
}
