public class Card {
    public int value;
    public String suit;
    public int number;
    public int suitNum;
    public String name;


    public Card(int pNumber, int pSuitNum){


        number = pNumber;
        suitNum = pSuitNum;


        if (suitNum==0){
            suit = "Clubs";
        }
        if (suitNum==1){
            suit = "Hearts";
        }
        if (suitNum==2){
            suit = "Diamonds";
        }
        if (suitNum==3){
            suit = "Spades";
        }
        if (number==10){
            name = "Jack";
        }
        if (number ==1){
            value = 1;
        }
        if (number ==2){
            value = 2;
        }
        if (number ==3){
            value = 3;
        }
        if (number ==4){
            value = 4;
        }
        if (number ==5){
            value = 5;
        }
        if (number ==6){
            value = 6;
        }
        if (number ==7){
            value = 7;
        }
        if (number ==8){
            value = 8;
        }
        if (number ==9){
            value = 9;
        }
        if (number ==10){
            value = 10;
        }
        if (number ==11){
            value = 10;
        }
        if (number ==12){
            value = 10;
        }
        if (number ==13){
            value = 10;
        }

    }


    public void printInfo(){
        System.out.println("***********************");
        System.out.println("value "+ value );
        System.out.println("suit "+ suit );
        System.out.println("number "+ number );
        System.out.println("suitNum "+ suitNum );

    }
}
