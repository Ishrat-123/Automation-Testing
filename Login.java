package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Login {
	public static void main(String[]args) {
		
		String pcLocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.gecko.driver", pcLocation + "\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/selenium/newtours/");
		
		driver.manage().window().maximize();//mazimize the window
		
		
		driver.findElement(By.name("userName")).sendKeys("mercury"); //finding elements by name
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		WebElement clicki = driver.findElement(By.name("submit"));
		clicki.click();//for clicking button
		
		
		String exptitle = "Welcome: Mercury Tours";
		String act_title = driver.getTitle();  //get the title after login
		
		
		if(exptitle.equals(act_title)==true) {
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test is failed");
		}
	
	}

}
