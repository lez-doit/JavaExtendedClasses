import java.util.Random;

public class Ogre extends Enemy{ //ogre can cancel all taken damage if he fights back

    public Ogre(int health) {
        super(health);

    }

    @Override
    public void takeDamage(int damage, Hero hero) {
        System.out.println("Ogre takes " + damage + " damage");
        setHealth(getHealth() - damage);
        if (!isAlive())
            System.out.println("Ogre has died!");
        if(getRandom().nextBoolean()) {
            System.out.println("Ogre fights back!");
            hero.takeDamage(2, this);
            if(getRandom().nextBoolean()) {
                System.out.println("Ogre rages and restores all taken damage!");
                setHealth(getHealth() + damage);
            }
        }
    }
}
