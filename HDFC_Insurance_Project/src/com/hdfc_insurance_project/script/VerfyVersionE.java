package com.hdfc_insurance_project.script;

import org.testng.annotations.Test;

import com.hdfc_insurance_project.generics.Excel;
import com.hdfc_insurance_project.pom.Version;

public class VerfyVersionE extends BaseTest
{
	
@Test
public void verfyVersionE()
{
String sheet="VerfyVersionE";


	String v = Excel.getCellValue(PATH, sheet, 1, 1);
	
	Version v1=new Version(driver);
	        v1.verfyVersion(v);
}

}
