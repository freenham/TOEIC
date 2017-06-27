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

}
