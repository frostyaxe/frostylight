package com.github.frostyaxe.frostylight.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * <b>Description:</b> This class contains WebElement objects that are present
 * in the Expedia flight search page.
 * 
 * @author <i>Abhishek Prajapati ( Team : Frostyaxe | Email:
 *         Prajapatiabhishek1996@gmail.com )</i>
 *
 */
public class FlightSearchPage 
{
	
	
	/*
	 *  Declaration/Initialization of class/instance variables
	 */
	@FindBy(id = "tab-flight-tab-hp")
	private WebElement flightTabButton;				// Flight tab button web element
	
	@FindBy(id = "flight-origin-hp-flight" )
	private WebElement originTextField;				// Text Field that accept the 'Flying from' place.
	
	@FindBy(id = "flight-destination-hp-flight" )
	private WebElement destinationTextField;		// Text field that accept the destination place.
	
	@FindBy(id = "flight-departing-hp-flight")
	private WebElement departingCalendar;			// Departing date ( Date picker element )
	
	@FindBy(id = "flight-returning-hp-flight" )
	private WebElement returningCalendar;			// Returning date ( Date picker element )
	
	@FindBy(xpath = "//*[@id=\"gcw-flights-form-hp-flight\"]/div[9]/label/button")
	private WebElement submitButton;				// Form Submit button.
	
	
	
	
	/**
	 * <b>Description:</b> This constructor initializes web elements.
	 * 
	 * @param driver : Instance stored in the WebDriver as an argument.
	 * @author <i>Abhishek Prajapati ( Team : Frostyaxe | Email:
	 *         Prajapatiabhishek1996@gmail.com )</i>
	 *
	 */
	public FlightSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);		// Initialized the Web element reference variables.
	}
	
	
	
	/**
	 * <b>Description:</b> This getter method returns flight tab button web element
	 * object.
	 * 
	 * @return Web element instance of flight tab button
	 * @author <i>Abhishek Prajapati ( Team : Frostyaxe | Email:
	 *         Prajapatiabhishek1996@gmail.com )</i>
	 * 
	 */
	public WebElement getFlightTabButton() 
	{
		return flightTabButton;					// Flight search tab button.
	}

	
	
	/**
	 * <b>Description:</b> This getter method returns the 'Flying from' auto
	 * suggestive dropdown web element object.
	 * 
	 * @return 'Flying from' auto suggestive drop down web element object.
	 * @author <i>Abhishek Prajapati ( Team : Frostyaxe | Email:
	 *         Prajapatiabhishek1996@gmail.com )</i>
	 * 
	 */
	public WebElement getOriginTextField() 
	{
		return originTextField;					// 'Flying from' auto suggestive drop down
	}

	
	
	/**
	 * <b>Description:</b> This getter method returns the 'Flying to' auto
	 * suggestive drop down web element object present on the Expedia flight search
	 * page.
	 * 
	 * @return 'Flying To' auto suggestive drop down web element object
	 * @author <i>Abhishek Prajapati ( Team : Frostyaxe | Email:
	 *         Prajapatiabhishek1996@gmail.com )</i>
	 */
	public WebElement getDestinationTextField()
	{
		return destinationTextField;			// 'Flying to' auto suggestive drop down
	}

	
	
	/**
	 * <b>Description:</b> This method returns the object of the date picker element
	 * that accepts that departing date from the user.
	 * 
	 * @return Instance of Departing date picker web element object.
	 * @author <i>Abhishek Prajapati ( Team : Frostyaxe | Email:
	 *         Prajapatiabhishek1996@gmail.com )</i>
	 * 
	 */
	public WebElement getDepartingCalendar() 
	{
		return departingCalendar;				// Date picker element that accepts departing date from the user
	}

	
	/**
	 * <b>Description:</b> This method returns the object of the date picker element
	 * that accepts that returning date from the user.
	 * 
	 * @return Instance of returning date picker web element object.
	 * @author <i>Abhishek Prajapati ( Team : Frostyaxe | Email:
	 *         Prajapatiabhishek1996@gmail.com )</i>
	 * 
	 */
	public WebElement getReturningCalendar() 
	{
		return returningCalendar;				// Date picker element that accepts departing date from the user
	}


	
	/**
	 * <b>Description:</b> This method returns the flight search form submit button.
	 * 
	 * @return Instance of submit button web element object.
	 * @author <i>Abhishek Prajapati ( Team : Frostyaxe | Email:
	 *         Prajapatiabhishek1996@gmail.com )</i>
	 *
	 */
	public WebElement getSubmitButton() 
	{
		return submitButton;					// Flight search form submit button
	}

	
	
	
	
}
