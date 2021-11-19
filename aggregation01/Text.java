package by.introduction.fourth.aggregation01.main;

import java.util.Objects;

public class Text {	
	private String header;
	private String body = "";
	private String text;
	
	public Text() {
	}
	
	public Text(Word word) {
		header = word.getWord();
	}

	public Text(Sentence sentence) {
		header = sentence.getValue();
	}
		
	public Text(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public String getHeader() {
		return header;
	}

	public void addBody(Word word) {
		body += " " + word.getWord();
	}

	public void addBody(Sentence sentence) {
		body += " " + sentence.getValue();
	}

	public String getBody() {
		return body;
	}
		
	public void printText() {
		System.out.println(getText());		
	}

	@Override
	public int hashCode() {
		return Objects.hash(body, header, text);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		return Objects.equals(body, other.body) && Objects.equals(header, other.header)
				&& Objects.equals(text, other.text);
	}

	@Override
	public String toString() {
		return "Text [header=" + header + ", body=" + body + ", text=" + text + "]";
	}		
}
