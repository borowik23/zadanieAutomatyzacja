package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
    private static WebDriver driver;

    @FindBy(id = "group_1")
    WebElement Size;
    @FindBy(name = "qty")
    WebElement Quantity;
    @FindBy(xpath = "//button[@class='btn btn-primary add-to-cart']")
    WebElement shoppingCart;
    @FindBy(xpath = "//div[@class = \"cart-content-btn\"]/a")
    WebElement proceedToCheckoutButton;
    @FindBy(xpath = "//div/a[text()='Proceed to checkout']")
    WebElement ProceedToCheckout;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectSize(String size) {
        Select drop = new Select(Size);
        drop.selectByVisibleText(size);
    }

    public void inputQuantity(String number){
        Quantity.clear();
        Quantity.sendKeys(number);

    }

    public void addToCart() {
        shoppingCart.click();
    }

    public void proceedToCheckout() throws InterruptedException {
        proceedToCheckoutButton.click();
        Thread.sleep(2000);
        ProceedToCheckout.click();
    }



}
