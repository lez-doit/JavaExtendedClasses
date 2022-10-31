public class Warrior extends Hero{ //Warrior can block all taken damage and give it back with double power


    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (!isAlive()){
            System.out.println("Warrior " + getName() + " is dead and cant attack!");
        }
        else{
            if(enemy.isAlive()){
                System.out.println("Warrior is attacking enemy!");
                enemy.takeDamage(3, this);
            }
            else {
                System.out.println("Enemy is already dead!");
            }
        }
    }

    @Override
    public void takeDamage(int damage, Enemy enemy) {
        super.takeDamage(damage, enemy);
        if(getRandom().nextBoolean()) {
            System.out.println("Warrior "+ getName() +  " blocks all damage and gives it back " +
                    "with double power!");
            setHealth(getHealth() + damage);
            enemy.takeDamage(damage * 2, this);
        }
    }
}
