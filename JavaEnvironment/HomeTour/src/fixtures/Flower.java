package fixtures;

public class Flower extends Fixture implements Interactable{

	public Flower(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}

	@Override
	public void interact() {
		System.out.println("You pluck the flower. It will wither away without water.");
	}
}
