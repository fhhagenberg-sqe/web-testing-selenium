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
		driver.get("http://research.fh-ooe.at/de/index");

		assertEquals("Research Documentation FH Oberösterreich", driver.getTitle());

		WebElement titleElem = driver.findElement(By.cssSelector(".heroPanel__title"));
		WebElement descElem = driver.findElement(By.cssSelector(".heroPanel__description"));

		// TODO: assert text of title element to be "Wissensdokumentation"
		// TODO: assert text of description element to be (=> see webpage)

		fail("TODO");
	}

	@Test
	public void testSearch() {
		driver.get("http://research.fh-ooe.at/");

		// (1) TODO: find search box (css selector: ".searchInput__input") and insert
		// text
		// "testing" via key input.

		// (2) TODO: find and click search button (css selector: ".searchInput__submit")

		assertTrue(driver.getCurrentUrl().endsWith("q=testing"));

		// (3) wait for search result list to appear
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".searchItem")));

		// (4) TODO: assert number of search results ("160 Ergebnisse für testing")

		fail("TODO");
	}
}
