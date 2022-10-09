package PO;

import org.openqa.selenium.support.PageFactory;
import Driver.Driver;
//import java.sql.DriverManager;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),  this);
    }
}
