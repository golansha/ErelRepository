import java.util.ArrayList;
import java.util.List;

public class Bank {
    String fileName;
    int noteNum = 0;
    List<Lakoach> lakoaches = new ArrayList<>();
    public Bank(String path){
        TextFileReader reader = new TextFileReader(path);
        fileName = path;
        String str;
        while ((str = reader.readFromFile()) != null) {
            String[] splited = str.split("\t");
            Lakoach lakoach = new Lakoach(splited[0], Integer.parseInt(splited[1]),
                    Integer.parseInt(splited[2]));
            lakoaches.add(lakoach);
        }
    }
    public int OpenAccount(String name){
        int lacouchNum = noteNum;
        noteNum++;
        lakoaches.add(new Lakoach(name, lacouchNum, 0));
        return lacouchNum;
    }
    public boolean OdMoney(int lakoachNum, int money){
        boolean found = false;
        for (Lakoach lakoach : lakoaches){
            if (lakoachNum == lakoach.lakoachNum){
                found = true;
                lakoach.money = lakoach.money + money;
            }
            else {

            }
        }
        return true;
    }
    public boolean PachotMoney(int lakoachNum, int money){

        return true;
    }
    public void MadpisHeshbonot(){
        for (Lakoach lakoach : lakoaches){
            System.out.println(lakoach.name + " " + lakoach.lakoachNum + " " + lakoach.money);
        }
    }
    public void CloseApp(){
        TextFileWriter writer = new TextFileWriter(fileName);
        for (Lakoach lakoach : lakoaches){
            writer.writeToFile(lakoach.name + "\t" + lakoach.lakoachNum + "\t" + lakoach.money);
        }
        writer.closeFile();

    }
}
