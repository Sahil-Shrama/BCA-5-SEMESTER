

public class determinewin {
    public static int determinewinings(
        Card lowercard,Card highcard,int bet
    ){
        if(bet<=0){
            System.out.println("chicken out");
            return 0;
        }

    }
    Card nextcard = Card.getrandomcard(2,Card.ACE);



    System.out.println(nextcard);
    if(nextcard.between(lowercard,highcard)){
        System.out.println("you win");
        return bet;
    };
System.out.println("sorry you lose");
return -bet;

}
