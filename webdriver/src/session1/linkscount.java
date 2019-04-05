package session1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreyu\\Desktop\\disctop\\drivers\\chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("http://www.newtours.demoaut.com");
d.manage().window().maximize();


System.out.println("First tab ELements");


WebElement a=d.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table"));
List<WebElement>a1=a.findElements(By.tagName("a"));
System.out.println(a1.size());
for(int i=0;i<a1.size();i++)
{
	System.out.println(a1.get(i).getText());
	
}

System.out.println("Second tab Elements");


WebElement a2=d.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
List<WebElement>a3=a2.findElements(By.tagName("a"));
System.out.println(a3.size());
for(int j=0;j<a3.size();j++)
{
	System.out.println(a3.get(j).getText());
	
}


	}

}
