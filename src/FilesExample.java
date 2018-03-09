public class FilesExample {
    public static void main (String[] args) {
        TextFileWriter writer = new TextFileWriter("E:/Programming/firstFile.txt");
        writer.writeToFile("Hello world");
        writer.writeToFile("Erel");
        writer.closeFile();
        TextFileReader reader = new TextFileReader("E:/Programming/firstFile.txt");
        String str;
        while ((str = reader.readFromFile()) != null) {
            System.out.println(str);
        }
        reader.closeFile();
    }
}
