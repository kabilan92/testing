package Facebook;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumhw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.facebook.com");
		String title=driver.getTitle();
		System.out.println("Title is " +title);
		String title2="Facebook - Log In or Sign Up";
		Assert.assertEquals(title, title2);
		System.out.println("Title is verified");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("DEF");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("ABCdef");
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month1= new Select(month);
		//month1.selectByIndex(3);
		month1.selectByValue("4");
		List<WebElement> month2=month1.getOptions();
		System.out.println("size of month dropdown is " +month2.size());
		WebElement s_month= month1.getFirstSelectedOption();
		System.out.println("The selected month is " + s_month.getText());
		for ( WebElement element: month2) { 
		    System.out.println(element.getText());
		}
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day1= new Select(day);
		day1.selectByVisibleText("3");
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year1= new Select(year);
		year1.selectByVisibleText("1992");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		
	}

}
