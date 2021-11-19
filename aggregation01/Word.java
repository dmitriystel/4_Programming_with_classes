package by.introduction.fourth.aggregation01.main;

import java.util.Objects;

public class Word {
	
	String word;

	public Word(String word) {
		super();
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	@Override
	public int hashCode() {
		return Objects.hash(word);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(word, other.word);
	}

	@Override
	public String toString() {
		return "Word [word=" + word + "]";
	} 
	
}
