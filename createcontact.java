package seleniumsample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class createcontact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		
		
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("muthuselvi");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("muthusankar");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("divya");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("sankar");
		
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("ece");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("i belong to ece department.i am new to selenium learning");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("muthuselvi831994@gmail.com");
		WebElement state=driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select province=new Select(state);
		province.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		

	}

}
