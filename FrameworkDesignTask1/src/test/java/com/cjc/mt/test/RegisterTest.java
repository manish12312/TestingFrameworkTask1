package com.cjc.mt.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cjc.mt.pages.*;
import com.cjc.mt.pages.*;

@Listeners(List.A.class)
public class RegisterTest 
{
      Properties pro=new Properties();
      Logger log=Logger.getLogger(RegisterPage.class.getName());
      WebDriver d;
      
      
      
	  @Test(priority=1)
	  public void verifyregister() throws IOException
	  {
		  System.setProperty("webdriver.chrome.driver","D:\\Testingsoftware\\chromedriver_win32\\chromedriver.exe");
		  d=new ChromeDriver();
		  d.get("http://demo.guru99.com/test/newtours/register.php");
		  d.manage().window().maximize();
		  
		  FileInputStream fis=new FileInputStream("D:\\Eclipse1\\FrameworkDesignTask1\\src\\test\\resources\\Register.properties");
		  pro.load(fis);
		  
		RegisterPage rg=PageFactory.initElements(d,RegisterPage.class);
		rg.register(pro.getProperty("fname"),pro.getProperty("lname"),pro.getProperty("phoneno"),pro.getProperty("email"),pro.getProperty("address"),pro.getProperty("city"),pro.getProperty("state"),pro.getProperty("postalcode"),pro.getProperty("country"),pro.getProperty("uname"),pro.getProperty("pass"),pro.getProperty("cpass"));
		
	  }
	  
	  @Test(priority=2)
		public void verifylogin() throws IOException
		{
			
			  
		  FileInputStream fis=new FileInputStream("D:\\Eclipse1\\FrameworkDesignTask1\\src\\test\\resources\\Login.properties");
		  pro.load(fis);
		  d.get(pro.getProperty("url"));
		  d.manage().window().maximize();

			  
			  LoginPage lp=PageFactory.initElements(d,LoginPage.class);
			 
			  lp.login(pro.getProperty("username"),pro.getProperty("password"));
			 

		}
		
	  
	  @BeforeSuite
	  public void beforesuite() 
	  {
	 	
	 	  log.info(" This Our BeforeSuite");
	 }

	 @BeforeTest
	  public void beforetest() 
	  {
	 	 
	 	 
	 	 log.info(" This Our BeforeTest");
	  }

	 @BeforeClass
	  public void beforeclass()
	  {
	 	 log.info(" This Our BeforeClass ");
	  }

	   @BeforeMethod
	   public void beforeMethod()
	   {
	 	  
	 	  log.info(" This Our BeforeMethod");
	   }

	   @AfterMethod
	   public void afterMethod() 
	   {
	 	  log.info(" This Our  AfterMethod");
	   }
	   

	  

	   @AfterClass
	   public void afterClass()
	   {
	 	  
	 	  log.info(" This Our  AfterClass");
	 	  
	   }

	  
	   @AfterTest
	   public void afterTest() 
	   {
	 	  log.info(" This Our AfterTest");
	 	  
	 	  
	   }

	   
	   
       @AfterSuite
	   public void afterSuite() 
	   {
	 	  log.info(" This Our AfterSuite");
	 	  
	   }


		
}
