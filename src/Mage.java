public class Mage extends Hero{ // Mage is able to add random number to his damage


    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (!isAlive()){
            System.out.println("Mage " + getName() + " is dead and cant attack!");
        }
        else{
            if(enemy.isAlive()){
                if (getRandom().nextBoolean()) {
                    System.out.println(getName() +  " is attacking enemy with additional damage!");
                    enemy.takeDamage(5 + getRandom().nextInt(6), this);
                }
                else {
                    System.out.println("Mage is attacking enemy!");
                    enemy.takeDamage(5, this);
                }
            }
            else {
                System.out.println("Enemy is already dead!");
            }
        }
    }
}