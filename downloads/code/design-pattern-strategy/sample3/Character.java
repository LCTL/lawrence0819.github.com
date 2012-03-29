public abstract class Character {

	private String name;
	private int hp;
	private int mp;
	
	private AttackBehavior attackBehavior;
	
	public Character(String name, int hp, int mp, AttackBehavior attackBehavior){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		
		this.attackBehavior = attackBehavior;
	}

	public void attack(){
	    attackBehavior.attack();
	}

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

    public AttackBehavior getAttackBehavior() {
        return attackBehavior;
    }

    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

}
