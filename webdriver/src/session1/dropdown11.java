package session1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("http://www.echoecho.com/htmlforms11.htm");
d.manage().window().maximize();
WebElement a1=d.findElement(By.name("mydropdown"));
List<WebElement>a2=a1.findElements(By.tagName("option"));
System.out.println(a2.size());
for(int i=0;i<a2.size();i++)
{
	System.out.println(a2.get(i).getText());
	
}
	d.findElement(By.name("mydropdown")).sendKeys("Old Cheese");
		}
}