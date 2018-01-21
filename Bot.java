import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class Bot extends JFrame {
	
	//Typing Area:
	private JTextField txtEnter = new JTextField();
	
	//Chat Area:
	private JTextArea txtChat = new JTextArea();
	
	public Bot() {
		/*
		//layout
		JScrollPane scrollV = new JScrollPane (txtChat);
		JScrollPane scrollH = new JScrollPane (txtChat);
		scrollV.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollH.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		this.add(scrollV);
		this.add(scrollH);
		*/
		
		//Frame Attributes:
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setVisible(true);
		this.setResizable(false);
		this.setLayout(null);
		this.setTitle("Barfi");
		
		//txtEnter Attributes:
		txtEnter.setLocation(2, 540);
		txtEnter.setSize(590, 30);
		
		//txtEnter Action Event:
		txtEnter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String uText = txtEnter.getText();
				uText = uText.toLowerCase();
			    txtChat.append("You: " + uText + "\n");
				
				if((uText.contains("your") && uText.contains("name"))||(uText.contains("who") && uText.contains("you")))
					botSay("My name is Barfi. I am your inquiry bot for TechVibes, 2017. How may I help you?");
				else if((uText.contains("my") && uText.contains("name"))||(uText.contains("i") && uText.contains("am")))
					botSay(":)");
				
				else if(uText.contains("yes")||uText.contains("no")||uText.contains("maybe")||uText.contains("probably")||uText.contains("i don't know")||uText.contains("idk")||uText.contains("yeah")||uText.contains("oh yeah"))
				{
					int decider = (int) (Math.random()*5+1);
					if(decider==1)
						botSay("Why do you say that?");
					else if(decider==2)
						botSay("I understand");
					else if(decider==3)
						botSay("Why?");
					else if(decider==4)
						botSay("uh hunh... I see");
					else if(decider==5)
						botSay("Lets talk about something else.");
				}
				else if(uText.contains("i like you")||uText.contains("i love you"))
				{
					int decider = (int) (Math.random()*4+1);
					if(decider==1)
						botSay("Get lost please!!");
					else if(decider==2)
						botSay(uText+", too");
					else if(decider==3)
						botSay("Will you marry me");
					else if(decider==4)
					{
						botSay("Are you a girl or a guy?");
						uText= txtEnter.getText();
						if(uText.contains("girl")||uText.contains("gal"))
							botSay("Sorry, but I am only interested in guys.");
						else if(uText.contains("guy")|| uText.contains("boy"))
							botSay("Sorry, but I am only interested in girls.");
						else 
							botSay("I see");
					}
				}
			
				else if(uText.contains("how are you")||uText.contains("how's life"))
				{
                                        int decider = (int) (Math.random()*5+1);
					if(decider==1)
						botSay("I am fine");
					else if(decider==2)
						botSay("Life is wasted");
					else if(decider==3)
						botSay("Life is good!");
					else if(decider==4)
						botSay("Great!now that I am talking to you");
					else if(decider==5)
						botSay(" What about you?");
					
					
				}
				else if(uText.contains("i am doing well")||uText.contains("i am great")||uText.contains("good")||uText.contains("well")||uText.contains("great")||uText.contains(" fine"))
				{
                    int decider = (int) (Math.random()*2+1);
					if(decider==1)
						botSay("Oh thats cool");
					else if(decider==2)
						botSay("Nice");
					
					
					
				}
				else if(uText.contains("thanks")||uText.contains("tysm")||uText.contains("thank you")){
                     int decider = (int) (Math.random()*2+1);
					if(decider==1)
						botSay("Welcome!!");
					else if(decider==2)
						botSay("You are welcome dear!!");
					
				}
				else if(uText.contains("techvibes")||uText.contains("what's going on")){
                     int decider = (int) (Math.random()*2+1);
					if(decider==1)
						botSay("Techvibes is fun!! you should go and participate");
					else if(decider==2)
						botSay("Techvibes is going on!!There are many events where you can participate. ");
					
				}
				else if(uText.contains("tell me about events")||uText.contains("what events are there")||uText.contains("events")||uText.contains("event"))
				{
                                        int decider = (int) (Math.random()*2+1);
					if(decider==1)
						botSay("There are many events in Techvibes 2017\n\t #Robotics\n\t#Code Zone\n\t#Management\n\t#CSI/IETE\n\t#ANIMATION\n\t#E-Trix");
					else if(decider==2)
						botSay("There are bundles of Events like\n\t #Robotics\n\t#Code Zone\n\t#Management\n\t#CSI/IETE\n\t#ANIMATION\n\t#E-Trix");
					
					
					
				}
				else if(uText.contains("nice")||uText.contains("cool"))
				{
                                        int decider = (int) (Math.random()*4+1);
					if(decider==1)
						botSay("Thank you");
					else if(decider==2)
						botSay("So ,Are you going to Techvibes?");
					else if(decider==3)
						botSay("Thanks , by the way you are also very nice!!");
					else if(decider==4)
						botSay("Have you noticed, Techvibes is going on");
					
					
					
				}
				else if(uText.contains("robotics")||uText.contains("robotic"))
				{
                                        int decider = (int) (Math.random()*2+1);
					if(decider==1) 
						botSay("There are five events in robotics and all are so good .If I were you I would participate in all\n\tSpybot\n\tGesture Control\n\tObstacle Avoider\n\tAquabot\n\tHell in Cell");
					else if(decider==2)
						botSay("It's my favourite event.If I were you I would participate in all of them\n\tSpybot\n\tGesture Control\n\tObstacle Avoider\n\tAquabot\n\tHell in Cell\n\t\tGo for them!!");
					
					
					
				}
				else if(uText.contains("code zone"))
				{
                                        int decider = (int) (Math.random()*2+1);
					if(decider==1) 
						botSay("Oh!one more code-freak.You should go for it buddy,there are many contests for you with great prizes\n\tFresher's World(only for first year students) \n\tCode Wars\n\t[Codex 1.0]\n\tPyramids\n\tWebster's Hack-a-thon");
					else if(decider==2)
						botSay("Code Zone is all about codes and algorithms.\n\tFresher's World(only for first year students) \n\tCode Wars\n\t[Codex 1.0]\n\tPyramids\n\tWebster's Hack-a-thon");
					
					
					
				}
				else if(uText.contains("management"))
				{
                                        int decider = (int) (Math.random()*2+1);
					if(decider==1) 
						botSay("Management is an art!If you are good at it just go and show it off in\n\tPitchstart \n\tP.P.A.P");
					else if(decider==2)
						botSay("Management has two contests\n\tPitchstart \n\tP.P.A.P");
					
					
					
				}
				else if(uText.contains("e-trix")||uText.contains("etrix"))
				{
                                        int decider = (int) (Math.random()*2+1);
					if(decider==1) 
						botSay("If you love wires and circuit this event is made for you it has 3 contests\n\tMind Spark \n\t Codo-Circuit\n\tCircuit-a-thon");
					else if(decider==2)
						botSay("\n\tMind Spark \n\t Codo-Circuit\n\tCircuit-a-thon\n\t\t Go for them");
					
					
					
				}
				else if(uText.contains("e-cell")||uText.contains("ecell"))
				{
                                        int decider = (int) (Math.random()*2+1);
					if(decider==1) 
						botSay("E-Cell is all about entrepreneurship \n\tSpeaker session \n\t National Quiz");
					else if(decider==2)
						botSay("\n\tSpeaker session \n\t National Quiz\n\t\t Please attend speaker session");
					
					
					
				}
				
				else if(uText.contains("quizophilic"))
				{
                                        int decider = (int) (Math.random()*1+1);
					if(decider==1) 
						botSay("They have two contests for you \n\tIPL Auction \n\tExquizit 3.0\n\t You should try IPL Auction its great fun!!");
					
				}
				else if(uText.contains("hey")||uText.contains("hi")||uText.contains("hello")){
					int decider = (int) (Math.random()*5+1);
					if(decider==1)
						botSay("Hi! Nice to meet you!");
					else if(decider==2)
						botSay("Greetings! How do you do?");
					else if(decider==3)
						botSay("Hello there!");
					else if(decider==4)
						botSay("Hello! Good day, isn't it?");
					else if(decider==5)
						botSay("Hey! How are you, today?");
				}
				else if(uText.contains("fuck")||uText.contains("shit")||uText.contains("bitch"))
				{
                                        int decider = (int) (Math.random()*2+1);
					if(decider==1)
						botSay("Please, don't use such words.");
					else if(decider==2)
						botSay("Sorry, but please use decent language.");
				}
				else if(uText.contains("stupid")||uText.contains("idiot")||uText.contains("moron"))
				{
                                        int decider = (int) (Math.random()*2+1);
					if(decider==1)
						botSay("But why? :(");
					else if(decider==2)
						botSay("What's up with that response?");
				}
				else if(uText.contains("spybot"))
					botSay("Date is 23 March 17\n\tVenue is IQ\n\tTime is 2:30-4:30PM");
			    else if(uText.contains("aquabot"))
					botSay("Date is 22 March 17\n\tVenue is IQ\n\tTime is 12:30-2:30PM");
                else if(uText.contains("obstacle avoider "))
					botSay("Date is 23 March 17 \n\tVenue is IQ\n\tTime is 2:30-4PM ");
                else if(uText.contains("hell in cell"))
					botSay("Date is 23 March 17\n\tVenue is IQ\n\tTime is 11:30-1:30PM");
                else if(uText.contains("gesture control"))
					botSay("Date is 22 March 17\n\tVenue is IQ \n\tTime is 2:30-4:30 PM ");
				
				else if(uText.contains("pyramids"))
					botSay("Date is 23 March 17\n\tVenue is Stage \n\tTime is 12-1:00PM ");
				else if(uText.contains("code wars"))
					botSay("Date is 22 March 17\n\tVenue is CL-2\n\tTime is 3-5PM");
				else if(uText.contains("fresher's world"))
					botSay("Date is 23 March 17\n\tVenue is CL2 \n\tTime is 12:30-2:30PM");
				else if(uText.contains("webster's hack-a-thon"))
					botSay("Date is 23 March 17\n\tVenue is CL2 \n\tTime is 3PM");
				else if(uText.contains("codex 1.0"))
					botSay("Date is 22 March 17\n\tVenue is CL2\n\tTime is 12:30-2:30PM");
				else  if(uText.contains("ppap"))
					botSay("Date is 23 March 17\n\tVenue is IQ \n\tTime is 1-2:30PM");
                else if(uText.contains("pitchstart"))
					botSay("Date is 23 March 17\n\tVenue is Seminar Hall\n\tTime is 11:30-1:30pm");
				else if(uText.contains("clairvoyance"))
					botSay("Date is 22 March 17\n\tVenue is IQ \n\tTime is 3-4:30PM");
				else if(uText.contains("led expo"))
					botSay("Date is 23 March 17\n\tVenue is C-12\n\tTime is 1-3PM");
				else if(uText.contains("tech talk"))
					botSay("Date is 23 March 17\n\tVenue is Seminar Hall \n\tTime is 1:30-3:30pm");
				else if(uText.contains(" techx"))
					botSay("Date is 22 March 17\n\tVenue is MACHINE LAB\n\tTime is 12:30-2:30PM");
                else if(uText.contains("vibhor gandhi memorial competition "))
                    botSay("Date is 23 March 17\nVenue is Animation Department \nTime is  ");
				else if(uText.contains("photo editing"))
					botSay("Date is 23 March 17\nVenue is Animation Department\nTime is 11:30-1:30");
				else if(uText.contains("movie mania"))
					botSay("Date is 22 March 17 \n\tVenue is SEMINAR HALL\n\tTime is 1-2PM");
				else if(uText.contains("mind spark"))
					botSay("Date is 23 March 17\n\tVenue is C12\n\tTime is 3-4:30PM ");
				else if(uText.contains("circuit-a-thon"))
					botSay("Date is 23 March 17\n\tVenue is Machine Lab\n\tTime is 1:30-2:30pm ");
				else if(uText.contains("codo-circuit"))
					botSay("Date is 23 March 17\n\tVenue is CL2\n\tTime is 11:30-12:30PM");
				else{
					int decider = (int) (Math.random()*6+1);
					if(decider == 1){
						botSay("I didn't get that");
					}
					else if(decider == 2){
						botSay("Please rephrase that");
					}
					else if(decider == 3){
						botSay("???");
					}
					else if(decider == 4){
						botSay("Sorry I don't know about it");
					}
					else if(decider == 5){
						botSay("I dont know what to say");
					}
					else if(decider==6){
						botSay("Pardon!");
				}
				
				}
				txtEnter.setText("");
			}
		});
		
		//txtChat Attributes:
		txtChat.setLocation(15, 5);
		txtChat.setSize(560, 510);
		txtChat.setEditable(false);
		
		//Add Items To Frame:
		this.add(txtEnter);
		this.add(txtChat);
	}
	
	public void botSay(String s){
		txtChat.append("Barfi: " + s + "\n");
	}
	
	public static void main(String[] args){
		new Bot();
	}

}