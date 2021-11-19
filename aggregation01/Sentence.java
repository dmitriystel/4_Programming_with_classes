package by.introduction.fourth.aggregation01.main;

public class Sentence {
	
	private String sentence;

	public Sentence(String sentence) {
		super();
		this.sentence = sentence;
	} 
	
	public void addValue(Word word) {
		sentence += " " + word.getWord();
	}

	public String getValue() {
		return sentence;
	}
}
