package av.borisov;

public class CatImpl implements Cat {
	private boolean isFed = false;
	public void feed() {
		isFed = true;
	}
	public void isHungry() {
		if (isFed) {
			System.out.println("\"I just want to sleep for a bit, OK?\"");
		}
		else {
			System.out.println("\"I'm hungry, bro!\"");
		}
	}
	
}
