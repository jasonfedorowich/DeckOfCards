package deck;

import suits.Suit;

public class Card {

	private Suit suit;
	private CardType cardType;

	public Card(CardType cardType, Suit suit) {
		this.setSuit(suit);
		this.setCardType(cardType);
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public CardType getCardType() {
		return cardType;
	}

	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}

}
