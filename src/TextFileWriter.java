import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFileWriter {
    PrintStream writer;
    public TextFileWriter(String fileName){
        try{
            writer = new PrintStream(new File(fileName));;
        } catch (IOException x) {
            writer = null;
            System.err.format("IOException: %s%n", x);
        }

    }
    public void writeToFile(String toWrite){
            writer.println(toWrite);
    }
    public void closeFile(){
            writer.close();
    }
}
