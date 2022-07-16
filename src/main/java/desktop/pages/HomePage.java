package desktop.pages;

import abstractclasses.page.AbstractPage;
import desktop.fragments.NavigationBarFragment;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.Constants.*;

public class HomePage extends AbstractPage {
    NavigationBarFragment navigationBar = new NavigationBarFragment(driver);
    @FindBy(xpath = "//input[@name='searchTerm']")
    private WebElement searchBarInput;
    @FindBy(xpath = "//button[@class='header-search-btn']")
    private WebElement searchButton;
    @FindBy(xpath = "//div[@class='secondary-header']")
    private WebElement navigationCategories;

    public HomePage(WebDriver driver, String siteName) {
        super(driver);
        switch (siteName)
        {
            case "EPAM": driver.get(EPAM_HOME_SITE);
            break;
            case "bookdepository": driver.get(INITIAL_HOME_PAGE);
            break;
            case "Selenium": driver.get(SELENIUM_HOME_PAGE);
            break;
            default: driver.get(INITIAL_HOME_PAGE);
        }

    }

    public SearchResultsPage enterSearchTerm(String searchTerm) {
        searchBarInput.sendKeys(searchTerm);
        searchBarInput.sendKeys(Keys.ENTER);
        return new SearchResultsPage(driver);
    }

    public AccountPage navBarClick() {
        navigationBar.signInLabelClick();
        return new AccountPage(driver);
    }

}