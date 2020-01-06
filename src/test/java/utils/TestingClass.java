package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingClass {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[4]/div[3]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
		
		
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/input")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/input")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/input")).isSelected());
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"root\\\"]/div/div/div/div/input")));
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/input"));
		js.executeScript("document.querySelector(\"#root > div > div > div > div > input\").checked = true;");
		
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/input")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/input")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/input")).isSelected());
		
		
		
		
		Thread.sleep(4000);
		driver.quit();
		
		
		
		
		
		
		
		
	}
	

}
