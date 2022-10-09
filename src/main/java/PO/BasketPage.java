package PO;

import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage{
    @FindBy(xpath = "(//div[@class='cart-receipt__sum-price']//span)[1]")
    public WebElement priceElementInBasket;


    public void getPriceElementInBasket(){
//        return Integer.parseInt(priceElementInBasket.getText());
//        Assert.assertTrue(Integer.parseInt(priceElementInBasket) < 200000);
        System.out.println("123123");
        priceElementInBasket.click();
    }
}
