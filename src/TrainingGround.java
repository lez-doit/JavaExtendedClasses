public class TrainingGround {
    public static void main(String[] args) {
        Hero hero_1 = new Hero("Bob");
        hero_1.attackEnemy();

        Warrior warrior_1 = new Warrior("Jack");
        warrior_1.attackEnemy();
        Archer archer_1 = new Archer("Anna");
        archer_1.attackEnemy();
        Mage mage_1 = new Mage("Winston");
        mage_1.attackEnemy();
    }
}
