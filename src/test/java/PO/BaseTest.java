package PO;

import Driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public static WebDriver driver;

    @BeforeClass
    public void setDriver(){
        Driver.createDriver();
        driver = Driver.getDriver();

    }

    @AfterClass
    public void quitDriver(){
        driver.quit();
    }


}
