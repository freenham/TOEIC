package toeic;

public class Bogi {
	private String a;
	private String b;
	private String c;
	private String d;
	
	public Bogi(String a,String b,String c,String d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public Bogi(String a,String b,String c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getLength() {
		if(d==null)
			return 3;
		else
			return 4;
	}
	
	public String toString(){
		String s="";
		for(int i=0;i<getLength();i++) {
			s+=a+"\n";
		}
		return s;
	}
	
}
