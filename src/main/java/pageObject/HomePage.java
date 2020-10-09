package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	
	
	
	By popup = By.id("sp-cc-accept");
	By bestSeller = By.linkText("Bestsellers");
	By selectBook = By.partialLinkText("Boeken");
	By searchTextbox=By.id("twotabsearchtextbox");
	By selectEnter = By.xpath("//span[@id='nav-search-submit-text']");
	By selectedBook = By.partialLinkText("Think Like a Monk");
	By addtoCart = By.id("add-to-cart-button");
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	
	public WebElement bestSeller() {
		return driver.findElement(bestSeller);
	}
	public WebElement selectBook() {
		return driver.findElement(selectBook);
	}
	public WebElement searchTextbox() {
		return driver.findElement(searchTextbox);
	}
	public WebElement selectEnter() {
		return driver.findElement(selectEnter);
	}
	public WebElement selectedBook() {
		return driver.findElement(selectedBook);
	}
	public WebElement addtoCart() {
		return driver.findElement(addtoCart);
	}
	public List<WebElement> getpopupsize() {
		return driver.findElements(popup);
	}
	public WebElement getpopup() {
		return driver.findElement(popup);
	}

}
