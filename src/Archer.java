public class Archer extends Hero{//Archer always increases his damage when enemy fights back
    private  int additionalDamage = 0;
    public Archer(String name, int health) {
        super(name, health);
    }

    public int getAdditionalDamage() {
        return additionalDamage;
    }

    public void addDamage() {
        additionalDamage++;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (!isAlive()){
            System.out.println("Archer " + getName() + " is dead and cant attack!");
        }
        else{
            if(enemy.isAlive()){
                System.out.println("Archer is attacking enemy!");
                enemy.takeDamage(2 + getAdditionalDamage(), this);
            }
            else {
                System.out.println("Enemy is already dead!");
            }
        }
    }

    @Override
    public void takeDamage(int damage, Enemy enemy) {
        super.takeDamage(damage, enemy);
        System.out.println(getName() +" increases his damage(+1)");
        addDamage();
    }
}