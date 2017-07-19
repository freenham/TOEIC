package test04;

public class Script {
	String[] script;

	public Script() {
		script = new String[101];
		for (int i = 0; i < 100; i++) {
			script[i] = "";
		}
		script[1] = "(A) He's washing off(up x) his face.\n" + "(B) He's drinking from a fountain(분수).\n"
				+ "(C) He's emptying water from a bottle.\n" + "(D) He's turning off a faucet(수도꼭지).\n";
		script[2] = "(A) They're adjusting some tools.\n" + "(B) They're pointing at a conveyor belt.\n"
				+ "(C) They're standing near a piece of machinery.\n" + "(D) They're carrying some boxes.\n";
		script[3] = "(A) He's standing at the rear of a vehicle.\n"
				+ "(B) He's setting a tire into the trunk.(그는 타이어를 트렁크에 넣고있다.)\n"
				+ "(C) He's parking a car in front of an entracnce.\n" + "(D) He's opening the door for a passanger.\n";
		script[4] = "(A) The women are seated next to each other.\n" + "(B) Coffee's being poured into cups.\n"
				+ "(C) One of the woman is delivering the mail.\n" + "(D) Documents are being printed out.\n";
		script[5] = "(A) A crew member is painting lines on the road.\n"
				+ "(B) Windows are being installed in a vehicle.\n"
				+ "(C) A driver is parking a car on the side of the street.\n"
				+ "(D) Balconies are situated above the pillars(기둥).\n";
		script[6] = "(A) Crowds of swimmers are playing in the waves.\n"
				+ "(B) Some chairs are being lined up across the beach.\n"
				+ "(C) Some umbrellas have been set up near a pool.\n"
				+ "(D) Groups of people are gathered on the grass.\n";
		script[7] = "Q. Why did you go to the manager's office?\n"
				+ "(A) He's at the post office.\n"
				+ "(C) We talked about my report.\n"
				+ "(D) I called him yesterday.\n";
		script[8] = "Q. I often go jogging in the park.\n"
				+ "(A) The shop is open.\n"
				+ "(C) He parked his car in the garage.\n"
				+ "(D) I'd like to join you sometime.\n";
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < 100; i++) {
			if (script[i] != "")
				s += i+"번\n"+script[i] + "\n";

		}
		return s;
	}

	public static void main(String[] args) {
		Script s = new Script();
		System.out.println(s);
	}

}
