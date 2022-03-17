package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mergecontact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();	
driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click(); 
driver.findElement(By.xpath("//a/img[@src='/images/fieldlookup.gif']")).click();
Set<String> allwindowSet =driver.getWindowHandles();
List<String> allwindowhandlelist=new ArrayList<String>(allwindowSet);
driver.switchTo().window(allwindowhandlelist.get(1));
System.out.println(driver.getCurrentUrl());
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[1]")).click();

driver.switchTo().window(allwindowhandlelist.get(0));	
driver.findElement(By.xpath("(//a/img[@src='/images/fieldlookup.gif'])[2]")).click();
Set<String> allwindowSet1 =driver.getWindowHandles();
List<String> allwindowhandlelist1=new ArrayList<String>(allwindowSet1);
driver.switchTo().window(allwindowhandlelist1.get(1));


Thread.sleep(2000);
System.out.println(driver.getCurrentUrl());


driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[3]")).click();
driver.switchTo().window(allwindowhandlelist.get(0));	
driver.findElement(By.xpath("(//a[contains(text(),'Merge')])[2]")).click();
Alert alert= driver.switchTo().alert();
alert.accept();
System.out.println(driver.getTitle());
	}

}
