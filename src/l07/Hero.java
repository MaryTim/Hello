package l07;

public abstract class Hero {
    protected String name;
    protected int damage;
    protected int health;

    public Hero (String name , int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public abstract int attackEnemy (Enemy enemy);

    public int getDamage() {
        return damage;
    }

    public int heroTakesDamage (int damage) {
        return health - damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isAlive () {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
        }
    }


