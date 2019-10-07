package com.hdfc_insurance_project.script;

import org.testng.annotations.Test;

import com.hdfc_insurance_project.pom.ChkBox;

public class VerfyChkBox extends BaseTest
{
	
@Test
public void verfyChkBox()
{
	ChkBox c1=new ChkBox(driver);
	        c1.clickChkBox();
}

}
