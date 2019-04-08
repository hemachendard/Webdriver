package com.browser;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage {
	static WebDriver driver;
	public static final String path="./data.properties1";
	public static String getdata(String key) throws Exception 
	{
		File f=new File(path);
		FileInputStream dis=new FileInputStream(f);
		Properties p=new Properties();
		p.load(dis);
		
		return p.getProperty(key);
		
	}

	public static void browserLaunch(String browser,String url) {
		
	if (browser.equalsIgnoreCase("CHROME")) 
	{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	driver=new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("IE")) 
	{
	System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//iedriverserver.exe");
	driver=new InternetExplorerDriver();
	}
	else if (browser.equalsIgnoreCase("FIREFOX"))
	{
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
    driver=new FirefoxDriver();
	}
	driver.get(url);
	driver.manage().window().maximize();
	
	}
	
	
}
