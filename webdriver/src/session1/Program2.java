package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreyu\\Desktop\\disctop\\drivers\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com/gmail/");
	    d.manage().window().maximize();
	    String a=d.getTitle();
	    System.out.println(a);
	    String b=d.getCurrentUrl();
	    System.out.println(b);
	    d.findElement(By.id("identifierId")).sendKeys("hemachendar23");
	    d.findElement(By.className("CwaK9")).click();
		d.findElement(By.className("password")).sendKeys("8008990184");
	    
	}
	

}
