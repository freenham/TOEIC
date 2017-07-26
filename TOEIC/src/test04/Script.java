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
				+ "(B) It is factory machinery.\n"
				+ "(C) They will install it for free.\n";
		script[15] = "Q. Don't you find live concerts exicting?\n"
				+ "(A) No, I don't mind.\n"
				+ "(B) Certainly, I love watching them.\n"
				+ "(C) Many people herad them.\n";
		script[16] = "Q. Ms.Parker is attending the seminar, isn't she?\n"
				+ "(A) I thought it was very interesting.\n"
				+ "(B) I will be attending a meeting next week.\n"
				+ "(C) No, she decided to skip it.\n";
		script[17] = "Q. Are you going to hand in the proposal tomorrow or is that too soon?\n"
				+ "(A) He gave me the papers yesterday.\n"
				+ "(B) I'm still working on it.\n"
				+ "(C) He proposed it last month.\n";
		script[18] = "Q. Now is not a good time to purchase a home.\n"
				+ "(A) I don't know the time sorry.\n"
				+ "(B) Will it be better in the fall?\n"
				+ "(C) Do I need a receipt?\n";
		script[19] = "Q. Where do we keep ink cartridges for the printer?\n"
				+ "(A) It is being repaired.\n"
				+ "(B) Ask Mr.Filp for some.\n"
				+ "(C) About four cartons(작은상자).\n";
		script[20] = "Q. The supermarket doesn't close early on the weekends, does it?\n"
				+ "(A) No it stays open until midnight.\n"
				+ "(B) It was sent at 10'o clock.\n"
				+ "(C) They had some exellent sales.\n";
		script[21] = "Q. Ms.Jacobs, would you like to present a paper during the convention?\n"
				+ "(A) No, it was a present.\n"
				+ "(B) Let me check my schedule first.\n"
				+ "(C) It's about our product.\n";
		script[22] = "Q. Do you know where I could catch a taxi around here?\n"
				+ "(A) 12$ to anywhere around city.\n"
				+ "(B) There's stand across the street.\n"
				+ "(C) I don't like paying taxes.\n";
		script[23] = "Q. Didn't we extend the deadline until Friday?\n"
				+ "(A) We're expandind the company.\n"
				+ "(B) No it's Thursday.\n"
				+ "(C) We'd better set a deadline.\n";
		script[24] = "Q. What should I do with the president's notice?\n"
				+ "(A) Post it on the bluletin board(전자 게시판).\n"
				+ "(B) Yes, just in the morning.\n"
				+ "(C) He wants to complie his notes.\n";
		script[25] = "Q. Who is conducting the training?\n"
				+ "(A) He took the train.\n"
				+ "(B) It hasn't been decided yet.\n"
				+ "(C) He's a good conductor.\n";
		script[26] = "Q. Are these devices on display at the trade show?\n"
				+ "(A) It was a amazing show.\n"
				+ "(B) I'll devise(창안하다) a plan for you.\n"
				+ "(C) Yes, they're at our booth.\n";
		script[27] = "Q. How's the book review going?\n"
				+ "(A) That's my favorite author.\n"
				+ "(B) Pretty well so far.\n"
				+ "(C) We're watching it.\n";
		script[28] = "Q. Can you give an orientation to the new employees on Wendsday? \n"
				+ "(A) No, I was busy yesterday.\n"
				+ "(B) Sure I'm free to do it then.\n"
				+ "(C) In the old office building.\n";
		script[29] = "Q. Why don't we talk about the budget later? \n"
				+ "(A) We came early.\n"
				+ "(B) Okay let's meet after lunch.\n"
				+ "(C) I'll walk you to your destination.\n";
		script[30] = "Q. I think I might exercise during lunch break.\n"
				+ "(A) In about two hours.\n"
				+ "(B) I'd exercise some caution.\n"
				+ "(C) Will you have enough time?.\n";
		script[31] = "Q. Why did Mr.Lopez move to another department.\n"
				+ "(A) Head to the department store please.\n"
				+ "(B) He was promoted.\n"
				+ "(C) I went to the overseas division.\n";
		script[32] = "Clarissa, are you attending the international convention for Physicians in Austrailia this March?"
				+ "\n Actually not only am i going but I'll also be presenting the study that I published in a medical journal six weeks ago."
				+ "\n Really? That's great. All of lectures planned for the convention seem fascinating."
				+ "\n I really want to go but the hospital director gave me a project that needs to be finished soon.";
		script[35] = "Glandar, have you finished compiling the results about customer service?"
				+ "\n I finished doing most of them. But I stil need to add the results from my origin office."
				+ "\n I can give you what I have done if you like."
				+ "\n Okay, but I need to go through all the information before meeting the CEO tomorrow morning."
				+ "\n Do you think you'll have rest completed by this afternoon"
				+ "\n My assistance is out today. So I'm doing all the work my self. I don't think it will be ready by then."
				+ "\n But I probably have everything done by 7'o clock and I can send the result to your email.";
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < 100; i++) {
			if (script[i] != "") {
				s += i+"번\n"+script[i] + "\n";
			}

		}
		return s;
	}

	public static void main(String[] args) {
		Script s = new Script();
		System.out.println(s);
	}

}
