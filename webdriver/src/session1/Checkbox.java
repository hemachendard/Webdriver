package session1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) 
	
	{

		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
       ChromeDriver d=new ChromeDriver();
       d.navigate().to("http://www.echoecho.com/htmlforms09.htm");
       d.manage().window().maximize();
       WebElement a = d.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
       List<WebElement> a1 = a.findElements(By.tagName("input"));
       
       System.out.println(a1.size());
       for(int i=0;i<a1.size();i++) 
       {
    	   System.out.println(a1.get(i).getAttribute("value")+ "  " +a1.get(i).getAttribute("checked"));
       }
       if( a1.get(0).isSelected())
       {
    	  System.out.println("Element is selected"); 
    	  
       }
       else 
       {
    	   System.out.println("element is not selected");
       }
	}
	

}
