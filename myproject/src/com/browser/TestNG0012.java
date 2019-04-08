package com.browser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class TestNG0012 extends BasePage
{
	
    @BeforeClass
  public void beforeClass() throws Exception 
  {
	 browserLaunch(getdata("browser"), getdata("url")); 
  }
    @Test
    public void f() 
    {
  	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");
  	  driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
    }

  @AfterClass
  public void afterClass() 
  {
	  driver.close();
  }

}
