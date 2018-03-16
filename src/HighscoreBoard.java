import java.util.ArrayList;
import java.util.List;

public class HighscoreBoard {
    String fileName;
    List<Player> players = new ArrayList<>();
    public HighscoreBoard(String path){
        TextFileReader reader = new TextFileReader(path);
        fileName = path;
        String str;
        while ((str = reader.readFromFile()) != null) {
            String[] splited = str.split("\t");
            Player player = new Player(splited[0],Integer.getInteger(splited[1]));
        }

    }
    public void highscoreMadpis(){
        for (Player player : players){
            System.out.println(player.player + " " + player.highScore);
        }
    }
    public void close(){
        TextFileWriter writer = new TextFileWriter(fileName);
        for (Player player : players){
            writer.writeToFile(player.player + "\t" + player.highScore);
        }
        writer.closeFile();
    }
}
