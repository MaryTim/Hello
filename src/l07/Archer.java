package l07;

public class Archer extends Hero {

    public Archer (String name , int damage, int health) {
        super ( name , damage , health );
    }

    @Override
    public int attackEnemy (Enemy enemy) {
        System.out.println ("The archer " + name + " attacks the enemy!" );
        return enemy.takeDamage ( getDamage ());
    }
}
