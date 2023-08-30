package card;



public class Playgame {
    public static void game(){

        int cashonhand = 100;
        System.out.println("you have cash "+cashonhand+"rupees");
        while (cashonhand>0) {
            System.out.println();
            System.out.println("here are your next two card");
            final Card lowercard = Card.getrandomcard(2,card.king);
            System.out.println(lowercard);
            final Card highcard = card.getrandomcard(lowercard.rank()+1,card.ace);
            System.out.println(highcard);
            final int bet = getbet(cashonhand);
            
        
        final int winnings = determinewinings(lowercard,highcard,bet);
        cashonhand +=winnings;
        if(winnings!=0 || cashonhand!=0){
            System.out.println("you have casg"+cashonhand+"rupee");
        }
    }
    }
    public static void main(String[] args) {
    }
    
}
