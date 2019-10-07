package com.hdfc_insurance_project.script;

import org.testng.annotations.Test;

import com.hdfc_insurance_project.pom.InValidLoginPage;
import com.hdfc_insurance_project.pom.LoginPage;

public class VerfyInvalidLoginPage extends BaseTest
{
	
@Test
public void verfyInvalidLoginPage()
{
	LoginPage l1=new LoginPage(driver);
    l1.setUserName("aaaaaa");
    l1.setPassWord("12345");
    l1.clickLoginButton();
    
    InValidLoginPage i1=new InValidLoginPage(driver);
                      i1.verfyErrorMsg();
    
}

}
