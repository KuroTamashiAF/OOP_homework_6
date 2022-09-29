package ObjectClasses.MostrersClasses;

import ObjectClasses.Monster;

public class Zombi extends Monster {
    private String name = "Zombi";

    public Zombi() {
        this.health = 50;
        this.id = idcount++;
    }

    @Override
    public String getName() {
        return name;
    }
}
