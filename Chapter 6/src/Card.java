/*
 * The Card class stores the following pieces of data: card's
 * suits, card's ranks. All of this information is entirely
 * private to the class. Clients can obtain this information
 * only by using the various methods defined by the class.
 */
public class Card {
	
	// Four suits
	public static final int CLUBS = 1;
	public static final int DIAMONDS = 2;
	public static final int HEARTS = 3;
	public static final int SPADES = 4;
	
	// Four ranks
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;

	// Private instance variable
	private int cardSuit;     // The card's suit
	private int cardRank;     // The card's rank
	
	/**
	 * Creates a new Card object with the specified suit and rank
	 * @param cardSuit The card suit as a String
	 * @param cardRank The card rank as a String
	 */
	public Card(int Suit, int Rank) {
		cardSuit = Suit;
		cardRank = Rank;
	}
	
	/**
	 * Creates a string to identifying the Card.
	 * @return The string used to display the card
	 */
	public String toString() {
		return toRankName() + " of " + toSuitName();
	}
	
	/**
	 * Gets the card rank
	 * @return The rank of the card
	 */
	public int getRank() {
		return cardRank;
	}
	
	/**
	 * Gets the card suit
	 * @return The suit of the card
	 */
	public int getSuit() {
		return cardSuit;
	}
	
	/**
	 * Gets the rank name
	 * @return The rank name
	 */
	public String toRankName() {
		switch(cardRank) {
		case ACE:
			return "Ace";
		case JACK:
			return "Jack";
		case QUEEN:
			return "Queen";
		case KING:
			return "King";
		default:
			return Integer.toString(cardRank);
		}
	}
	
	/**
	 * Gets the suit name
	 * @return The suit name
	 */
	public String toSuitName() {
		switch(cardSuit) {
		case CLUBS:
			return "CLUBS";
		case DIAMONDS:
			return "DIAMONDS";
		case HEARTS:
			return "HEARTS";
		case SPADES:
			return "SPADES";
		default:
			return "Invalid";
		}
	}
}
