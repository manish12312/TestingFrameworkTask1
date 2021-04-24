package com.cjc.mt.pages;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginPage
{
	
	WebDriver d;
	Logger log=Logger.getLogger(LoginPage.class.getName());
	
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="submit")
	WebElement button;
	
	@FindBy(xpath="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
	WebElement signon;
	
	
	Properties pro=new Properties();
	SoftAssert sa=new SoftAssert();
	
	public LoginPage(WebDriver d) 
	{
		this.d=d;
		log.info("This our LoginPage Constructor");
	}
	
	
	 @Test
	  public void login(String un,String pw)
	  {
		   
		username.sendKeys(un);
	String ex1=username.getAttribute("value");
		sa.assertEquals(un, ex1);
		
		password.sendKeys(pw);
		String ex2=password.getAttribute("value");
      sa.assertEquals(pw,ex2);
		
		button.click();
		
	 }
	 
	  

}
