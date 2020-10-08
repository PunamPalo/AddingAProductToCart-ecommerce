package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	
	//By menuLink = By.id("nav-hamburger-menu");
	//By selectBooks = By.xpath("//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[1]/li[6]/a[1]");
	//By selectAllBookssubmenu = By.xpath("//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[6]/li[3]/a[1]");
	//By searchTextBox = By.id("twotabsearchtextbox");
	//By selectBestsellerItems = By.xpath("//body/div[@id='a-page']/div[4]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]");
	//By enterbutton =By.id("nav-search-submit-text");
	//By popup = By.id("sp-cc-accept");
	
	
	By popup = By.id("sp-cc-accept");
	By bestSeller = By.xpath("//header/div[@id='navbar']/div[@id='nav-main']/div[2]/div[1]/div[1]/a[2]");
	By selectBook = By.partialLinkText("Boeken");
	By searchTextbox=By.id("twotabsearchtextbox");
	By selectEnter = By.xpath("//span[@id='nav-search-submit-text']");
	By selectedBook = By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[2]/div[1]/span[3]/div[2]/div[1]/div[1]/span[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/a[1]/div[1]/img[1]");
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
