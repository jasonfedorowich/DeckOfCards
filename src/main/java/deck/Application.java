package deck;

public class Application {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		System.out.println("Without shuffled: ");
		System.out.println("Top card: ");
		Card card = deck.getTopCard();
		System.out.println("Suit: "+ card.getSuit()+" CardType: "+card.getCardType());
		
		System.out.println("Deck: ");
		deck.printDeck();
		
		System.out.println("Shuffled: ");
		deck.shuffleDeck();
		System.out.println("Top card: ");
		card = deck.getTopCard();
		System.out.println("Suit: "+ card.getSuit()+" CardType: "+card.getCardType());
		
		System.out.println("Deck: ");
		deck.printDeck();
	}

}
