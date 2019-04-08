package com.browser;

import org.openqa.selenium.By;

public class TestCase2001 extends BasePage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      browserLaunch(getdata("browser"), getdata("url"));
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oppomobiles");
	  driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
	}

}
