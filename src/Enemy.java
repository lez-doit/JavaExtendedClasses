public class Enemy {
    public int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage (int damage) {
        setHealth(getHealth() - damage);
    }
}
