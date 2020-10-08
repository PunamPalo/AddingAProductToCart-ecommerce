package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObject.HomePage;
import resources.BaseHomePage;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class HomepageDefinition extends BaseHomePage {

    @Given("^invoke browser with chrome$")
    public void invoke_browser_with_chrome() throws Throwable {
    	driver=invokebrowser();
    }

    @When("^user enters ParticularBookname$")
    public void user_enters_particularbookname() throws Throwable {
    	HomePage hp = new HomePage(driver);
    	hp.searchTextbox().sendKeys("Think like a monk");
    	Thread.sleep(1000);
    }

    @Then("^view the book$")
    public void view_the_book() throws Throwable {
    	HomePage hp = new HomePage(driver);
    	hp.selectedBook().click();
    	Thread.sleep(1000);
    }

    @And("^navigate to (.+)$")
    public void navigate_to(String url) throws Throwable {
        driver.get(url);
    }

    @And("^click on BestSellers$")
    public void click_on_bestsellers() throws Throwable {
    	HomePage hp = new HomePage(driver);
    	if(hp.getpopupsize().size()>0)
    	hp.getpopup().click();
    	
    	hp.bestSeller().click();
    	Thread.sleep(1000);
    	
       
    }

    @And("^select Books category$")
    public void select_books_category() throws Throwable {
    	HomePage hp = new HomePage(driver);
    	hp.selectBook().click();
    	Thread.sleep(1000);
    }

    @And("^select enter$")
    public void select_enter() throws Throwable {
    	HomePage hp = new HomePage(driver);
    	hp.selectEnter().click();
    	Thread.sleep(1000);
    }

    @And("^Add that book to the cart$")
    public void add_that_book_to_the_cart() throws Throwable {
    	HomePage hp = new HomePage(driver);
    	hp.addtoCart();
    }

    @And("^quit browser$")
    public void quit_browser() throws Throwable {
    	driver.quit();
    }

}