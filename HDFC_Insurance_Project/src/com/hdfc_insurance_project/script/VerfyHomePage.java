package com.hdfc_insurance_project.script;

import org.testng.annotations.Test;

import com.hdfc_insurance_project.pom.HomePage;
import com.hdfc_insurance_project.pom.LoginPage;

public class VerfyHomePage extends BaseTest
{
@Test
public void verfyHomePage()
{
	LoginPage l1=new LoginPage(driver);
    l1.setUserName("admin");
    l1.setPassWord("manager");
    l1.clickLoginButton();
    
    
    HomePage h1=new HomePage(driver);
             h1.clickLogout();
}
	
	
}
