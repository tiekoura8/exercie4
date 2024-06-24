package ci.tiekoura.csv_backend.csvFile;


import java.io.File;
import java.util.List;

public interface CSVFile {
    File getFile();
    List<String []> getData();
}
