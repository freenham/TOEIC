package test04;

public class Script {
	String[] script;
	
	public Script() {
		script = new String[101];
		for(int i=0;i<100;i++) {
			script[i]="";
		}
		script[1] = "(A) He's washing off(up x) his face.\n"
				+ "(B) He's drinking from a fountain(분수).\n"
				+ "(C) He's emptying water from a bottle.\n"
				+ "(D) He's turning off a faucet(수도꼭지).\n";
		script[2] = "(A) They're adjusting some tools.\n"
				+ "(B) They're pointing at a conveyor belt.\n"
				+ "(C) They're standing near a piece of machinery.\n"
				+ "(D) They're carrying some boxes.\n";
		script[3] = "(A) He's standing at the rear of a vehicle.\n"
				+ "(B) He's setting a tire into the trunk.(그는 타이어를 트렁크에 넣고있다.)\n"
				+ "(C) He's parking a car in front of an entracnce.\n"
				+ "(D) He's opening the door for a passanger.\n";
		script[4] = "(A) The women are seated next to each other.\n"
				+ "(B) Coffee's being poured into cups.\n"
				+ "(C) One of the woman is delivering the mail.\n"
				+ "(D) Documents are being printed out.\n";
		script[5] = "(A) A crew member is painting lines on the road.\n"
				+ "(B) Windows are being installed in a vehicle.\n"
				+ "(C) A driver is parking a car on the side of the street.\n"
				+ "(D) Balconies are situated above the pillars(기둥).\n";
	}
	
	public String toString(){
		String s="";
		for(int i=0;i<100;i++){
			s+=script[i];
		}
		return s;
	}
	
	public static void main(String[] args) {
		Script s = new Script();
		System.out.println(s);
	}

}
