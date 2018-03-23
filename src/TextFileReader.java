import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFileReader {
    BufferedReader reader;
    public TextFileReader(String fileName){
        try{
            FileInputStream fis = new FileInputStream(fileName);
            reader=new BufferedReader(new InputStreamReader(fis));
        } catch (IOException x) {
            reader = null;
            System.err.format("IOException: %s%n", x);
        }

    }
    public String readFromFile(){
        if (reader == null) {
            return null;
        }
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
    public void closeFile(){
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
