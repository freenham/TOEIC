package toeic;

public class Part1 extends Question {

	public Part1(int partId, int numbering, String title, String[] bogi, String answer) {
		super(partId, numbering, title, bogi, answer);
	}

	@Override
	public String getTtile() {
		return title;
	}

	@Override
	public String getBogi() {
		String s = "";
		for (int i = 0; i < bogi.length; i++) {
			s +=bogi[i] + "\n";
		}
		return s;
	}

	@Override
	public String getAnswer() {
		return answer;
	}

}
