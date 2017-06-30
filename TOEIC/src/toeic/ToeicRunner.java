package toeic;

public class ToeicRunner {
	public static void main (String[] args) {
		
		Part1[] p=new Part1[6];
		String[] bogi=new String[4];
		String script="";
		
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
		
		bogi[0]="Some people from the workshop requested my business card.";
		bogi[1]="The first session is a for small business owners.";
		bogi[2]="Did you hand any out?";
		bogi[3]="The seminar instructor came up bit late.";
		Part2 p18  = new Part2(18,"Mark your answer on your answer sheet.",bogi,"B");
		System.out.println(p18);
		
		bogi[0]="What was the memorial pot of the trip?";
		bogi[1]="Oh, for pot of the trip.";
		bogi[2]="Hiking throught the jungle.";
		bogi[3]="I'll be traveling to egypt.";
		Part2 p19  = new Part2(19,"Mark your answer on your answer sheet.",bogi,"B");
		System.out.println(p19);
		
		bogi[0]="Our supplier was accidently underpaid.";
		bogi[1]="Hmm, that's unusal.";
		bogi[2]="I can unload the supplies.";
		bogi[3]="Another minor pay raise.";
		Part2 p20  = new Part2(20,"Mark your answer on your answer sheet.",bogi,"A");
		System.out.println(p20);
		
		bogi[0]="When did you last take out the recycling bins.";
		bogi[1]="Just this morning.";
		bogi[2]="Only bottles and cans.";
		bogi[3]="Once in a while.";
		Part2 p21  = new Part2(21,"Mark your answer on your answer sheet.",bogi,"A");
		System.out.println(p21);
		
		bogi[0]="Why do you want to refund for the product?";
		bogi[1]="There are enough funs.";
		bogi[2]="The television is scratched.";
		bogi[3]="Production levels have reason.";
		Part2 p22  = new Part2(22,"Mark your answer on your answer sheet.",bogi,"B");
		System.out.println(p22);
		
		bogi[0]="Bicycles can be rented through the hotel,can't they?";
		bogi[1]="You'll be staying in Room 341";
		bogi[2]="We'll go cycling there the summer.";
		bogi[3]="The front desk work a kind of assist with that.";
		Part2 p23  = new Part2(23,"Mark your answer on your answer sheet.",bogi,"C");
		System.out.println(p23);
		
		bogi[0]="How long will you be on tour to promote your novel?";
		bogi[1]="At least until July.";
		bogi[2]="For a promotional campaign.";
		bogi[3]="The author is extremly popular.";
		Part2 p24  = new Part2(24,"Mark your answer on your answer sheet.",bogi,"A");
		System.out.println(p24);
		
		bogi[0]="Can you mow the lawn before you leave or are you in a hurry?";
		bogi[1]="Yes, we sell lawn mowers.";
		bogi[2]="Will it take more half an hour?";
		bogi[3]="Don't worry I'll leave them on the table.";
		Part2 p25  = new Part2(25,"Mark your answer on your answer sheet.",bogi,"B");
		System.out.println(p25);
		
		bogi[0]="Isn't the accountant suppose to get in touch with you this afternoon?";
		bogi[1]="She already contacted me.";
		bogi[2]="No, both of the accounts.";
		bogi[3]="My shift ends at 3 pm.";
		Part2 p26  = new Part2(26,"Mark your answer on your answer sheet.",bogi,"A");
		System.out.println(p26);
		
		bogi[0]="Where is the entrance to the complex's garage?";
		bogi[1]="The space is heated during the winter.";
		bogi[2]="A parking spot might be open.";
		bogi[3]="I'm afraid I'm new to the building.";
		Part2 p27  = new Part2(27,"Mark your answer on your answer sheet.",bogi,"C");
		System.out.println(p27);
		
		bogi[0]="Do you know who is going to proofread the manuscript?";
		bogi[1]="No, you didn't need to print any.";
		bogi[2]="Sure, the deadline can be extended.";
		bogi[3]="Kenneth typically edits our documents.";
		Part2 p28  = new Part2(28,"Mark your answer on your answer sheet.",bogi,"C");
		System.out.println(p28);
		
		bogi[0]="Please bring these binders to Ms.Liu in human resources.";
		bogi[1]="We still sold out of binders.";
		bogi[2]="When does she need them by?";
		bogi[3]="I brought an appetizer to share.";
		Part2 p29  = new Part2(29,"Mark your answer on your answer sheet.",bogi,"B");
		System.out.println(p29);
		
		bogi[0]="Should we order two couches for the lobby or will one do.";
		bogi[1]="A sofa and the chair would be best.";
		bogi[2]="Okay, I can wait in the lobby.";
		bogi[3]="Our funiture desinger has it.";
		Part2 p30  = new Part2(30,"Mark your answer on your answer sheet.",bogi,"A");
		System.out.println(p30);
		
		bogi[0]="Which of the store's displays has to be taken down.";
		bogi[1]="Business is a bit slow right now.";
		bogi[2]="Here, let me show you.";
		bogi[3]="They'll put on a show a bit later.";
		Part2 p31  = new Part2(31,"Mark your answer on your answer sheet.",bogi,"B");
		System.out.println(p31);
		
		//Part3 시작
		bogi[0]="Hold an annual meeting";
		bogi[1]="Offer seasonal cards";
		bogi[2]="Expand a department";
		bogi[3]="Promote a clothing collection";
		Part3 p32  = new Part3(32,"What does the company plan to do?",script,bogi,"B");
		System.out.println(p32);
		
		bogi[0]="A garment(옷) deisgn";
		bogi[1]="A recruitment process";
		bogi[2]="The woman's opinion";
		bogi[3]="The woman's schedule";
		Part3 p33  = new Part3(33,"What does the man inquire about?",script,bogi,"B");
		System.out.println(p33);
		
		bogi[0]="Present some drafts";
		bogi[1]="Select team members";
		bogi[2]="Try on some clothing";
		bogi[3]="Print some documents";
		script = "W : Sam, Our company is going to expand its product offerings this fall"
				+ " with a special seasonal collection of greeding cards."
				+ " I'd like you to design them."
				+ "\n M : Okay, do you currently have an opnion about"
				+ " how you'd like cards to look. Or Will I have the final"
				+ " say over their appearance."
				+ "\n W : Aside from wanting them to incorporate the colors of autumn."
				+ " Such as red, orange and yellow. I don't have a preference."
				+ " Please show me your drafts next Friday.";
		Part3 p34  = new Part3(34,"What does the man inquire about?",script,bogi,"B");
		System.out.println(p34);
		
		bogi[0]="A business engagement";
		bogi[1]="A social gathering";
		bogi[2]="A sporting event";
		bogi[3]="A cooking class";
		Part3 p35  = new Part3(35,"What will probalby take place on Saturday?",script,bogi,"B");
		System.out.println(p35);
		
		bogi[0]="She is able to attend an evnet.";
		bogi[1]="She did not expect an invitation.";
		bogi[2]="She wants to invite her sister.";
		bogi[3]="She will check her schedule.";
		Part3 p36  = new Part3(36,"What does the woman mean when she says, \"I have nothing planned\"?",script,bogi,"B");
		System.out.println(p36);
		
		bogi[0]="Prociding a dish";
		bogi[1]="Contacting some cateres";
		bogi[2]="Showing up early";
		bogi[3]="Writing down some directions";
		script = "M : Rora, my roommates and I are inviting our friends and coworkers to"
				+ " our house for a barbeque this Saturday. It will be great if you could "
				+ " join us."
				+ "\nW : I haev nothing planned that day. So why not? Were it be okay "
				+ "to bring my sister along as well? She is visiting from out of town for"
				+ " the weekend."
				+ "\nM : Absolutely, by the way we're asking that guest shares some food "
				+ "with the group. I suggest you bring a pasta salad since"
				+ " the one you brought to the company potlot last year was so great.";
		Part3 p37  = new Part3(37,"What does the man recommend?",script,bogi,"B");
		System.out.println(p37);
		
		
		
		
		
		
	}
}
