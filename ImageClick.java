package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ImageClick {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement image = driver.findElement(By.className("fb_logo"));
		
		boolean isDisplayed = image.isDisplayed();
		String imageUrl = image.getAttribute("src");
		
		
		System.out.println("Image is displayed "+ isDisplayed);
		System.out.println("Image url is "+ imageUrl);
		
		
		image.click();
		
		
		
		
	}

}
