public class dealingTable {
    public Card[] Deck;
    public Player[] Players;
    public int count = 0;
    public Card index;
    public Card holder;

    public static void main(String[] args) {
        dealingTable myApp = new dealingTable();
    }

    public dealingTable() {

        makeDeck();
        shuffleDeck();
        deal();


    }

public void deal(){
        Players = new Player[5];
        for (int i = 0;i< Players.length; i++) {
                Players[i] = new Player();
        }
        int count2 = 0;
        for (int i=0; i<Players.length; i++ ){
            for (int x=0; x<2; x++){
                Players[i].Hand.add(Deck[count2]);
                count2++;
            }
            System.out.println("***********************");
            System.out.println("Player " + i + " has:");
            Players[i].printHand();

        }
    for (int i = 0;i< Players.length; i++) {
        Players[i].printScore();
    }

}
    public void shuffleDeck() {
        for (int count = 0; count < 52; count++) {
            int randomInt = (int) (Math.random() * 52);
            holder = Deck[count];
            Deck[count] = Deck[randomInt];
            Deck[randomInt] = holder;
            Deck[count].printInfo();
        }
    }
    public void makeDeck() {
        Deck = new Card[52];

        for (int z = 0; z < 4; z++) {
            for (int i = 1; i < 14; i++) {
                Deck[count] = new Card(i, z);
                Deck[count].printInfo();
                count++;
            }
        }
        index = Deck[0];
        Deck[0] = Deck[1];
        Deck[1] = index;
        System.out.println("*****");


        }


}



