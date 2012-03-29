public abstract class Character {

	private String name;
	private int hp;
	private int mp;
	
	public Character(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public abstract void attack();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

}
