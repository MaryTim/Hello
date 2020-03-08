package l07;

public class TrainingGround {

    public static void main(String[] args) {

        Enemy enemy = new Enemy ( 100 , "Thanos", 50);

        Hero warrior = new Warrior ("Antoha", 30 , 100 );
        int warriorDamage = warrior.attackEnemy ( enemy );
        enemy.setHealth ( warriorDamage);
        System.out.println ("Warrior's damage is "+ warrior.damage + "! Enemy's health is " + warriorDamage + " out of 100" );

        Hero mage = new Mage ("Harry Potter", 35, 100);
        int mageDamage = mage.attackEnemy ( enemy );
        enemy.setHealth ( mageDamage );
        System.out.println ("Mage's damage is  "+ mage.damage + "! Enemy's health is " + mageDamage + " out of 100" );

        Hero archer = new Archer ( "Hawkeye", 30 , 100);
        int archerDamage = archer.attackEnemy ( enemy );
        enemy.setHealth ( mageDamage );
        System.out.println ("Archer's damage is  "+ archer.damage + "! Enemy's health is " + archerDamage + " out of 100" );

        int enemysHealth = 100 - warrior.damage - mage.damage - archer.damage;
        System.out.println ("Enemy's health is " + enemysHealth);

        System.out.println (enemy.isAlive());

        }
    }
