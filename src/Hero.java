import java.util.Random;

public abstract class Hero implements Mortal{
    private String name;
    private int health;
    private Random random = new Random();

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public Random getRandom() {
        return random;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        if(getHealth() > 0)
            return true;
        return false;
    }

    public void takeDamage (int damage, Enemy enemy) {
        System.out.println(getName() + " takes " + damage + " damage");
        setHealth(getHealth() - damage);
        if (!isAlive())
            System.out.println(getName() + " has died!");
    }

    public abstract void attackEnemy(Enemy enemy);
}
