package toeic;

public class ToeicRunner {
	public static void main (String[] args) {
		
		Part1[] p=new Part1[6];
		String[] bogi=new String[4];
		String[] bogi2=new String[3];
		String question;
		
		bogi[0] = "She is emptying in a bucket.";
		bogi[1] = "She is grasping a sponge.";
		bogi[2] = "She is sweeping the floor.";
		bogi[3] = "She is standing by the counter.";
		Part1 p1 = new Part1(1, "Image 1", bogi, "B");
		System.out.println(p1);
		
		
		bogi[0]="The woman are exchanging folders.";
		bogi[1]="The woman are arranging some chairs.";
		bogi[2]="One of the woman is reaching for the calculator.";
		bogi[3]="One of the woman is pointing to a notepad.";
		Part1 p2 = new Part1(2,"Image 2",bogi,"C");
		System.out.println(p2);
		
		bogi[0]="The woman is resting on a sofa.";
		bogi[1]="The woman is basing away from a screen.";
		bogi[2]="The woman is taking off her shoes";
		bogi[3]="The woman is turning on a light.";
		Part1 p3  = new Part1(3,"Image 3",bogi,"A");
		System.out.println(p3);
		
		bogi[0]="Some items have been stored in boxes.";
		bogi[1]="Books are being returned to the circulation desk.";
		bogi[2]="Tables are being cleared at a library.";
		bogi[3]="All of the seats have been occupied.";
		Part1 p4  = new Part1(4,"Image 4",bogi,"A");
		System.out.println(p4);
		
		bogi[0]="The skiers are riding the rift of the mountain.";
		bogi[1]="Some people are hiking through the snow.";
		bogi[2]="The tree has been cut down in a forest.";
		bogi[3]="Some people are skiing down a hill.";
		Part1 p5  = new Part1(5,"Image 5",bogi,"D");
		System.out.println(p5);
		
		bogi[0]="A group of people is lounging in the sun.";
		bogi[1]="Some people are walking along the side walk.";
		bogi[2]="Renovations are being made to a building.";
		bogi[3]="Pedestrians are crossing in intersection.";
		Part1 p6  = new Part1(6,"Image 6",bogi,"B");
		System.out.println(p6);
		
		bogi[0]="Where should we go to eat lunch?";
		bogi[1]="At 12:30 sharp.";
		bogi[2]="Papayes restaurant if possible.";
		bogi[3]="Yes, I'm very hungry.";
		Part2 p7  = new Part2(7,"Mark your answer on your answer sheet.",bogi,"B");
		System.out.println(p7);
		
		bogi[0]="What did Tomas need help with?";
		bogi[1]="Sure, I'm free now.";
		bogi[2]="He can come with us too.";
		bogi[3]="Assembling a new desk.";
		Part2 p8  = new Part2(8,"Mark your answer on your answer sheet.",bogi,"C");
		System.out.println(p8);
		
		bogi[0]="When did you purchase this painting?";
		bogi[1]="Andre Gabriel is the artist.";
		bogi[2]="There is a pricetag on it.";
		bogi[3]="I had it for three years for now.";
		Part2 p9  = new Part2(9,"Mark your answer on your answer sheet.",bogi,"C");
		System.out.println(p9);
		
		bogi[0]="Your watch is five minutes off.";
		bogi[1]="I'll reset it.";
		bogi[2]="I've seen that film.";
		bogi[3]="In a few minutes.";
		Part2 p10  = new Part2(10,"Mark your answer on your answer sheet.",bogi,"A");
		System.out.println(p10);

		bogi[0]="Who approve a new budget?";
		bogi[1]="The costly budget.";
		bogi[2]="You will have to ask a manager.";
		bogi[3]="No, it's quite old.";
		Part2 p11  = new Part2(11,"Mark your answer on your answer sheet.",bogi,"B");
		System.out.println(p11);
		
		bogi[0]="Why don't we wait for our flight in the frequent fly lounge.";
		bogi[1]="At the service desk near Gate 14.";
		bogi[2]="Thanks for buying my ticket.";
		bogi[3]="But we suppose to aboard shortly.";
		Part2 p12  = new Part2(12,"Mark your answer on your answer sheet.",bogi,"C");
		System.out.println(p12); 
		
		bogi[0]="The plants of my office must be watered while I'm away.";
		bogi[1]="Okay, I'll take care of that.";
		bogi[2]="Let's find the better way to get there.";
		bogi[3]="The flowers will effloresce soon.";
		Part2 p13  = new Part2(13,"Mark your answer on your answer sheet.",bogi,"A");
		System.out.println(p13);
		
		bogi[0]="Pamyla picked up Mr.Glaston from the transtation, didn't She?";
		bogi[1]="Yes, pick out which ever one you like.";
		bogi[2]="Train 122.";
		bogi[3]="Maybe the receptionist knows.";
		Part2 p14  = new Part2(14,"Mark your answer on your answer sheet.",bogi,"C");
		System.out.println(p14);
		
		bogi[0]="Aren't there additional decorations in some of those boxes?";
		bogi[1]="I think that all empty.";
		bogi[2]="No, don't order extra meals.";
		bogi[3]="Some of those are megazines.";
		Part2 p15  = new Part2(15,"Mark your answer on your answer sheet.",bogi,"A");
		System.out.println(p15);
		
		bogi[0]="Does the supervisor plan to extend our deadline?";
		bogi[1]="Thanks the planning the party.";
		bogi[2]="She hasn't informed to anyone about that.";
		bogi[3]="Mr.Pork is the manager.";
		Part2 p16  = new Part2(16,"Mark your answer on your answer sheet.",bogi,"B");
		System.out.println(p16);
		
		bogi[0]="Who is reponsible for updating the computers?";
		bogi[1]="Most of the survey responses.";
		bogi[2]="Becuase they're up to date.";
		bogi[3]="John and Nick will be doing it.";
		Part2 p17  = new Part2(17,"Mark your answer on your answer sheet.",bogi,"C");
		System.out.println(p17);
		
		bogi[0]="Who is reponsible for updating the computers?";
		bogi[1]="Most of the survey responses.";
		bogi[2]="Becuase they're up to date.";
		bogi[3]="John and Nick will be doing it.";
		Part2 p18  = new Part2(18,"Mark your answer on your answer sheet.",bogi,"C");
		System.out.println(p18);
		
		
		
	}
}
