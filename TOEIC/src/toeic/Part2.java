package toeic;

public class Part2 extends Question {

	public Part2(int numbering, String title, String[] bogi, String answer) {
		super(numbering, title, bogi, answer);
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
			if (i == 0) {
				s += "Q. " + bogi[i] + "\n";
			} else
				s += "(" + (char) (i + 64) + ") " + bogi[i] + "\n";
		}
		s += "----------------------------------------\n";
		return s;
	}

}
