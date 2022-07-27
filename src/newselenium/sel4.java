package newselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\auto\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
	Thread.sleep(2000);
	Alert ar=driver.switchTo().alert();
	Thread.sleep(2000);
	ar.dismiss();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]")).click();
	Thread.sleep(6000);
	
	ar.dismiss();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
	ar.sendKeys("hello world");
	Thread.sleep(2000);
	ar.dismiss();
	
	
	
}
}
