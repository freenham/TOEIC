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
		script = "M : Laura, my roommates and I are inviting our friends and coworkers to"
				+ " our house for a barbeque this Saturday. It'd be great if you could "
				+ " join us."
				+ "\n W : I have nothing planned that day. So why not? Would it be okay "
				+ "to bring my sister along as well? She's visiting from out of town for"
				+ " the weekend."
				+ "\n M : Absolutely, by the way we're asking that guests share some food "
				+ "with the group. I suggest you bring a pasta salad since"
				+ " the one you brought to the company potluck last year was so great.";
		Part3 p37  = new Part3(37,"What does the man recommend?",script,bogi,"B");
		System.out.println(p37);
		
		bogi[0]="A copy editor";
		bogi[1]="A personal assistant";
		bogi[2]="A film director";
		bogi[3]="An organication head";
		Part3 p38  = new Part3(38,"Who is the man?",script,bogi,"B");
		System.out.println(p38);
		
		bogi[0]="He needs to revise an article.";
		bogi[1]="He will chat with benefactors.";
		bogi[2]="He has to attend a press conference.";
		bogi[3]="He is leaving on a business trip.";
		Part3 p39  = new Part3(39,"Why is the man unavailable?",script,bogi,"B");
		System.out.println(p39);
		
		bogi[0]="This afternoon";
		bogi[1]="This evening";
		bogi[2]="Tomorrow morning";
		bogi[3]="Tomorrow afternoon";
		script = "W : Mr.Abdul. This is Amari Nadia. A staff writer for Current Affairs Magazine. I'm working on a article"
				+ " and I'd like to interview you for the piece. Would you be willing to answer a few questions about organization "
				+ "you direct, Mediterranean Aid?"
				+ "\n M : Certainly. But right now is not a good time for me. I'm about to hold a conference with some donors."
				+ " I should be available to contact you tomorrow if that would work."
				+ "\n W : I'll be attending appointment throughout the morning. But I should be back at my office 1:30pm. Why don't I call you back then?"
				+ "\n M : Yes,that would be convenient for me.";
		Part3 p40  = new Part3(40,"When will the woman most likely contact the man?",script,bogi,"B");
		System.out.println(p40);
		 
		bogi[0]="At a car dealership";
		bogi[1]="At a distrivution warehouse";
		bogi[2]="At an auto mechanic shop";
		bogi[3]="At a computer repair business";
		Part3 p41  = new Part3(41,"Where do the speakers most likely work?",script,bogi,"B");
		System.out.println(p41);
		
		bogi[0]="Diagnosing an issue";
		bogi[1]="Finalizing a sale";
		bogi[2]="Replacing a vehicle tire";
		bogi[3]="Coordinating with a supplier";
		Part3 p42  = new Part3(42,"What is the man currently working on?",script,bogi,"B");
		System.out.println(p42);
		
		bogi[0]="Test drive a motorcycle";
		bogi[1]="Place an order for parts";
		bogi[2]="Print out a purchase invoice";
		bogi[3]="Clean some machinery";
		script = "W : Have you been able to figure out what's wrong with the motorcycle that was dropped off at our garage earlier today?"
				+ "\n M : I'm still trying to determine their problem. The motorcycle won't start so there might be weak connection to the battery."
				+ "\n W : Do you think you'll finish your inspection within the next 30 minutes? I need to know any parts have to be purcahsed for the repairs. If so, I'd like to order them from our supplier before we close for the day."
				+ "\n M : That shouldn't be an issue. I'll inform you of which components I'll need by 4:30 pm.";
		Part3 p43  = new Part3(43,"What will the woman most likely do later today?",script,bogi,"B");
		System.out.println(p43);

		bogi[0]="A leather wallet";
		bogi[1]="A restaurant menu";
		bogi[2]="A piece of jewelry";
		bogi[3]="Some eyewear";
		Part3 p44  = new Part3(44,"What did the man find?",script,bogi,"B");
		System.out.println(p44);
		
		bogi[0]="When belongings will be reclaimed";
		bogi[1]="Why diners left a cafe";
		bogi[2]="Whether an item belongs to the woman";
		bogi[3]="What customers asked for";
		Part3 p45  = new Part3(45,"What does the man inquire about?",script,bogi,"B");
		System.out.println(p45);
		
		bogi[0]="They ate at the establishment earlier in the day.";
		bogi[1]="They have already made reservations.";
		bogi[2]="They provided some contact information.";
		bogi[3]="They requested to be seated at a specific table.";
		script = "M : Pardon me. I discover this pair of glaseses underneath the table you were just sitting at inside the restaurant. Are they by chance yours or someone from your party's?"
				+ "\n W : Thay're definetly not mine. I use contact lenses. And to my knowledge, the people who I ate lunch with don't have glasses. They could belong to whoever dined at the table before us."
				+ "\n M : Hmm. That's certanly possible. I served a couple of businessman there prior to seating your group. One of them had glasses on when he arrived, So perhaps they're his.";
		Part3 p46  = new Part3(46,"What does the man suggest about the businessman?",script,bogi,"B");
		System.out.println(p46);
		
		bogi[0]="To find out if the man can lead a club meeting";
		bogi[1]="To determine if the man wants to join a group";
		bogi[2]="To inquire about the time of a session";
		bogi[3]="To provide information about a phtographer";
		Part3 p47  = new Part3(47,"What is the purpose of the call?",script,bogi,"B");
		System.out.println(p47);
		
		bogi[0]="Using a professional service";
		bogi[1]="Expediting(신속히 처리하다) a shipment";
		bogi[2]="Upgrade a lens";
		bogi[3]="Joinging a club";
		Part3 p48  = new Part3(48,"According to the woamn, what costs a fee?",script,bogi,"B");
		System.out.println(p48);
		
		bogi[0]="A manual for a digital camera";
		bogi[1]="A schedule of future activities";
		bogi[2]="A registration fomr for an organization";
		bogi[3]="A piece of phtography equuipment";
		script = "W : Clint, it's Marget Faulkner. I hope you're doing well. I'm calling in regards to the photograph club the we discussed last week. Are you still interested in becoming a member?"
				+ "\n M : That depends on when club members get together. My weekday scheldule is usally quite busy with work and fmailly obligations. However, I'm typically available on Saturday and Sunday."
				+ "\n W : Meetings on photo sessions are held every other sunday evening. Plus, attendance is never mandatory. So you're welcome to come only when you have enough time. However, you should know that we have a one-time joining fee of 25 dallars."
				+ "\n M : In that case, I'd like to participate. It'd be great to have more oppurtunities to use the lens I was recently gited.";
		Part3 p49  = new Part3(49,"What did the man recently receive?",script,bogi,"B");
		System.out.println(p49);

		bogi[0]="A contractor has not shown up";
		bogi[1]="A request cannot be met";
		bogi[2]="An aapliance has been damaged";
		bogi[3]="A renoation project was canceled";
		Part3 p50  = new Part3(50,"What is the problem?",script,bogi,"B");
		System.out.println(p50);
		
		bogi[0]="It has to be specially ordered";
		bogi[1]="It is improperly sized";
		bogi[2]="It has gotten poor reviews.";
		bogi[3]="It has to be professionally installed.";
		Part3 p51  = new Part3(51,"What is mentioned about the E35 dishwasher?",script,bogi,"B");
		System.out.println(p51);
		
		bogi[0]="Paying for a service";
		bogi[1]="Getting a product discount";
		bogi[2]="Changing a kitchen layout";
		bogi[3]="Considering another item";
		script = "M : Okay, miss Pickett. I've looked over your kitchen."
				+ "\n W : Do you have clearer idea about what renovations are possible?"
				+ "\n M : Yes, I can make most of the requested updeates, with a few exceptions."
				+ "\n W : Which ones won't be possible?"
				+ "\n M : Well. The E35 dishwasher that you want installed next to the sink isn't going to fit."
				+ "\n W : Oh, are you sure? I really like that particular device."
				+ "\n M : I'm afraid so. It's too tall to fit under the counter. You'll have to find the slightly smaller one."
				+ "\n W : I see. Do you have any recommendations?"
				+ "\n M : The ST300 from Vincent Appliances is a nice option. You should look into it.";
		Part3 p52  = new Part3(52,"What does the man recommed?",script,bogi,"B");
		System.out.println(p52);
		
		
		
	}
}
