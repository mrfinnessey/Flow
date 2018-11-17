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
	//Plan is to operate like this "0 (a) 0.0 (b) 0.1 (c) 1 (d) / 0.0.0 (e) 0.0.0.0 (f) 0.0.0.1 (g) / etc."
	//This resolves to:
	/* a
	 * - b  e
	 * 		-f
	 * 		-g
	 * - c
	 * d */
	//Ex: [XYZ supports [XYZ is corrupt / ABC denies XYZ's claim]/ The plan has no solvency]
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