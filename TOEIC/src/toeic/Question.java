package toeic;

public abstract class Question {
	protected int partId;
	protected int numbering;
	protected String title;
	protected String answer;
	protected String[] bogi;

	public Question(int partId, int numbering, String title, String[] bogi, String answer) {
		this.partId = partId;
		this.numbering = numbering;
		this.title = title;
		this.bogi = bogi;
		this.answer = answer;
	}

	public abstract String getTtile();

	public abstract String getBogi();

	public abstract String getAnswer();

	public String toString() {
		String s = "";
		s += "----------------------------------------\n";
		s += String.valueOf(numbering) + ". " + title + "\n";
		for (int i = 0; i < bogi.length; i++) {
			s += "("+(char)(i+65)+") "+ bogi[i] + "\n";
		}
		s += "----------------------------------------\n";
		return s;
	}

}
