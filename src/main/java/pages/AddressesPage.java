package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressesPage {
    private static WebDriver driver;

    @FindBy(css = ".addresses-footer > a")
    WebElement createAddress;
    @FindBy(name = "alias")
    WebElement aliasInput;
    @FindBy(name = "address1")
    WebElement addressInput;
    @FindBy(name = "city")
    WebElement cityInput;
    @FindBy(name = "postcode")
    WebElement postcodeInput;
    @FindBy(name = "id_country")
    WebElement countrySelect;
    @FindBy(name = "phone")
    WebElement phoneInput;
    @FindBy(xpath = "//footer/button[@type=\"submit\"]")
    WebElement submitFormButton;
    @FindBy(css = ".alert-success")
    WebElement successAlert;

    public AddressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void createNewAddress() {
        createAddress.click();
    }

    public void setAlias(String alias) {
        aliasInput.clear();
        aliasInput.sendKeys(alias);
    }

    public void setAddress(String address) {
        addressInput.clear();
        addressInput.sendKeys(address);
    }

    public void setCity(String city) {
        cityInput.clear();
        cityInput.sendKeys(city);
    }

    public void setPostCode(String postcode) {
        postcodeInput.clear();
        postcodeInput.sendKeys(postcode);
    }

    public void setPhone(String phone) {
        phoneInput.clear();
        phoneInput.sendKeys(phone);
    }

    public void submitForm() {
        submitFormButton.click();
    }

    public void selectCountry(String country) {
        Select drop = new Select(countrySelect);
        drop.selectByVisibleText(country);

    }
    public String getSuccessAlertMessage() {
        return successAlert.getText();
    }

}
