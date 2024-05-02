
public class Friend {
	
	String name;
	//static variable 
	static int numberOFFriends;
	Friend(String name) {
		this.name = name;
		numberOFFriends++;
	}
	
	static void displayFriends() {
		System.out.println("You have " + numberOFFriends + " friends");
	}

}
