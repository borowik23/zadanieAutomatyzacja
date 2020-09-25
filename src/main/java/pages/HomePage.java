package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private static WebDriver driver;

    @FindBy(css = ".user-info > a")
    WebElement goToSignInPage;
    @FindBy(name = "s")
    WebElement searchInput;
    WebElement foundItem;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void goGoToSignInPage() {
        goToSignInPage.click();
    }

    public void searchItemInput(String item) {
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys(item);
        searchInput.submit();


    }

    public void selectSearchedItem(String item) {
        foundItem = driver.findElement(By.xpath("//div/h2[@class='h3 product-title']/a[contains(.,'" + item + "')]"));
        foundItem.click();
    }

}
