package seleniumsample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createlead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Automation testing started");
		System.out.println("opening chrome browser	");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("demosalesmanager");
		WebElement elementpassword = driver.findElement(By.id("password"));
		elementpassword.sendKeys("crmsfa");
		WebElement elementloginbutton = driver.findElement(By.className("decorativeSubmit"));
		elementloginbutton.click();
		WebElement elementcrmsfa = driver.findElement(By.linkText("CRM/SFA"));
		elementcrmsfa.click();
		WebElement elementlead = driver.findElement(By.linkText("Leads"));
		elementlead.click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("muthuselvi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("selvisankar");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("selenium");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("hi, this is muthuselvi");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("muthuselvi831994@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//Thread.sleep(2000);
		WebElement elementstate = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select esd = new Select(elementstate);
		esd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
 
		System.out.println(driver.getTitle());
	}
}
