package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkscount {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Shreyu\\\\Desktop\\\\disctop\\\\drivers\\\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.freejobalert.com/");
		d.manage().window().maximize();
		System.out.println("first tab elementsLinks");
		d.findElement(By.xpath("//*[@id=\"tabs\"]"));
		/*List<WebElement> links = d.findElements(By.tagName("ul"));
		System.out.println(links.size());
		for(int i=5;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		
		}	
		*/
		System.out.println("second tab element ..............................");
		
		
		
		/*List<WebElement> links2 = d.findElements(By.xpath("//*[@id=\"tabs\"]/ul"));
		System.out.println(links2.size());
		
		for(int i=0;i<links2.size();i++)
		{
			System.out.println(links2.get(i).getText());
		}	*/	
		
		List<WebElement> a1 = d.findElements(By.xpath("//*[@id=\"post-722762\"]/table[2]"));
		System.out.println(a1.size());
		for(int j=1;j<=a1.size();j++) 
		{
			System.out.println(a1.get(j).getText());
		}
		
		//String m= "//*[@id="post-722762"]/table[2]/tbody/tr[";
		
		d.findElement(By.linkText("View All")).click();
	}

}
