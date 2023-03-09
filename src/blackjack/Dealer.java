package blackjack;

import blackjack.intefaces.IDealer;

public class Dealer extends Player implements IDealer {
    public Dealer() {
        super("??????");

    }

    @Override
    public <ICard> void addCardToHand(ICard iCard) {

    }

    @Override
    public boolean isNeedAnotherCard() {
//       if (countValues() < 17){
//           return true;
//       }
//       return false;
        return countValues()<17;
    }




}
