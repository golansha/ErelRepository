public class Player implements Comparable<Player>{
    public String name;
    public int highScore;
    public Player(String name, int highScore){
        this.name = name;
        this.highScore = highScore;
    }

    @Override
    public int compareTo(Player p) {
        return p.highScore - highScore;
    }
}
