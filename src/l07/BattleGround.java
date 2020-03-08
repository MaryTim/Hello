package l07;

public class BattleGround {

    public static void main(String[] args) {
        Hero warrior = new Warrior ( "Antoha" , 35 , 100 );
        Hero mage = new Mage ( "Harry Potter" , 37 , 100 );
        Hero archer = new Archer ( "Hawkeye" , 30 , 100 );
        Hero[] arrayHeroes = new Hero[ 3 ];
        arrayHeroes[ 0 ] = warrior;
        arrayHeroes[ 1 ] = mage;
        arrayHeroes[ 2 ] = archer;

        Enemy enemy = new Enemy ( 100 , "Thanos" , 30 );
        Enemy vampire = new Enemy ( 100 , "Dracula" , 20 );
        Enemy coronavirus = new Enemy ( 100 , "Coronavirus" , 40 );
        Enemy arrayEnemies[] = new Enemy[ 3 ];
        arrayEnemies[ 0 ] = enemy;
        arrayEnemies[ 1 ] = vampire;
        arrayEnemies[ 2 ] = coronavirus;

        while ((arrayHeroes[0].isAlive() || arrayHeroes[1].isAlive() || arrayHeroes[ 2 ].isAlive()) &&
                (arrayEnemies[0].isAlive() || arrayEnemies[1].isAlive() || arrayEnemies[2].isAlive())) {
            if (arrayHeroes[0].isAlive()) {
                System.out.println ("Hero Antoha is alive" );
                int remainingHealthOfThanos = arrayHeroes[0].attackEnemy(arrayEnemies[0] );
                arrayEnemies[0].setHealth(remainingHealthOfThanos);
                System.out.println ("Thanos health is " + remainingHealthOfThanos);
                int remainingHealthOfDracula = arrayHeroes[0].attackEnemy(arrayEnemies[1] );
                arrayEnemies[1].setHealth(remainingHealthOfDracula);
                System.out.println ("Dracula health is " + remainingHealthOfDracula);
                int remainingHealthOfCoronavirus = arrayHeroes[0].attackEnemy(arrayEnemies[2] );
                arrayEnemies[2].setHealth(remainingHealthOfCoronavirus);
                System.out.println ("Coronavirus health is " + remainingHealthOfCoronavirus);

            } else {
                System.out.println ( "Hero Antoha is dead");
            }

            if (arrayEnemies[0].isAlive()) {
                System.out.println ("Enemy Thanos is alive" );
                int remainingHealthOfAntoha = arrayEnemies[ 0 ].attackHero ( arrayHeroes[ 0 ] );
                arrayHeroes[0].setHealth ( remainingHealthOfAntoha );
                System.out.println ("Antoha's health is " + remainingHealthOfAntoha);
                int remainingHealthOfHP = arrayEnemies[ 0 ].attackHero ( arrayHeroes[ 1 ] );
                arrayHeroes[1].setHealth ( remainingHealthOfHP );
                System.out.println ("HP's health is " + remainingHealthOfHP);
                int remainingHealthOfHawkeye = arrayEnemies[ 0 ].attackHero ( arrayHeroes[ 2 ] );
                arrayHeroes[2].setHealth ( remainingHealthOfHawkeye );
                System.out.println ("Hawkeye's health is " + remainingHealthOfHawkeye);
            } else {
                System.out.println ( "Enemy Thanos is dead");
            }

            if (arrayHeroes[1].isAlive()) {
                System.out.println ("Hero Harry Potter is alive" );
                int remainingHealthOfThanos = arrayHeroes[ 1 ].attackEnemy ( arrayEnemies[ 0 ] );
                arrayEnemies[ 0 ].setHealth ( remainingHealthOfThanos );
                System.out.println ("Thanos health is " + remainingHealthOfThanos);
                int remainingHealthOfDracula = arrayHeroes[ 1 ].attackEnemy ( arrayEnemies[ 1 ] );
                arrayEnemies[ 1 ].setHealth ( remainingHealthOfDracula );
                System.out.println ("Dracula health is " + remainingHealthOfDracula);
                int remainingHealthOfCoronavirus = arrayHeroes[ 1 ].attackEnemy ( arrayEnemies[ 2 ] );
                arrayEnemies[ 2 ].setHealth ( remainingHealthOfCoronavirus );
                System.out.println ("Coronavirus health is " + remainingHealthOfCoronavirus);
            } else {
            System.out.println ( "Hero Harry Potter is dead");
        }

            if (arrayEnemies[1].isAlive()) {
                System.out.println ("Enemy Dracula is alive" );
                int remainingHealthOfAntoha = arrayEnemies[ 0 ].attackHero ( arrayHeroes[ 0 ] );
                arrayHeroes[0].setHealth ( remainingHealthOfAntoha );
                System.out.println ("Antoha's health is " + remainingHealthOfAntoha);
                int remainingHealthOfHP = arrayEnemies[ 0 ].attackHero ( arrayHeroes[ 1 ] );
                arrayHeroes[1].setHealth ( remainingHealthOfHP );
                System.out.println ("HP's health is " + remainingHealthOfHP);
                int remainingHealthOfHawkeye = arrayEnemies[ 0 ].attackHero ( arrayHeroes[ 2 ] );
                arrayHeroes[2].setHealth ( remainingHealthOfHawkeye );
                System.out.println ("Hawkeye's health is " + remainingHealthOfHawkeye);
            } else {
                System.out.println ( "Enemy Dracula is dead");
            }

            if (arrayHeroes[2].isAlive()) {
                System.out.println ("Hero Hawkeye is alive" );
                int remainingHealthOfThanos = arrayHeroes[ 1 ].attackEnemy ( arrayEnemies[ 0 ] );
                arrayEnemies[ 0 ].setHealth ( remainingHealthOfThanos );
                System.out.println ("Thanos health is " + remainingHealthOfThanos);
                int remainingHealthOfDracula = arrayHeroes[ 1 ].attackEnemy ( arrayEnemies[ 1 ] );
                arrayEnemies[ 1 ].setHealth ( remainingHealthOfDracula );
                System.out.println ("Dracula health is " + remainingHealthOfDracula);
                int remainingHealthOfCoronavirus = arrayHeroes[ 1 ].attackEnemy ( arrayEnemies[ 2 ] );
                arrayEnemies[ 2 ].setHealth ( remainingHealthOfCoronavirus );
                System.out.println ("Coronavirus health is " + remainingHealthOfCoronavirus);
            } else {
                System.out.println ( "Hero Hawkeye is dead");
            }

            if (arrayEnemies[2].isAlive()) {
                System.out.println ("Enemy Coronavirus is alive" );
                int remainingHealthOfAntoha = arrayEnemies[ 0 ].attackHero ( arrayHeroes[ 0 ] );
                arrayHeroes[0].setHealth ( remainingHealthOfAntoha );
                System.out.println ("Antoha's health is " + remainingHealthOfAntoha);
                int remainingHealthOfHP = arrayEnemies[ 0 ].attackHero ( arrayHeroes[ 1 ] );
                arrayHeroes[1].setHealth ( remainingHealthOfHP );
                System.out.println ("HP's health is " + remainingHealthOfHP);
                int remainingHealthOfHawkeye = arrayEnemies[ 0 ].attackHero ( arrayHeroes[ 2 ] );
                arrayHeroes[2].setHealth ( remainingHealthOfHawkeye );
                System.out.println ("Hawkeye's health is " + remainingHealthOfHawkeye);
            } else {
                System.out.println ( "Enemy Coronavirus is dead");
            }
        }
    }
}
