package com.hdfc_insurance_project.script;

import org.testng.annotations.Test;

import com.hdfc_insurance_project.pom.LoginPage;

public class VerfyLoginPageTitle extends BaseTest
{
	
	
@Test
public void verfyLoginPagetitle()
{
	LoginPage l1=new LoginPage(driver);
               l1.verfyTitle("actiTIME - Login");
}

}
