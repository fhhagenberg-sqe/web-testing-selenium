package at.fhhagenberg.sqe.fhresearch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.seljup.SeleniumExtension;

@ExtendWith(SeleniumExtension.class)
public class FHResearchTest {

	private WebDriver driver;

	public FHResearchTest(ChromeDriver driver) {
		this.driver = driver;
	}

	@Test
	public void testResearchGerman() {
		driver.get("https://pure.fh-ooe.at/de/publications/");

		assertEquals("Publikationen finden — FH Oberösterreich", driver.getTitle());

		WebElement titleElem = driver.findElement(By.cssSelector("#search-description"));

		// TODO: assert text of title element to be "Publikationen finden"

		fail("TODO");
	}

	@Test
	public void testSearch() {
		driver.get("https://pure.fh-ooe.at/en/publications/");

		// (1) TODO: find search box (css selector: "#global-search-input") and insert
		// text "testing" via key input.

		// (2) TODO: find and click search button (css selector: "css=#normalSearch")

		assertTrue(driver.getCurrentUrl().contains("originalSearch=testing"));

		// (3) wait for search result list to appear
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".list-results")));

		// (4) TODO: assert number of search results ("1 - 50 out of 168 results")

		fail("TODO");
	}
}
