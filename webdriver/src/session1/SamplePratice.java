package session1;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamplePratice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreyu\\eclipse-workspace\\MFirstClass\\drivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.id("email_create")).sendKeys("hemachendar55@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
		
		//driver.switchTo().frame(0);
		
		Thread.sleep(2000);
		
	/*WebElement a4=	driver.findElement(By.id("id_gender1"));
	a4.click();
*/	
		Thread.sleep(2000);
	
	WebElement a5=	driver.findElement(By.id("id_gender2"));

	a5.click();
		/*System.out.println(a.size());
		//a.get(1).click();
		for(int i=0;i<a.size();i++) 
		{
			System.out.println(a.get(i).getAttribute("value")+"  "+a.get(i).getAttribute("checked"));
		}*/
        driver.findElement(By.id("customer_firstname")).sendKeys("swapna");
		
        driver.findElement(By.id("customer_lastname")).sendKeys("dhirishala");
		
        driver.findElement(By.id("passwd")).sendKeys("hemachendar");
		
        List<WebElement> d = driver.findElements(By.id("days"));
		
        System.out.println(d.size());
		
        for(int i=1;i<d.size();i++)
			{
			System.out.println(d.get(i).getText());
			
			}
		
		driver.findElement(By.id("days")).sendKeys("12");
		
		List<WebElement> d1 = driver.findElements(By.id("months"));
		
		System.out.println(d1.size());
		
		for(int j=1;j<d1.size();j++) 
		{
			System.out.println(d1.get(j).getText());
		}
		
		driver.findElement(By.id("months")).sendKeys("may");
		
		List<WebElement> d2 = driver.findElements(By.id("years"));
		
		System.out.println(d2.size());
		
		for(int k=1;k<d2.size();k++) 
		{
			System.out.println(d2.get(k).getText());
		}
	    driver.findElement(By.id("years")).sendKeys("2001");
	    
	    driver.findElement(By.id("firstname")).sendKeys("hemachendar");
	    
	    driver.findElement(By.id("lastname")).sendKeys("dhirishala");
	    
	    driver.findElement(By.id("company")).sendKeys("tekperfekt");
	    
	    driver.findElement(By.id("address1")).sendKeys("Mig 127");
	    
	    driver.findElement(By.id("city")).sendKeys("pune");
	    
	    List<WebElement> m = driver.findElements(By.id("id_state"));
	    
	    System.out.println(m.size());
	    
	    for(int l=0;l<m.size();l++)
	    {
	    	System.out.println(m.get(l).getText());
	    }
	    
	    driver.findElement(By.id("id_state")).sendKeys("India");
	    
	    driver.findElement(By.id("postcode")).sendKeys("50244");
	    
	    driver.findElement(By.id("other")).sendKeys("mig127 kpahpphase1");
	    
	    driver.findElement(By.id("phone")).sendKeys("8008990184");
	    
	    driver.findElement(By.id("phone_mobile")).sendKeys("7048995241");;
	    
	    driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
	    
	
	    File Srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    
	    FileUtils.copyFile(Srcfile, new File("D:\\test5.png"));
	    
	}

}
