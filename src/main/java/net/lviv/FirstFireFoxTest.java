package net.lviv;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstFireFoxTest {
	
	private static WebDriver driver;
	
	@BeforeClass
	public static void setUpDriver() {
		WebDriverManager.setUpDriver();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8080/");
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}

	@Test
	public void shouldFindBanner() {
		driver.findElement(By.className("navbar-brand")).click();
	}
	
	@Test
	public void shouldNavigateToGroups() {
		List<WebElement> elements = driver.findElements(By.cssSelector(".navbar-nav li"));
		elements.get(2).click();
	}
}
