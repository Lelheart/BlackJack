package blackjack.intefaces;

public interface IPlayer {

    <ICard> void addCardToHand(ICard card);

    void addCardToHand(ICard card);

    boolean isNeedAnotherCard();

    void openCards();

    int countValues();

    String getName();


}
