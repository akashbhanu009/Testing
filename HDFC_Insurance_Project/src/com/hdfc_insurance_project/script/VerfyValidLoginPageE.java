package com.hdfc_insurance_project.script;

import org.testng.annotations.Test;

import com.hdfc_insurance_project.generics.Excel;
import com.hdfc_insurance_project.pom.LoginPage;

public class VerfyValidLoginPageE extends BaseTest
{
	
	
@Test
public void verfyValidLoginPageE()
{
String sheet="VerfyValidLoginPageE";

String un = Excel.getCellValue(PATH, sheet, 1, 1);

String pw = Excel.getCellValue(PATH, sheet, 1, 2);

LoginPage l1=new LoginPage(driver);
          l1.setUserName(un);
          l1.setPassWord(pw);
          l1.clickLoginButton();
	
}

}
