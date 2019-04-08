package com.browser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG 
{
  @Test(priority=2)
  public void t() 
  {
	  System.out.println("t");
  }
  @Test(priority=1,enabled=false)
  public void g() 
  {
	  System.out.println("g");
  }
  @Test(priority=0)
  public void d() 
  {
	  System.out.println("d");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	 System.out.println("beforemethod"); 
  }

  @AfterMethod
  public void afterMethod() 
  {
	 System.out.println("aftermethod");
  }

  @BeforeClass
  public void beforeClass() 
  {
	System.out.println("beforeclass");  
  }

  @AfterClass
  public void afterClass() 
  {
	System.out.println("aferclass");  
  }

  @BeforeTest
  public void beforeTest() 
  {
	System.out.println("beforetest");  
  }

  @AfterTest
  public void afterTest() 
  {
	System.out.println("aftertest");  
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	System.out.println("beforesuite");  
  }

  @AfterSuite
  public void afterSuite() 
  {
	System.out.println("aftersuite");  
  }

}

