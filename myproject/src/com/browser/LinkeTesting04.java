package com.browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkeTesting04 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.bbc.com/");
	    WebElement header = driver.findElement(By.xpath(".//*[@id='page']/section[5]/div/div/section[2]/div/ul/li[2]/div/a"));
	    List<WebElement> links = header.findElements(By.tagName("a"));
	    
	    for(int i=0;i<links.size();i++) 
	    {
	    	System.out.println(links.get(i).getText());
	    	links.get(i).click();
	    	System.out.println(driver.getCurrentUrl());
	    	driver.navigate().back();
	    	Thread.sleep(5000);
	    	header=driver.findElement(By.xpath(".//*[@id='page']/section[5]/div/div/section[2]/div/ul/li[2]/div/a"));
	    	links=header.findElements(By.tagName("a"));
	    }
	    
	}
	

}
