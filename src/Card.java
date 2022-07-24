
public class Card {
	String word;
	String meaning;

	public Card(String front, String back) {
		meaning = back;
		word = front;
	}
	
	@Override
	public String toString() {
		return word;
	}
}
