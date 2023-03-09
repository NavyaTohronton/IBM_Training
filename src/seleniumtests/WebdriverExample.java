package seleniumtests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebdriverExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("ta1")).sendKeys("Selenium Training");
		driver.findElement(By.id("radio1")).click();
		driver.findElement(By.id("checkbox2")).click();
		Select newLetter=new Select(driver.findElement(By.id("drop1")));
		newLetter.selectByVisibleText("doc 2");
		String text=driver.findElement(By.id("textbook1")).getAttribute("value");
		System.out.println("Text present in field is : "+text);
		driver.findElement(By.id("textbook1")).clear();
		driver.findElement(By.id("textbook1")).sendKeys("Hello");
		driver.findElement(By.id("timerButton")).click();
		//driver.close();

	}

}
