package l07;

public class Warrior extends Hero {

    public Warrior(String name , int damage, int health) {
        super ( name , damage , health);
    }

    @Override
    public int attackEnemy(Enemy enemy) {
        System.out.println ( "The warrior " + name + " attacks the enemy!" );
        return enemy.takeDamage ( getDamage ( ) );
    }

}

