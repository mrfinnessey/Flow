package flow;

public class Sheet {
	boolean onCase;
	String name;
	int initialSpeech;
	String text = "";
	static int numberOfSheets = 0;
	public Sheet(boolean onCase, String name, int initialSpeech) {
		this.onCase = onCase;
		this.name = name;
		this.initialSpeech = initialSpeech;
		numberOfSheets++;
	}
	
	public String getSheet() {
		return text;
	}
}