package blackjack;

import blackjack.intefaces.IBlackjack;
import blackjack.intefaces.IDeck;
import blackjack.intefaces.IPlayer;

import java.util.ArrayList;
import java.util.List;

public class BlackJack implements IBlackjack {

    private IDeck deck = new Deck();
    private List<IPlayer> players = new ArrayList<>();

    @Override
    public void dealTwoCards() {
        for(IPlayer player : players){
            player.addCardToHand(deck.getRandomCard());
            player.addCardToHand(deck.getRandomCard());
        }

    }

    @Override
    public void addCardsToPlayers() {
        for (IPlayer player : players) {
            while (player.isNeedAnotherCard()){
                player.addCardToHand(deck.getRandomCard());
            }

        }

    }

    @Override
    public void printWinner() {
        List<IPlayer> notBustPlayers = new ArrayList<>();

        if(notBustPlayers.isEmpty()){
            System.out.println("Победил крупье!");
            return;
        }
        if (notBustPlayers.size() ==1){
            IPlayer player = notBustPlayers.get(0);
            System.out.printf("Победил %s!\n", player.getName());
            player.openCards();
            return;
        }

        int maxScore = getMaxScore(notBustPlayers);

        for (IPlayer player : notBustPlayers) {
            if(player.countValues() == maxScore)
            System.out.printf("Победил %s!\n", player.getName());
            player.openCards();

        }

    }
    private int getMaxScore(List<IPlayer> players){
        int max = 0;
        for (IPlayer player : players) {
            if(player.countValues() > max){
                max = player.countValues();
            }

        }
        return max;
    }

    private List<IPlayer> getNotBustPlayers(List<IPlayer> players){
        List<IPlayer> result = new ArrayList<>();
        for (IPlayer player : players) {
            if (player.countValues() <= 21){
                result.add(player);
            }

        }
        return result;

    }

    @Override
    public void addPlayerToGame(IPlayer player) {
        players.add(player);

    }



}
