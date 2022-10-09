package PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RozetkaHeader extends BasePage {

    @FindBy(xpath = "//a[@href='https://rozetka.com.ua']")
    public WebElement homeLogo;

    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchInputField;

    @FindBy(xpath = "//button[contains(@class, 'search-form__submit')]")
    public WebElement searchFindButton;

    @FindBy(xpath = "//li[contains(@class, 'header-actions__item')][7]")
    public WebElement basketButton;

    public void setSearchOnRozetka(String searchValue){
        searchInputField.clear();
        searchInputField.sendKeys(searchValue);
        searchFindButton.click();
    }

    public void goToBasketPage(){
        basketButton.click();
    }


}
