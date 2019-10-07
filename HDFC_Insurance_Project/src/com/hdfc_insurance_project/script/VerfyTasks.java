package com.hdfc_insurance_project.script;

import org.testng.annotations.Test;

import com.hdfc_insurance_project.pom.HomePage;
import com.hdfc_insurance_project.pom.LoginPage;
import com.hdfc_insurance_project.pom.Tasks;

public class VerfyTasks extends BaseTest 
{
	
@Test
public void verfyTasks()
{
	LoginPage l1=new LoginPage(driver);
    l1.setUserName("admin");
    l1.setPassWord("manager");
    l1.clickLoginButton();
    
    Tasks t1=new Tasks(driver);
          t1.clickTask();
          t1.sendFilterTaskName("Dinga");      
    
    
    
    HomePage h1=new HomePage(driver);
             h1.clickLogout();
}

}
