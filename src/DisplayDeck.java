import java.util.* ;

public class DisplayDeck {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        for (int suit = PlayingCards.DIAMONDS; suit <= PlayingCards.SPADES; suit++) {
            for (int rank = PlayingCards.ACE; rank <= PlayingCards.KING; rank++) {
                PlayingCards card = deck.getCard(suit, rank);
                System.out.format("%s of %s%n",
                        card.rankToString(card.getRank()),
                        card.suitToString(card.getSuit()));
            }
        }
    }

}
