import java.util.Random;

public class Enemy implements Mortal {
    private int health;

    private Random random = new Random();


    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Random getRandom() {
        return random;
    }

    public void takeDamage (int damage, Hero hero) {
        setHealth(getHealth() - damage);
    }

    @Override
    public boolean isAlive() {
        if(getHealth() > 0)
            return true;
        return false;
    }
}
