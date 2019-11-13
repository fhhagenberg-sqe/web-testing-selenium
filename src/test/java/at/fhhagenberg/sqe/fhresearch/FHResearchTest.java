package at.fhhagenberg.sqe.fhresearch;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FHResearchTest {

	private static Class<? extends WebDriver> driverClass = ChromeDriver.class;

	private WebDriver driver;

	@Before
	public void createDriver() throws Exception {
		WebDriverManager.getInstance(driverClass).setup();
		driver = driverClass.getDeclaredConstructor().newInstance();
	}

	@After
	public void quitDriver() {
		driver.quit();
	}

	@Test
	public void testSearch() {
		driver.get("http://research.fh-ooe.at/");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".searchInput__input")));
		WebElement searchBox = driver.findElement(By.cssSelector(".searchInput__input"));

		searchBox.click();
		searchBox.sendKeys("testing");

		WebElement searchButton = driver.findElement(By.cssSelector(".searchInput__submit"));
		searchButton.click();

		assertTrue(driver.getCurrentUrl().endsWith("q=testing"));
	}
}
