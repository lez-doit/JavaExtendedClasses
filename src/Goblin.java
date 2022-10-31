public class Goblin extends Enemy{ //Goblin can attack enemy twice
    public Goblin(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage, Hero hero) {
        System.out.println("Goblin takes " + damage + " damage");
        setHealth(getHealth() - damage);
        if (!isAlive())
            System.out.println("Goblin has died!");
        if(getRandom().nextBoolean()) {
            System.out.println("Goblin fights back!");
            hero.takeDamage(2, this);
            if(getRandom().nextBoolean()) {
                System.out.println("Goblin rages and attacks one more time!");
                hero.takeDamage(2, this);
            }
        }
    }
}
