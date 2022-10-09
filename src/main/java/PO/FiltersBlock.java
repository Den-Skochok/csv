package PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FiltersBlock extends BasePage {

    @FindBy(xpath = "//div[contains(@class, 'sidebar-alphabet')]//preceding-sibling::div//input[contains(@class, 'sidebar-search__input')]")
    public WebElement brandSearch;

    @FindBy(xpath = "//a[@data-id='HP']")
    public WebElement hpLaptop;

    public void setSearchOnBrandFilter(String searchValue) throws InterruptedException {
        brandSearch.clear();
        brandSearch.sendKeys(searchValue);
        Thread.sleep(3000);
    }

    public void chooseElementInAlphabetToggle(WebElement element) throws InterruptedException {
        element.click();
        Thread.sleep(5000);
    }
}
