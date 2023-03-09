package blackjack;

import blackjack.intefaces.IBlackjack;
import blackjack.intefaces.IPlayer;

public class Main {
    public static void main(String[] args) {

        IBlackjack game = new BlackJack();

        IPlayer dealer = new Dealer();
        IPlayer ivan = new Player("Иван") {
            @Override
            public <ICard> void addCardToHand(ICard iCard) {

            }
        };
        IPlayer alena = new Player("Алена") {
            @Override
            public <ICard> void addCardToHand(ICard iCard) {

            }
        };
        IPlayer denis = new Player("Денис") {
            @Override
            public <ICard> void addCardToHand(ICard iCard) {

            }
        };
        IPlayer andrey = new Player("Андрей") {
            @Override
            public <ICard> void addCardToHand(ICard iCard) {

            }
        };

        game.addPlayerToGame(dealer);
        game.addPlayerToGame(ivan);
        game.addPlayerToGame(alena);
        game.addPlayerToGame(denis);
        game.addPlayerToGame(andrey);

        game.dealTwoCards();

        game.addCardsToPlayers();

        game.printWinner();



    }
}
