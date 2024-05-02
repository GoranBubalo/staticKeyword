
public class Main {

	public static void main(String[] args) {
		
		// Static = modifier. A single copy of a variable/method is created and shared 
		//			the class "owns" the static number
		//			directly related to a class = > it belongs to the class.
		
		Friend friend1 = new Friend("Ivan");
		Friend friend2 = new Friend("Marko");
		Friend friend3= new Friend("Jure");
		
		
		System.out.println(Friend.numberOFFriends);
		
		Friend.displayFriends();

	}

}
