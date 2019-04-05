package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchingELement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("http://www.newtours.demoaut.com");
d.manage().window().maximize();
d.findElement(By.linkText("REGISTER")).click();

d.findElement(By.name("country")).sendKeys("INDIA");

}
}