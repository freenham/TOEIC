package test04;

public class Script {
	String[] script;
	
	public Script() {
		script = new String[100];
		for(int i=0;i<100;i++) {
			script[i]="";
		}
		script[0] = "(A) He's washing off(up x) his face.\n"
				+ "(B) He's drinking from a fountain(분수).\n"
				+ "(C) He's emptying water from a bottle.\n"
				+ "(D) He's turning off a faucet(수도꼭지).\n";
		script[1] = "(A) They're adjusting some tools.\n"
				+ "(B) They're pointing at a conveyor belt.\n"
				+ "(C) They're standing near a piece of machinery.\n"
				+ "(D) They're carrying some boxes.\n";
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
