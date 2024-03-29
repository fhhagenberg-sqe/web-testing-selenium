# Testing Web-Applications with Selenium

In this assignment you learn how to build a maintainable test framework for testing web applications using JUnit and the [Selenium WebDriver][Selenium WebDriver]. Starting with a simple Selenium based test you will gradually improve the code to get a test system with abstraction layer, reusable functions and a separate test data pool.

## (1) Capture & Replay with Selenium IDE _(1 Point)_

In this exercise you learn the basics of automated web testing via capture and replay. We use [Selenium IDE][] for this.

### Prerequisites

- [x] A current version of either Firefox or Chrome web browser.
  _(Note: In our preparations we had some troubles running Selenium IDE on Firefox.)_

### Instructions

1. Install Selenium IDE as extension to your browser (install either [Selenium IDE for Firefox][] or [Selenium IDE for Chrome][]).
1. Load the Selenium IDE project [`src/side/FHResearchTest.side`](src/side/FHResearchTest.side) into your Selenium IDE.

   This project contains a test case that perform checks on the _University of Applied Science's Research Publication web page_ located at https://pure.fh-ooe.at/de/publications/.

1. Add **two** additional test cases by using the 'record' function of Selenium IDE:
   1. The first test case tests - similar to `ResearchGermanTest` - the english translation of the search page. Name it `ResearchEnglishTest`.
      _(Hint: The english version is available via https://pure.fh-ooe.at/en/publications/.)_

   1. The second test case performs a search for the keyword 'testing' and checks the number of publications found as well as the link-text of the first publication in the list. Name this test `ResearchSearchTest`.

1. Run all tests and make sure they complete sucessfully.

1. :floppy_disk: Save the Selenium IDE project. Overwrite the existing file [`src/side/FHResearchTest.side`](src/side/FHResearchTest.side).

Some hints:
* To add a new test, click the "+" symbol in the 'Tests' view of the IDE.
* To start recording, click the red "rec" button at the very right of the IDE.
* Make sure to clean up the test cases after recording to get rid of unwanted commands that may have been recorded accidentially.

### Submission

When you're done...

- [x] push your changes to your upstream repository on GitHub.
- [x] on GitHub, [create a release][GitHub creating releases] with version `v1.0`.
- [x] upload the [link to your release][GitHub linking to releases] on the e-learning platform until the specified date and time before the next lecture.

## (2) JUnit Test using Selenium WebDriver _(2 Points)_

The goal of this exercise is to learn how to write a simple system test for a web application as JUnit test cases in Java using the Selenium WebDriver. The test cases we implement are those of the previous exercise.

### Prerequisites

- [x] Completion of the previous exercise (1).
- [x] Java 13 SDK. (Works also with other versions, but this might require slight modifications of [`pom.xml`](pom.xml).)
- [x] Maven 3. (If you use an IDE like Eclipse or IntelliJ, Maven is **already included** :sunglasses:.)

### Instructions

1. This git repository is a [Maven Project][]. Import it into/Open it in your favourite IDE (e.g. Eclipse, IntelliJ).

   The required libraries _Unit_, _Selenium WebDriver_ (and two more) are already set up as Maven dependencies. So you do not have to download or install anything, your IDE will locate and download them for you.
   If you prefer to **not** use an IDE, you can use the Maven command line tool _mvn_ to compile and package your classes and execute your tests.

1. Take the existing class [`at.fhhagenberg.sqe.fhresearch.FHResearchTest`](src/test/java/at/fhhagenberg/sqe/fhresearch/FHResearchTest.java) as starting point to write a system test with JUnit and Selenium WebDriver. Implement _all of the tests of the previous exercise (1)_:

   1. `testResearchGerman`: Ensure, the default search page is correctly translated to german.
   1. `testResearchEnglish`: Ensure, the english search page is correctly translated to english.
   1. `testResearchSearch`: Search for 'testing' and check the number of publications and if the first publication has the title _"Testen von Web-Anwendungen"_;

1. Run all your tests and make sure they complete successfully.

### Submission
When you're done...

- [x] push your changes to your upstream repository on GitHub.
- [x] on GitHub, [create a release][GitHub creating releases] with version `v2.0`.
- [x] upload the [link to your release][GitHub linking to releases] on the e-learning platform until the specified date and time before the next lecture.

## (3) Page Objects _(3 Points)_

In this exercise you learn how to extend automated testing of (Web-based) GUIs to increase the maintainability and flexibility of your test implementation.

The test code written in the previous example has no abstractions and is therefore not well maintainable, especially when the page structure changes in a future version. Therefore, we want to create a more abstract domain-specific Test-API for the Widok web page to be able to write "high-level" tests that do not break on minor changes of the web page.

### Prerequisites

- [x] Completion of the previous exercise (2).
- [x] Java 13 SDK. (Works also with other versions, but this might require slight modifications of [`pom.xml`](pom.xml).)
- [x] Maven 3. (If you use an IDE like Eclipse or IntelliJ, Maven is **already included** :sunglasses:.)

### Instructions

Read the blog entry [Page Objects in Selenium][] about the use of the 'Page Objects' test pattern and refactor the test scripts from the previous exercise into `FHResearchPageObjectsTest.java`.

The test cases should be independent from finding elements, clicks, key strokes, etc. operating on specific elements of a Web page. These operations and specific elements should be moved to Page Object classes `SearchPage`, `ResultsPage`, etc. Put these classes into a separate package (e.g. `at.fhhagenberg.sqe.fhresearch.pages`).

Note:
* Follow the examples provided at [Page Objects in Selenium] and [SeleniumHQ Wiki about PageObjects][SeleniumHQ Wiki PageObjects].
* Use the class `PageFactory` provided by Selenium to abbreviate the code in the Page Object classes. For further information see the aforementioned blog as well as the [Wiki documentation about PageFactories][SeleniumHQ Wiki PageFactory].
* Run your JUnit test cases – make sure they still pass.

### Submission

When you're done...

- [x] push your changes to your upstream repository on GitHub.
- [x] on GitHub, [create a release][GitHub creating releases] with version `v3.0`.
- [x] upload the [link to your release][GitHub linking to releases] on the e-learning platform until the specified date and time before the next lecture.

## (4) Data-driven Tests _(2 Points)_

The implemented test cases contain test code and test data. In this exercise you learn how to to increase the flexibility and maintainability of the tests by separating test data from test code.

### Prerequisites

- [x] Completion of the previous exercise (3).
- [x] Java 13 SDK. (Works also with other versions, but this might require slight modifications of [`pom.xml`](pom.xml).)
- [x] Maven 3. (If you use an IDE like Eclipse or IntelliJ, Maven is **already included** :sunglasses:.)

### Instructions

1. First, check https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests on details about JUnit’s support for parameterized test cases.

1. Create a parameterized JUnit `FHResearchParameterizedSearchTest.java` test to repeat the following scenario
   1. Search for a term (e.g. 'testing') and
   1. Check the number of found results, first title, types, publication years, etc.

![Parameterized test items](fhresearch-screenshot.png)

Please, write your test case according to following instructions:
* Create a parameterized test that uses the page objects written in the previous exercise (3).
* Provide a list of search terms (e.g., "embedded", "software", "testing") and expected result numbers (e.g. "47", "11", ...) as parameter set; the parameterized test iterates over this parameter set.
* You can choose either the german (`/de/`) or english (`/en/`) page for this exercise.

### Submission

When you're done...

- [x] push your changes to your upstream repository on GitHub.
- [x] on GitHub, [create a release][GitHub creating releases] with version `v4.0`.
- [x] upload the [link to your release][GitHub linking to releases] on the e-learning platform until the specified date and time before the next lecture.

[GitHub creating releases]: https://help.github.com/articles/creating-releases/
[GitHub linking to releases]: https://help.github.com/articles/linking-to-releases/
[Selenium IDE]: https://www.seleniumhq.org/selenium-ide/
[Selenium IDE for Firefox]: https://addons.mozilla.org/en-US/firefox/addon/selenium-ide/
[Selenium IDE for Chrome]: https://chrome.google.com/webstore/detail/selenium-ide/mooikfkahbdckldjjndioackbalphokd
[Maven Project]: https://maven.apache.org/guides/getting-started/
[Page Objects in Selenium]: http://blog.activelylazy.co.uk/2011/07/09/page-objects-in-selenium-2-0/
[Selenium WebDriver]: https://www.selenium.dev/documentation/en/webdriver/
[Selenium Wiki PageObjects]: https://github.com/SeleniumHQ/selenium/wiki/PageObjects
[Selenium Wiki PageFactory]: https://github.com/SeleniumHQ/selenium/wiki/PageFactory
