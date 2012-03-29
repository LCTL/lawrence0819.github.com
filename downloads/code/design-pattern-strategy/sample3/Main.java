
public class Main {

    public static void main(String[] args) {
        Character character1 = new Human("Lawrence", new AxeAttackBehavior());
        Character character2 = new Human("Tony", new SwordAttackBehavior());
        
        character1.attack();
        character2.attack();
        
        character1.setAttackBehavior(new SwordAttackBehavior());
        character1.attack();
    }

}
