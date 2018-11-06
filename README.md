## Testing Web-Appplications with Selenium _(2 Points)_

> The goal of this exercise is to write a simple system test for a web application as JUnit test cases in Java using the Selenium WebDriver.

### Instructions

TODO

## Page Objects _(3 Points)_

> The objective of this exercise is to extend automated testing of (Web-based) GUIs to increase the maintainability and flexibility of the test implementation.

### Instructions

Read the blog entry [Page Objects in Selenium 2.0][Page Objects in Selenium] about the use of the 'Page Objects' test pattern and refactor the test scripts from the previous exercise into `WidocPageObjectSearchTest.java`.

The test case should be independent from finding elements, clicks, key strokes, etc. operating on specific elements of a Web page. These operations and specific elements should be moved to Page Object classes `SearchPage`, `ResultsPage`, etc.

Note:
* Follow the examples provided at [Page Objects in Selenium] and [SeleniumHQ Wiki about PageObjects][SeleniumHQ Wiki PageObjects]. 
* Use the class PageFactory provided by Selenium to abbreviate the code in the Page Object classes. For further information see the aforementioned blog as well as the [Wiki documentation about PageFactories][SeleniumHQ Wiki PageFactory].
* Run your JUnit test cases – make sure they still pass.

## Data-driven Tests _(2 Points)_

> The implemented test cases contain test code and test data. Goal of this exercise is to separate test data from test code to increase the flexibility and maintainability of the tests.

### Instructions

TODO

[Page Objects in Selenium]: http://blog.activelylazy.co.uk/2011/07/09/page-objects-in-selenium-2-0/
[SeleniumHQ Wiki PageObjects]: https://github.com/SeleniumHQ/selenium/wiki/PageObjects
[SeleniumHQ Wiki PageFactory]: https://github.com/SeleniumHQ/selenium/wiki/PageFactory