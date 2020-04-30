package com.github.frostyaxe.frostylight.testClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.github.frostyaxe.frostylight.color.FrostyColor;
import com.github.frostyaxe.frostylight.controller.BaseController;



/**
 * <b>Description:</b> This test class runs the tests written for the testing of
 * Flight search functionality of Expedia web application. In this class, usage
 * of Element highlighter and Step Descriptor is shown. User can use customized
 * color to highlight the web element and/or display the message in the
 * container. In order to run this test, you need to install maven binaries and
 * then you need to execute the following command: mvn clean test
 * 
 * 
 * @author <i>Abhishek Prajapati ( Team : Frostyaxe | Email:
 *         Prajapatiabhishek1996@gmail.com )</i>
 *
 */
public class FlightSearch extends BaseController			// Extending the base controller to retrieve the page objects and driver object.
{
	
	
	/***
	 * <b>Description:</b> This is the test method that does the step by step
	 * execution of the instructions that are required to test the functionality of
	 * the Flight search functionality of the Expedia web application.
	 * 
	 * @author <i>Abhishek Prajapati ( Team : Frostyaxe | Email:
	 *         Prajapatiabhishek1996@gmail.com )</i>
	 *
	 */
	@Test
	public void test() 
	{
		JavascriptExecutor executor = (JavascriptExecutor)getDriver();		// Initialization of the JavascriptExecutor. This object we are going to use for scrolling of the currently opened window.
		executor.executeScript("window.scrollBy(0,200);");					// Scrolling the window downwards by 200 pixels
		
		try
		{
			TimeUnit.SECONDS.sleep(5);									    // 5 seconds sleep has been added to keep the execution slower.
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();			
		}
		
		getStepDescriptor().displayMessage("Clicking on Flight Tab Button");		// StepDescriptor is configured with the desired message. This step will use the default configuration of step descriptor to display the message on the web page in a container.
		getFrostyHighlighter().getElement(getFlightSearchPageObj().getFlightTabButton()).click();		// In this step, Element Highlighter is configured to highlight the web element with the default configuration.
		
		getStepDescriptor().setContainerColor("orange").displayMessage("Typing Mumbai in the origin text field");		// In this step, StepDescriptor is configured with the custom color ( orange ) for the container in which message is going to be displayed.
		WebElement origin = getFrostyHighlighter().setColor(FrostyColor.getColorHex("yellow")).getElement(getFlightSearchPageObj().getOriginTextField());	// Element Highlighter is configured with the custom color ( yellow ) to highlight the given element. You can use FrostyColor class to generate the hex code of the desired color. It can also generated the RGB/RGBA color.
		
		executor.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'end' });"						// Scrolling till the element is visible on the web page.
				, origin);
		
		origin.sendKeys("Mumbai");													// Sending text to the 'Flying From' auto suggestive drop down.
		try
		{
			TimeUnit.SECONDS.sleep(5);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		origin.sendKeys(Keys.ENTER);
		
		try
		{
			TimeUnit.SECONDS.sleep(5);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		getStepDescriptor().setContainerColor(FrostyColor.getColorHex("cyan")).setContainerTextColor("black").displayMessage("Typing Bengaluru in the destination text field");	 // StepDescriptor is configured with custom color for container as well as text.
		WebElement destination = getFrostyHighlighter().setColor(FrostyColor.getColorHex("white")).getElement(getFlightSearchPageObj().getDestinationTextField());
		
		destination.sendKeys("Bengaluru");
		try
		{
			TimeUnit.SECONDS.sleep(5);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		destination.sendKeys(Keys.ENTER);
		
		
		String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		getStepDescriptor().setContainerColor(FrostyColor.getColorHex("green")).setContainerTextColor("white").displayMessage("Typing departing date in the field");
		WebElement departing = getFrostyHighlighter().setColor(FrostyColor.getColorHex("white")).getElement(getFlightSearchPageObj().getDepartingCalendar());
		
		departing.clear();
		departing.sendKeys(date);
		
		try
		{
			TimeUnit.SECONDS.sleep(5);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		getStepDescriptor().setContainerColor(FrostyColor.getColorHex("red")).setContainerTextColor("white").displayMessage("Typing returing date in the field");
		WebElement returning = getFrostyHighlighter().setColor(FrostyColor.getColorHex("white")).getElement(getFlightSearchPageObj().getReturningCalendar());
		returning.click();
		try
		{
			TimeUnit.SECONDS.sleep(5);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		returning.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
		returning.sendKeys(date);
		
		try
		{
			TimeUnit.SECONDS.sleep(5);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		

		getStepDescriptor().setContainerColor(FrostyColor.getColorHex("yellow")).setContainerTextColor("black").displayMessage("Clicking on submit button");
		WebElement submit = getFrostyHighlighter().setColor(FrostyColor.getColorHex("white")).getElement(getFlightSearchPageObj().getSubmitButton());
		
		submit.click();			
		
	}
	
}
