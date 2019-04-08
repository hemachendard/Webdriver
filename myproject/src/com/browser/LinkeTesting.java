package com.browser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class LinkeTesting 
{
	WebDriver driver;
  @BeforeMethod
  public void setup()
  {
	  
	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com/");
  }
  @Test
  public void Linketesting() 
  {
	  String expval = "Google Images";
   driver.findElement(By.linkText("Images")).click();
	Reporter.log("Clicked on Image link");
	String actval = driver.getTitle();
	assertEquals(actval, expval);
	
  }

  @AfterMethod
  public void tearDown() 
  {
	  
  }

}
