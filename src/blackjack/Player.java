package blackjack;

import blackjack.intefaces.ICard;
import blackjack.intefaces.IPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Player implements IPlayer {

    private String name;
    private List<ICard> cards = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void addCardToHand(ICard card) {
        cards.add(card);


    }

    @Override
    public boolean isNeedAnotherCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s, нужна еще карта? Да/нет\n", name);
        openCards();


        String answer = scanner.nextLine();

        return "Да".equalsIgnoreCase(answer);

    }

    @Override
    public void openCards() {
        for (ICard card : cards) {
            card.open();

        }

    }@Override
    public String getName() {
        return name;
    }

    @Override
    public int countValues() {
        int sum = 0;
        for (ICard card : cards) {
            sum += card.getValue();

        }
        return sum;
    }
}
