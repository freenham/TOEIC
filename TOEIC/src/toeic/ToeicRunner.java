package toeic;

public class ToeicRunner {
	public static void main (String[] args) {
		
		String[] bogi=new String[4];
		bogi[0] = "She is emptying in a bucket";
		bogi[1] = "She is grasping a sponge";
		bogi[2] = "She is sweeping the floor";
		bogi[3] = "She is standing by the counter";
		Part1 p1 = new Part1(1, 1, "Image 1", bogi, "B");
		Part1 p2 = new Part1(1,2,null,args,"C");
		System.out.println(p1);
		System.out.println(p2);
	}
}
