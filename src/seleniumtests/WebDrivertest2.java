package seleniumtests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivertest2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//a[text()='iPhone']")).click();
		driver.findElement(By.xpath("//div[@id='content']//h2[contains(text(),'$')]")).getText();
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.name("quantity")).sendKeys("2");
		driver.findElement(By.id("button-cart")).click();
		driver.findElement(By.xpath("//div[@id-'product-product']/div[contains(text(),'Success: You have added ']")).isDisplayed();
		driver.findElement(By.xpath("//button[@type-'button' and @data-toggle-'dropdown']")).click();
		driver.findElement(By.xpath("//p/a[@href='http://tutorialsninja.com/demo/index.php?route=checkout/cart']")).click();
		String qty=driver.findElement(By.xpath("//div[@class='input-group btn-block']/input")).getAttribute("value");
		//driver.findElement(By.xpath("//td[text()-'"+myprice+"']")).isDisplayed();
		

	}

}
