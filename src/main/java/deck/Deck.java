package deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import color.Color;
import suits.Clubs;
import suits.Diamonds;
import suits.Hearts;
import suits.Spades;

public class Deck {

	ArrayList<Card> cards = new ArrayList<>(52);
	public Deck() {
		for(CardType cardType: CardType.values()) {
			cards.add(new Card(cardType, new Clubs()));
		}
		for(CardType cardType: CardType.values()) {
			cards.add(new Card(cardType, new Diamonds()));
		}
		for(CardType cardType: CardType.values()) {
			cards.add(new Card(cardType, new Spades()));
		}
		for(CardType cardType: CardType.values()) {
			cards.add(new Card(cardType, new Hearts()));
		}
	}
	
	
	public void shuffleDeck() {
		
		for(int i=0; i < cards.size(); i++) {
			Random rand = new Random(); 
			int k = rand.nextInt(52);
			swap(cards, k, i);
		}
		
	}
	
	private void swap(ArrayList<Card> cards, int to, int from) {
		Card cardB = cards.get(to);
		Card cardA = cards.get(from);
		cards.set(to, cardA);
		cards.set(from, cardB);
		
	}
	
	public Card getTopCard() {
		return cards.get(cards.size() - 1);
		
	}
	
	public void printDeck() {
		for(Card card: cards) {
			System.out.println("Suit: "+ card.getSuit()+" CardType: "+card.getCardType());
		}
	}

}
