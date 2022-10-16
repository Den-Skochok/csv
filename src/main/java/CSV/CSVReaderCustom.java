package CSV;

import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSVReaderCustom {
    public static final String path = "/Users/denys/Desktop/testCursor/src/main/resources/csvTest.csv";

    public Iterator<Object[]> readCSV(){
        List<Object[]> returnedList = new ArrayList<>();
        try (com.opencsv.CSVReader reader = new com.opencsv.CSVReader(new FileReader(path))){
            List<String[]> test = reader.readAll();
            returnedList.addAll(test);
        } catch (IOException | CsvException e) {
            throw new RuntimeException(e);
        }
        return returnedList.iterator();
    }
}
