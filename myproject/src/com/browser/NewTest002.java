package com.browser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;



public class NewTest002 extends BasePage 
{
    @BeforeMethod
    @Parameters("browser")
  public void testprocess(String fir) throws Exception 
  {
  
    	browserLaunch(fir, getdata("url"));
  }
   @Test
   public void login() 
   {
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("swathi");
	   
   }


  @AfterMethod
  public void endprocess() 
  {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oppomobiles");
	  driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
	  driver.close();
  }

}
