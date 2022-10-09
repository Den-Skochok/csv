package PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SortsBlock extends BasePage {
    @FindBy(xpath = "//select[contains(@class, 'select-css')]")
    public WebElement sortButton;

    @FindBy(xpath = "//option[contains(@class, 'ng-star-inserted') and contains(@value, 1)]")
    public WebElement sortOptionFromCheapToExpensive;

    public void setSearchOnFiltersRozetka() {
        sortButton.click();
        sortOptionFromCheapToExpensive.click();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
