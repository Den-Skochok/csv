package CSV;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Iterator;
import org.junit.*;

public class CSVTests {
    public static final Logger LOGGER = LogManager.getLogger(CSVTests.class);
    @DataProvider(name = "dpWithCSV")
    public Iterator<Object[]> csvDataProvider(){
        return new CSVReaderCustom().readCSV();
    }

    @Test(dataProvider = "dpWithCSV")
    public void testWithCSV(String firstColumnValue, String secondColumnValue){

        if (firstColumnValue.contains(" ") || secondColumnValue.contains(" ")) {
            String firstColumnValueReplace = firstColumnValue.replace(" ", "");
            String secondColumnValueReplace = firstColumnValue.replace(" ", "");
            if(firstColumnValueReplace.contains(secondColumnValueReplace)){
                Assert.assertTrue(firstColumnValueReplace.contains(secondColumnValueReplace));
                LOGGER.warn("Value from first column " + firstColumnValue + " or Value from second column " + secondColumnValue + " contains space. Please check the correctness of the value");
                LOGGER.info("'" + firstColumnValue + "'" + " contains " + "'" + secondColumnValue + "'");
            } else {
                LOGGER.error("'" + firstColumnValue + "'" + " NOT CONTAINS " + "'" + secondColumnValue + "'");
            }
        } else {
            if(firstColumnValue.contains(secondColumnValue)){
                Assert.assertTrue(firstColumnValue.contains(secondColumnValue));
//                LOGGER.debug("In " + firstColumnValue + " or " + secondColumnValue + " NO spaces");
                LOGGER.info("'" + firstColumnValue + "'" + " contains " + "'" + secondColumnValue + "'");
            } else {
                LOGGER.error("'" + firstColumnValue + "'" + " NOT CONTAINS " + "'" + secondColumnValue + "'");
            }
        }
    }
}
