package PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BasePage{
    @FindBy(xpath = "(//app-buy-button//button)[1]")
    public WebElement basketButton;

    public void addToBasketFirstElement(){
        basketButton.click();
    }
}
