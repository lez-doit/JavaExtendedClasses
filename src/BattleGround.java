public class BattleGround {
    public static void main(String[] args) {;
        Archer Bob = new Archer("Bob", 14);
        Ogre ogre1 = new Ogre(20);
        Goblin goblin1 = new Goblin(14);
        while(Bob.isAlive() && ogre1.isAlive() && goblin1.isAlive()) {
                Bob.attackEnemy(ogre1);
                Bob.attackEnemy(goblin1);
        }
        if (Bob.isAlive())
            System.out.println("Bob has won with " + Bob.getHealth() + " hp left");
        else
            System.out.println("Bob has died in fight with enemies(((");
    }
}
