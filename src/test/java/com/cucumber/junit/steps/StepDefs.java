package com.cucumber.junit.steps;

import desktop.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.openqa.selenium.chrome.ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY;


public class StepDefs {
    private final static String CHROME_DRIVER_PATH = "./src/main/resources/chromedriver";

    HomePage homePageObject;

    WebDriver driver;

    @Given("^I open (bookdepository|EPAM|Selenium) site$")
    public void openSite(String siteName) {
        homePageObject = new HomePage(driver, siteName);
    }

    @Then("I close the browser")
    public void closeBrowser(){
        if(driver!=null){
        driver.quit();}
    }

    @Given("I have configured WebDriver")
    public void configureWebDriver() {
        System.setProperty(CHROME_DRIVER_EXE_PROPERTY, CHROME_DRIVER_PATH);
        WebDriverManager.chromedriver().driverVersion("103.0.5060.114").setup();
        driver = new ChromeDriver();
    }

    @And("I verify the header is {string}")
    public void verifyHeader(String title) {
        Assertions.assertEquals(title, driver.getTitle());
    }
}
