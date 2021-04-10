package av.borisov;

public class Main {

	public static void main(String[] args) {
		Cat cat = new CatImpl();
		
		System.out.println("You ask the cat if it is hungry.");
		System.out.print("The cat says: ");
		cat.isHungry();
		System.out.println("\nYou feed the cat.\n");
		cat.feed();
		System.out.println("You ask the cat if it is hungry.");
		System.out.print("The cat says: ");
		cat.isHungry();
	}

}
