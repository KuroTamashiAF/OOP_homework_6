package ObjectClasses.MostrersClasses;

import ObjectClasses.Monster;

public class Dragon extends Monster {
    private String name = "Dragon";

    public Dragon() {
        this.health = 1500;
        this.id = idcount++;
    }

    public String getName() {
        return name;
    }
}
