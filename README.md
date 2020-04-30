# Frostylight
Frostylight is a shared java library that can be use to configure the selenium element highlighter and step descriptor. Selenium element highlighter can highlight the element during the execution of selenium test script and step descriptor can display the message in a container on the web page while executing the test script. User can modify the style of the highlighter as well as can use the custom colors in both element highlighter and step descriptor.

### Starting the test:
 * **Step1**: Change the chromedriver path in FrostylightData.java file.
 * **Step2**: Execute the test by using below command.
 ```
                                             mvn clean test
 ```

### Installation
You need to have Java 1.8 or higher. Add the below dependency in your maven POM file.
```
<dependency>
 <groupId>com.github.frostyaxe</groupId>
 <artifactId>frostylight</artifactId>
 <version>1.0</version>
</dependency>
```

### Usage
* **Step 1:** Create the instance of ChromeDriver, ElementHighlighter and StepDescriptor as shown below.
```
	private WebDriver driver = null;							
	private ElementHighlighter frostyHighlighter = null;
	private StepDescriptor stepDescriptor = null;		
 driver = new ChromeDriver();
 frostyHighlighter = new ElementHighlighter(driver);
 stepDescriptor = new StepDescriptor(driver);
 ```
 
 * **Step 2:** Configuration of StepDescriptor can be done as shown below. You need to add it before performing any action in the web page.
 ```
 stepDescriptor.displayMessage("Clicking on Flight Tab Button");
 ```
 
 
 * **Step 3:** Confguration of ElementHighlighter can be done as shown below. You need to pass the WebElement instance first in order to configure that element with the highlighter and then you can perform any action.
 ```
 WebElement element = frostyHighlighter.getElement(driver.findElement(By.xpath("")));
 element.click();
 ```
 
 
