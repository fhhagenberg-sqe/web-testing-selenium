# Testing Web-Appplications with Selenium

In this assignment you learn how to build a maintainable test framework for testing web applications using JUnit and the [Selenium WebDriver][SeleniumHQ WebDriver]. Starting with a simple Selenium based test you will gradually improve the code to get a test system with abstraction layer, reusable functions and a separate test data pool.

## (1) JUnit Test using Selenium WebDriver _(2 Points)_

The goal of this exercise is to learn how to write a simple system test for a web application as JUnit test cases in Java using the Selenium WebDriver.

### Instructions

1. Take the existing class [at.fhhagenberg.sqe.widok.WidokTest](src/test/java/at/fhhagenberg/sqe/widok/WidokTest.java) as starting point to write a system test with JUnit and Selenium WebDriver. Your code should test the FH Widok web page:
   1. Open the page http://research.fh-ooe.at/ as entry point.
   2. Conduct a search scenario, for example: Enter the search term “testing”; switch to “Publications”; check that the search actually returns the expected number of entries.
   3. Click on a specific publication and check that the expected page is returned. For example, check the page title.

### Submission

When you're done...

1. push your changes to your upstream repository on GitHub.

1. on GitHub, [create a release][GitHub creating releases] with version 'v1.0'.

1. upload the [link to your release][GitHub linking to releases] on the e-learning platform until the specified date and time before the next lecture.

## (2) Page Objects _(3 Points)_

In this exercise you learn how to extend automated testing of (Web-based) GUIs to increase the maintainability and flexibility of your test implementation.

### Instructions

1. Read the blog entry [Page Objects in Selenium 2.0][Page Objects in Selenium] about the use of the 'Page Objects' test pattern and refactor the test scripts from the previous exercise into `WidocPageObjectSearchTest.java`.

1. The test case should be independent from finding elements, clicks, key strokes, etc. operating on specific elements of a Web page. These operations and specific elements should be moved to Page Object classes `SearchPage`, `ResultsPage`, etc.

Note:
* Follow the examples provided at [Page Objects in Selenium] and [SeleniumHQ Wiki about PageObjects][SeleniumHQ Wiki PageObjects]. 
* Use the class PageFactory provided by Selenium to abbreviate the code in the Page Object classes. For further information see the aforementioned blog as well as the [Wiki documentation about PageFactories][SeleniumHQ Wiki PageFactory].
* Run your JUnit test cases – make sure they still pass.

### Submission

When you're done...

1. push your changes to your upstream repository on GitHub.

1. on GitHub, [create a release][GitHub creating releases] with version 'v2.0'.

1. upload the [link to your release][GitHub linking to releases] on the e-learning platform until the specified date and time before the next lecture.

## (3) Data-driven Tests _(2 Points)_

The implemented test cases contain test code and test data. In this exercise you learn how to to increase the flexibility and maintainability of the tests by separating test data from test code.

### Instructions

TODO

### Submission

When you're done...

1. push your changes to your upstream repository on GitHub.

1. on GitHub, [create a release][GitHub creating releases] with version 'v3.0'.

1. upload the [link to your release][GitHub linking to releases] on the e-learning platform until the specified date and time before the next lecture.

[GitHub creating releases]: https://help.github.com/articles/creating-releases/
[GitHub linking to releases]: https://help.github.com/articles/linking-to-releases/
[Page Objects in Selenium]: http://blog.activelylazy.co.uk/2011/07/09/page-objects-in-selenium-2-0/
[SeleniumHQ WebDriver]: https://www.seleniumhq.org/projects/webdriver/
[SeleniumHQ Wiki PageObjects]: https://github.com/SeleniumHQ/selenium/wiki/PageObjects
[SeleniumHQ Wiki PageFactory]: https://github.com/SeleniumHQ/selenium/wiki/PageFactory