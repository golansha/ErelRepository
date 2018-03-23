import java.util.Scanner;

public class gameStub {
    public static void main(String[] args) {
        boolean endGame = false;
        String fileName = "E:/Programming/highscores.txt";
        HighscoreBoard board = new HighscoreBoard(fileName);
        Scanner scanner = new Scanner(System.in);
        while (!endGame){
            board.highscoreMadpis();
            System.out.println("enter name");
            String name = scanner.nextLine();
            System.out.println("enter score");
            int score = scanner.nextInt();
            scanner.nextLine();
            board.updateScore(score, name);
            System.out.println("Do you want to continue?");
            endGame = scanner.nextLine().equals("n");
        }
        board.close();
    }
}
