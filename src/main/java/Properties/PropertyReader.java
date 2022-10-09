package Properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
    private static Properties properties;

    static {
        try {
            properties = new Properties();
            InputStream inputStream = PropertyReader.class.getClassLoader().getResourceAsStream("tests.properties");
            properties.load(inputStream);
            inputStream.close();
        }
        catch (IOException exception){
            throw new RuntimeException(exception);
        }
    }

    public static String getValue(String propertiesValue){
        String systemProperty = System.getProperty(propertiesValue);
        if (systemProperty != null){
            return systemProperty;
        }
        return properties.getProperty(propertiesValue);
    }
}
