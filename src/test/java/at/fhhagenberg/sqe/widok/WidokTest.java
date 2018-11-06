package at.fhhagenberg.sqe.widok;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WidokTest {

	private static Class<? extends WebDriver> driverClass = ChromeDriver.class;

	private WebDriver driver;

	@BeforeEach
	public void createDriver() throws Exception {
		WebDriverManager.getInstance(driverClass).setup();
		driver = driverClass.getDeclaredConstructor().newInstance();
	}

	@AfterEach
	public void quitDriver() {
		driver.quit();
	}

	@Test
	public void testSearchForPublication() {
		driver.get("http://research.fh-ooe.at/");

		WebElement searchForm = driver.findElement(By.id("searchForm"));
		{
			WebElement searchBox = searchForm.findElement(By.id("searchedFor"));
			searchBox.sendKeys("testing");

			WebElement searchButton = searchForm.findElement(By.name("search"));
			searchButton.click();

			assertEquals("Widok | Suche", driver.getTitle());
		}

		driver.findElement(By.partialLinkText("Publikationen")).click();

		assertEquals("Testing of Web Applications",
				driver.findElement(By.cssSelector("a[href*='publication/377']")).getText());
	}
}
