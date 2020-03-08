package l07;

public class Mage extends Hero {

    public Mage (String name , int damage, int health) {
        super ( name , damage , health);
    }

    @Override
    public int attackEnemy (Enemy enemy) {
        System.out.println ("The mage " + name + " attacks the enemy!" );
        return enemy.takeDamage ( getDamage ());
    }

}
