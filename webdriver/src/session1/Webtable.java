package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		String a= "/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String b= "]/td[1]";
		for (int i=1;i<=36;i++)
		{
			
		String c=d.findElement(By.xpath(a+i+b)).getText();
		System.out.println(c);
		}
	}

}
