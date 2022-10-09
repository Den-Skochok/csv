package PO;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Properties;
import Properties.PropertyReader;

public class POTests extends BaseTest {

    @Test
    public void basketTest() throws InterruptedException {
        driver.get(PropertyReader.getValue("rozetkaHomeUrl"));
        RozetkaHeader rozetkaHeader = new RozetkaHeader();
        FiltersBlock filtersBlock = new FiltersBlock();
        SortsBlock sortsBlock = new SortsBlock();
        ResultPage resultPage = new ResultPage();
        BasketPage basketPage = new BasketPage();

        rozetkaHeader.setSearchOnRozetka("laptop");
        Thread.sleep(5000);
        filtersBlock.setSearchOnBrandFilter("hp");
        filtersBlock.chooseElementInAlphabetToggle(filtersBlock.hpLaptop);
        sortsBlock.setSearchOnFiltersRozetka();
        resultPage.addToBasketFirstElement();
        rozetkaHeader.goToBasketPage();
        basketPage.getPriceElementInBasket();//тут не знаю але чомусь не працює, підкажіть пліз як
//        Assert.assertTrue(Integer.parseInt(basketPage.priceElementInBasket) < 200000);



    }
}
