package org.stepdef;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
WebDriver driver;

@Given("user need to launch fb application on chrome browser.")
public void user_need_to_launch_fb_application_on_chrome_browser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
    }

@When("user enters username and password")
public void user_enters_username_and_password() {
    WebElement username = driver.findElement(By.id("email"));
    username.sendKeys("Deepika");
    WebElement pass = driver.findElement(By.id("pass"));
    pass.sendKeys("deepi123");
}

@When("user click on login button.")
public void user_click_on_login_button() {
    WebElement login = driver.findElement(By.name("login"));
    login.click();
}

@Then("user need to validate home page screen.")
public void user_need_to_validate_home_page_screen() {
	System.out.println("invalid username and password");
    
}



	

}
