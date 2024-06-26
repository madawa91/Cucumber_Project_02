package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class LoginSteps {
	
	private WebDriver driver;

    @Given("the Chrome browser is open")
    public void theChromeBrowserIsOpen() {
    // Set the path for Chromedriver
    System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe"); // Replace with your path
    // Initialize WebDriver
    driver = new ChromeDriver();
    //open the fb page
    driver.get("https://en-gb.facebook.com/");
    
    }

}
