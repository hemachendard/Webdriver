package com.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver;
		// TODO Auto-generated method stub

	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shreyu\\Desktop\\drivers\\chromedriver_mac64\\chromedriver.exe");
	driver=new ChromeDriver();
	//driver.get("https://www.facebook.com");
	driver.navigate().to("https://www.facebook.com");
	driver.manage().window().maximize();
	String x = driver.getTitle();
	System.out.println(x);
    String hemachendar = driver.getCurrentUrl(); 
    System.out.println(hemachendar);
    driver.manage().deleteAllCookies();
    driver.navigate().back();
    Thread.sleep(4000);
    driver.navigate().forward();
    Thread.sleep(4000);
    driver.navigate().refresh();
    Thread.sleep(4000);
    driver.close();
	/*
    System.setProperty("webdriver.ie.driver", "C:\\Users\\Shreyu\\Desktop\\drivers\\IEDriverServer_Win32_3.13.0\\IEDriverServer.exe");
     driver=new InternetExplorerDriver();
     driver.get("https://www.amazon.com");
     
     System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shreyu\\Desktop\\drivers\\geckodriver-v0.20.1-win64\\geckodriver-v0.22.0-win64\\geckodriver.exe");
     FirefoxDriver Ied1=new FirefoxDriver();
     Ied1.get("https://www.amazon.com");*/
	}

}
