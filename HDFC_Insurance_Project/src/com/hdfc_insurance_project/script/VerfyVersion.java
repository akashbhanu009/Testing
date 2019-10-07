package com.hdfc_insurance_project.script;

import org.testng.annotations.Test;

import com.hdfc_insurance_project.pom.Version;

public class VerfyVersion extends BaseTest
{
	
@Test
public void verfyVersion()
{
	Version v1=new Version(driver);
	        v1.verfyVersion("actiTIME 2015.1");
}

}
