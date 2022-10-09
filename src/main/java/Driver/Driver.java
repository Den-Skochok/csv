package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import Properties.PropertyReader;

public class Driver {
    private static WebDriver driver;

    public static void createDriver(){
        System.setProperty(PropertyReader.getValue("nameWebDriver"), PropertyReader.getValue("driverPath"));
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(PropertyReader.getValue("timeout")), TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
