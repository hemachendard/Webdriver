package com.browser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LinkeTesting01

{
	WebDriver driver;

  @BeforeMethod
  public void setup() 
  {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.hdfcbank.com/");
	  
	  
  }
  @Test
  public void linketesting01() 
  {
	  
	 driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[3]/ul/li[2]/div[1]/a")).click();
	 List<WebElement> str = driver.findElements(By.tagName("a"));
	 System.out.println("Total Linkes in a page including empty Linkes is..."+str.size());
	 for(int i=0;i<str.size();i++)
	 {
		String linkes = str.get(i).getText();
		System.out.println(linkes);
	 }
	 
  }

  @AfterMethod
  public void teardown() 
  {
	  driver.quit();
  }

}
