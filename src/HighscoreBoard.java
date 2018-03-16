import java.util.ArrayList;
import java.util.List;

public class HighscoreBoard {
    List<Player> players = new ArrayList<>();
    public HighscoreBoard(String path){
        TextFileReader reader = new TextFileReader(path);
    }

}
