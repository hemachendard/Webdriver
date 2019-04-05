package session1;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown2 
{



	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shreyu\\Desktop\\chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	d.navigate().to("http://www.amazon.com");
	d.manage().window().maximize();
	Thread.sleep(2000);
	
	d.findElement(By.id("searchDropdownBox")).sendKeys("Books");
	
	
	/*WebElement a=d.findElement(By.id("searchDropdownBox"));
	List<WebElement>b = a.findElements(By.tagName("option"));
	System.out.println(b.size());
	
	for(int i=0;i<b.size();i++)
	{
		System.out.println(b.get(i).getText());
	    
	}
	WebElement a1=d.findElement(By.id("searchDropdownBox"));
	a1.sendKeys("Books");
	*/
	//Select b1=new Select(a1);
	
	/*WebElement a2=d.findElement(By.id("searchDropdownBox"));
	Thread.sleep(2000);
	a2.sendKeys("Books");*/
	
	
	File Srcfile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(Srcfile, new File("D://Test1.png"));
	}
	
	
	
    
	
}
