package com.browser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LinkeTesting03 
{
	int count=0;
	WebDriver driver;
 
  @BeforeMethod
  public void setup()
  {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.bing.com");
  }
  @Test
  public void linksHeader() throws InterruptedException 
	{
		WebElement header=driver.findElement(By.id("sc_hdu"));
		List<WebElement> links=header.findElements(By.tagName("a"));
		
		System.out.println("Total Links present Header Page :" + links.size());
		for (int i=0;i<links.size();i++) 
		{
			if(!links.get(i).getText().isEmpty())
			{
				count++;
				if(links.get(i).getText().contentEquals("Maps"))
				{
					System.out.println(links.get(i).getText());
					links.get(i).click();
					Thread.sleep(4000);
					break;
				}
			}
			header=driver.findElement(By.id("sc_hdu"));
		 links=header.findElements(By.tagName("a"));
		}
		
		System.out.println("Net Links visible are : "+count);	
	}
	
  @AfterMethod
  public void afterMethod()
  {
	  //driver.close();
	  
  }

}
