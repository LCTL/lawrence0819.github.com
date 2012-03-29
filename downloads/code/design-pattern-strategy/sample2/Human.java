
public class Human extends Character {

	public Human(String name) {
		super(name, 100, 100);
	}

    @Override
    public void attack() {
        System.out.println("Sword attack");
    }

}
