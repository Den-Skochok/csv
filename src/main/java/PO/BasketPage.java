package PO;

import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage{
    @FindBy(xpath = "(//div[@class='cart-receipt__sum-price']//span)[1]")
    public WebElement priceElementInBasket;


    public void checkElementInBasketIsLessThanValue(int value){
        Assert.assertTrue(Integer.parseInt(priceElementInBasket.getText()) < value);
    }
}
