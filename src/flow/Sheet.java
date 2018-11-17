package flow;

public class Sheet {
	//Whether a sheet is on or off-case.
	boolean onCase;
	//The name of a particular sheet.
	String name;
	//What speech a sheet is initially read in. The 1AC is speech 0.
	int initialSpeech;
	//M The text of a particular sheet. See below for the format.
	String text = "";
	//Plan is to operate like this "(a (1) (2)) (b)"
	//This resolves to:
	/* a
	 * - 1
	 * - 2
	 * b*/
	//The current plan is that responses will be put as /'s after each one.
	//The total number of sheets in the debate, used for display purposes.
	static int numberOfSheets = 0;
	
	public Sheet(boolean onCase, String name, int initialSpeech) {
		//TODO constructor for a new Sheet.
		this.onCase = onCase;
		this.name = name;
		this.initialSpeech = initialSpeech;
		numberOfSheets++;
	}
	
	public String getSheet() {
		//TODO get the raw text of a particular sheet.
		return text;
	}
	public void addLine() {
		//TODO add a new line to a sheet.
	}
	public void setInentationLevel(boolean increase) {
		//TODO change the indentation level of a line.
	}
}