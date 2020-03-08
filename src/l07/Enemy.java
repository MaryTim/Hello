package l07;

    public class Enemy implements Mortal {

        public boolean isAlive () {
            if (health > 0) {
                return true;
            } else {
                return false;
            }
        }

        protected int health;
        protected String name ;
        protected int damage;

        public Enemy(int h, String name, int damage) {
            this.health = h;
            this.name = name;
            this.damage = damage;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getDamage() {
            return damage;
        }

        public void setDamage(int damage) {
            this.damage = damage;
        }

        public int takeDamage(int damage) {
            return (health - damage);
        }

        public int attackHero ( Hero hero) {
            System.out.println ("Enemy " + name + " attacks the hero!" );
            return hero.health - damage;

        }



    }
