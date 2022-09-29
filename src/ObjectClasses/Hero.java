package ObjectClasses;

public class Hero {
    protected static int idcount = 1;
    protected int id;
    protected String name;
    protected int health;

    public Hero(String name) {
        this.name = name;
        this.health = 100;
        this.id = idcount++;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return name;
    }
}
