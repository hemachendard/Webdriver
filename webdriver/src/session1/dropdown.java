package session1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown 

{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreyu\\Desktop\\disctop\\drivers\\chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("http://www.newtours.demoaut.com");
d.manage().window().maximize();
d.findElement(By.linkText("REGISTER")).click();
Thread.sleep(2000);

System.out.println("country Names");

d.findElement(By.name("country")).sendKeys("INDIA");

/*WebElement a=d.findElement(By.name("country"));

List<WebElement>a1=a.findElements(By.tagName("option"));
System.out.println(a1.size());
for(int i=0;i<a1.size();i++)
{
	System.out.println(a1.get(i).getText());
	
}
*/
//d.findElement(By.)
File Srcfile=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(Srcfile, new File("D:\\test.png"));

	}

}

