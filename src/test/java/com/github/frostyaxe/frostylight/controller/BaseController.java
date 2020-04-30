package com.github.frostyaxe.frostylight.controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.github.frostyaxe.frostylight.ElementHighlighter;
import com.github.frostyaxe.frostylight.StepDescriptor;
import com.github.frostyaxe.frostylight.data.FrostylightData;
import com.github.frostyaxe.frostylight.pages.FlightSearchPage;

/**
 * <b>Description:</b> This is the controller class that handles the creation
 * and sharing of common objects.
 * 
 * @author <i>Abhishek Prajapati ( Team : Frostyaxe | Email:
 *         Prajapatiabhishek1996@gmail.com )</i>
 *
 */
public class BaseController 
{
	
	/*
	 *  Declaration/Initialization of class/instance variables
	 */
	private FlightSearchPage flightSearchPageObj = null;    	// Expedia Flight Searcg Page Reference Variable.
	private WebDriver driver = null;							// Selenium WebDriver reference variable.
	private ElementHighlighter frostyHighlighter = null;		// Selenium Element Highlighter class ( From frostylight jar ) reference variable.
	private StepDescriptor stepDescriptor = null;				// Selenium step descriptor class ( from frostylight jar ) reference variable.
	
	
	
	/*
	 *  This is the initialization block - if you are getting compilation error then please use JDK 1.8 or newer.
	 */
	{
		
		System.setProperty("webdriver.chrome.driver", FrostylightData.chromeDriverPath);		// Setting local chrome driver path. You have to update the path of the chromedriver in FrostylightData class.
		driver = new ChromeDriver();															// Creating chrome driver object and assigning it to the WebDriver reference variable.
		
		flightSearchPageObj = new FlightSearchPage(driver);										// Creating the object of Flight search page and assigning it to the reference variable of FlightSearchPage.
		frostyHighlighter = new ElementHighlighter(driver);										// Creating the instance of ElementHighlighter class and assigning it to the reference variable.
		stepDescriptor = new StepDescriptor(driver);											// Creating the instance of StepDescriptor class and assigning it to the reference variable.
		
	}
	

	/**
	 * <b>Description:</b> This method is executed before starting the execution of
	 * test suite. It uses the TestNG annotation. In this method, webdriver will
	 * open the application URL specified in the FrostylightData class.
	 * 
	 * @author <i>Abhishek Prajapati( Team : Frostyaxe | Email :
	 *         prajapatiabhishek1996@gmail.com )</i>
	 */
	@BeforeSuite
	public void openApp()
	{
		driver.get(FrostylightData.appUrl);		// This step opens the specified application URL in the web browser.
		driver.manage().window().maximize();	// This step maximizes the browser window.
		
	}
	
	
	/**
	 * <b>Description:</b> This method is executed after the execution of test
	 * suite. It uses the TestNG annotation. In this method, driver will close the
	 * browser opened for the testing of application.
	 * 
	 * @author <i>Abhishek Prajapati( Team : Frostyaxe | Email :
	 *         prajapatiabhishek1996@gmail.com )</i>
	 */
	@AfterSuite
	public void tearDown()
	{
		driver.quit();			// Closes the web browser opened for testing the web application.
	}
	
	
	/**
	 * <b>Description:</b> This getter method returns the Flight Search Page object.
	 * 
	 * @return Instance of the Flight Search Page.
	 * @author <i>Abhishek Prajapati( Team : Frostyaxe | Email :
	 *         prajapatiabhishek1996@gmail.com )</i>
	 */
	public FlightSearchPage getFlightSearchPageObj() 
	{
		return flightSearchPageObj;	// Returns the FlightSearchPage instance.	
	}


	/**
	 * <b>Descripton:</b> This getter method returns the WebDriver instance.
	 * 
	 * @return Instance stored in the WebDriver reference variable.
	 * @author <i>Abhishek Prajapati( Team : Frostyaxe | Email :
	 *         prajapatiabhishek1996@gmail.com )</i>
	 */
	public WebDriver getDriver() 
	{
		return driver;			// Returns the instance stored in the WebDriver Reference variable.
	}
	
	
	/**
	 * <b>Description:</b> This getter method returns the object of
	 * ElementHighlighter. This object helps the user to configure the test script
	 * with element highlighting feature.
	 * 
	 * @return Instance of ElementHighlighter
	 * @author <i>Abhishek Prajapati( Team : Frostyaxe | Email :
	 *         prajapatiabhishek1996@gmail.com )</i>
	 *
	 */
	public ElementHighlighter getFrostyHighlighter() 
	{
		return frostyHighlighter;	// Returns the instance of ElementHighlighter class.
	}

	
	/**
	 * <b>Description:</b> This getter method returns the instance of step
	 * descriptor that helps the user to user to configure the feature of display
	 * the currently executing step in the web browser.
	 * 
	 * @return Instance of the StepDescriptor class.
	 * @author <i>Abhishek Prajapati( Team : Frostyaxe | Email :
	 *         prajapatiabhishek1996@gmail.com )</i>
	 */
	public StepDescriptor getStepDescriptor() 
	{
		return stepDescriptor;	// Returns the instance of StepDescriptor class.
	}

	
	
}
