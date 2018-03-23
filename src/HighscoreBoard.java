import java.util.ArrayList;
import java.util.Collections;
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
            Player player = new Player(splited[0], Integer.parseInt(splited[1]));
            players.add(player);
        }
        Collections.sort(players);
        reader.closeFile();
    }
    public void highscoreMadpis(){
        for (Player player : players){
            System.out.println(player.name + " " + player.highScore);
        }
    }
    public void close(){
        TextFileWriter writer = new TextFileWriter(fileName);
        for (Player player : players){
            writer.writeToFile(player.name + "\t" + player.highScore);
        }
        writer.closeFile();
    }
    public void updateScore(int score, String playerName){
        boolean found = false;
        for (Player player : players){
            if (playerName.equals(player.name)){
                found = true;
                if (score > player.highScore){
                    player.highScore = score;
                }
            }
        }
        if (!found){
            players.add(new Player(playerName, score));
        }
        Collections.sort(players);
    }
}
