package com.hdfc_insurance_project.script;

import org.testng.annotations.Test;

import com.hdfc_insurance_project.generics.Excel;
import com.hdfc_insurance_project.pom.InValidLoginPage;
import com.hdfc_insurance_project.pom.LoginPage;

public class VerfyInvalidLoginPageE extends BaseTest
{
	
	
@Test
public void verfyInvalidLoginPageE()
{
	String sheet="VerfyInvalidLoginPageE";
	
	int rowCount = Excel.getRowCount(PATH, sheet);
	
	for(int i=0;i<rowCount;i++)
	{
		String un = Excel.getCellValue(PATH, sheet, i, 1);
		
		String pw = Excel.getCellValue(PATH, sheet, i, 2);
		
		LoginPage l1=new LoginPage(driver);
		          l1.setUserName(un);
		          l1.setPassWord(pw);
		          l1.clickLoginButton();
		          
		          InValidLoginPage i1=new InValidLoginPage(driver);
		                            i1.verfyErrorMsg();
	}
	
	
}

}
