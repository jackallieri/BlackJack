import java.util.ArrayList;
public class Player {
public int Score;
public String Name;
public int nameNum;
public int value;
public ArrayList<Card> Hand;

public Player(){
    Hand = new ArrayList<Card>();
}
public void printScore(){
    for (int i = 0;i< Hand.size();i++){
        Score = Score + Hand.get(i).value;
    }
    System.out.println("Score:" + Score );

}

    public void printHand(){
        for (int i = 0;i< Hand.size();i++) {
            Hand.get(i).printInfo();

        }

    }
}

