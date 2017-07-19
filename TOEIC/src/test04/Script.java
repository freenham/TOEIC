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
				+ "(B) We talked about my report.\n"
				+ "(C) I called him yesterday.\n";
		script[8] = "Q. I often go jogging in the park.\n"
				+ "(A) The shop is open.\n"
				+ "(B) He parked his car in the garage.\n"
				+ "(C) I'd like to join you sometime.\n";
		script[9] = "Q. Which room should we host the meeting in?\n"
				+ "(A) I don't think it's a roomy(넓직한) enough.\n"
				+ "(B) Do you have a preference?\n"
				+ "(C) I don't have time to meet her.\n";
		script[10] = "Q. Tonight is the company's 10th anniversary party.\n"
				+ "(A) I read the second part.\n"
				+ "(B) Sometime next year.\n"
				+ "(C) I'm looking foward to going.\n";
		script[11] = "Q. What's the customer's decision?\n"
				+ "(A) We'll know later.\n"
				+ "(B) About the constrction project\n"
				+ "(C) There are ten members.\n";
		script[12] = "Q. When will the partnership be announced?\n"
				+ "(A) She can't pronounce it.\n"
				+ "(B) Not until later this month.\n"
				+ "(C) Everyone must choose a partner.\n";
		script[13] = "Q. Who is allowed into the new facility?\n"
				+ "(A) By the end of the day.\n"
				+ "(B) It's open to the public.\n"
				+ "(C) You have a greate abilities.\n";
		script[14] = "Q. Did we order the new equitment already?\n"
				+ "(A) It will be delivered this afternoon.\n"
				+ "(B) It is a factory machinery.\n"
				+ "(C) They will install it for free.\n";
		
	
		
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
