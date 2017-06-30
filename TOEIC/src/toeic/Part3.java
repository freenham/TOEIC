package toeic;

public class Part3 extends Question {
	private String script;

	public Part3(int numbering, String title, String script, String[] bogi, String answer) {
		super(numbering, title, bogi, answer);
		this.script = script;
	}

	@Override
	public String getTtile() {
		return title;
	}

	@Override
	public String getBogi() {
		String s = "";
		for (int i = 0; i < bogi.length; i++) {
			s += bogi[i] + "\n";
		}
		return s;
	}

	@Override
	public String getAnswer() {
		return answer;
	}

	public String toString() {
		String s = "";
		s += "----------------------------------------\n";
		s += String.valueOf(numbering) + ". " + title + "\n";
		for (int i = 0; i < bogi.length; i++) {
			if (i < 5)
				s += "(" + (char) (i + 65) + ") " + bogi[i] + "\n";
		}
		if (numbering % 3 == 1)
			s += " "+script + "\n";
		s += "----------------------------------------\n";
		return s;
	}

}
