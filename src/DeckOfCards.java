import java.util.*;

public class DeckOfCards {
    public static int numSuits = 4;
    public static int numRanks = 13;
    public static int numCards = numSuits * numRanks;

    private PlayingCards[][] cards;

    public DeckOfCards() {
        cards = new PlayingCards[numSuits][numRanks];
        for (int suit = PlayingCards.DIAMONDS; suit <= PlayingCards.SPADES; suit++) {
            for (int rank = PlayingCards.ACE; rank <= PlayingCards.KING; rank++) {
                cards[suit-1][rank-1] = new PlayingCards(rank, suit);
            }
        }
    }

    public PlayingCards getCard(int suit, int rank) {
        return cards[suit-1][rank-1];
    }

}
