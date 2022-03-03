package seleniumsample;

import java.awt.Label;
import java.nio.channels.SelectionKey;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
//driver.findElement(By.linkText("Create New Account")).click();
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("muthuselvi");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("muthusankar");
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9677866514");
driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("selvisankar");
WebElement elementday = driver.findElement(By.xpath("//select[@id='day']"));
Select day=new Select(elementday);
day.selectByVisibleText("8");
WebElement elementmonth = driver.findElement(By.xpath("//select[@id='month']"));
Select month=new Select(elementmonth);
month.selectByIndex(3);
WebElement elementyear=driver.findElement(By.xpath("//select[@id='year']"));
Select year=new Select(elementyear);
year.selectByValue("1994");
driver.findElement(By.xpath("//input[@value='1']")).click();




	}

}
