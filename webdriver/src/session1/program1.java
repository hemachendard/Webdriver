package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreyu\\Desktop\\disctop\\drivers\\chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("http://www.amazon.com");
d.manage().window().maximize();
String a=d.getTitle();
System.out.println(a);
String b=d.getCurrentUrl();
System.out.println(b);
Thread.sleep(2000);
d.findElement(By.id("searchDropdownBox")).sendKeys("Books");
d.findElement(By.id("twotabsearchtextbox")).sendKeys("harry porter");



	}

}
