package test04;

public class Script {
	String[] script;
	
	public Script() {
		script = new String[100];
		for(int i=0;i<100;i++) {
			script[i]="";
		}
		script[0] = "(A) He's washing up his face.\n"
				+ "(B) He's drinking from a fountain.\n"
				+ "(C) He's emptying water from a bottle.\n"
				+ "(D) He's turning off apposite.\n";
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
