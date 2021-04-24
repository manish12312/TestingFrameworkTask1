package com.cjc.mt.pages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.asserts.SoftAssert;

import junit.framework.TestListener;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;




public class RegisterPage 
{
	
	// one user register mercury Framework design task 1
	WebDriver d;
	
	Properties pro=new Properties();
	Logger log=Logger.getLogger(RegisterPage.class.getName());
	
	
	
	@FindBy(name="firstName")
	WebElement firstname;
    
	
	@FindBy(name="lastName")
	WebElement lastname;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="userName")
	WebElement email;
	
	@FindBy(name="address1")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="postalCode")
	WebElement postalcode;
	
	@FindBy(name="country")
	WebElement country;
	
	@FindBy(name="email")
	WebElement  username;
	
	@FindBy(name="password")
	WebElement  password;
	
	@FindBy(name="confirmPassword")
	WebElement conformpassword;
	
	@FindBy(xpath="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td")
	WebElement submit;
	
	@FindBy(xpath="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	WebElement rbutton;
	
	
	
	
	public RegisterPage(WebDriver d) 
	{
		this.d=d;
		
		log.info("This Our Register Page Consturctor");
	}
	
	

	
 @Test
  public void register(String fn,String ln,String pn,String mail,String  add,String cty,String ste,String pcode,String coun,String un,String pw,String cpw)
  {
	  SoftAssert sa=new SoftAssert();
	  
	  firstname.sendKeys(fn);
	  String ex1=firstname.getAttribute("value");
	  sa.assertEquals(fn,ex1);
	
	    lastname.sendKeys(ln);
		String ex2=lastname.getAttribute("value");
		sa.assertEquals(ln,ex2);
  	   
		 phone.sendKeys(pn);
		 String ex3=phone.getAttribute("value");
		 sa.assertEquals(pn,ex3);
		
		 email.sendKeys(mail);
		 String ex4=email.getAttribute("value");
		 sa.assertEquals(mail,ex4);
		 
		 address.sendKeys(add);
	     String ex5=address.getAttribute("value");
	     sa.assertEquals(add,ex5);  
	    
	     city.sendKeys(cty);
	 String ex6=city.getAttribute("value");
	 sa.assertEquals(cty,ex6);
	  
	 state.sendKeys(ste);
       String ex7=state.getAttribute("value");
		 sa.assertEquals(ste,ex7);
		
		 postalcode.sendKeys(pcode);
		  String ex8=postalcode.getAttribute("value");
		 sa.assertEquals(pcode,ex8);
		  
		 country.sendKeys(coun);
		String ex9=country.getAttribute("value");
		  sa.assertEquals(coun,ex9);
	
		  username.sendKeys(un);
	    String ex10=username.getAttribute("value");
	    sa.assertEquals(un,ex10);
	    
	    password.sendKeys(pw);
		 String ex11=password.getAttribute("value");
		 sa.assertEquals(pw,ex11);
		
		 conformpassword.sendKeys(cpw);
		String ex12=conformpassword.getAttribute("value");
		 sa.assertEquals(cpw,ex12);
		
		 submit.click();
		//	 rbutton.click();
		
  }
 
 
}
