package ObjectClasses;

public class Monster {
    protected static int idcount = 1;
    protected int id;
    protected String name;

    protected int health;

    public Monster() {
        this.id = idcount++;
        this.health = 100;
    }

    public int getId() {
        return id;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
