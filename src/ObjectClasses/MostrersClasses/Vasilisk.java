package ObjectClasses.MostrersClasses;

import ObjectClasses.Monster;

public class Vasilisk extends Monster {
    private String name ="Vasilisk" ;

    public Vasilisk() {
        this.health = 100;
        this.id = idcount++;
    }

    @Override
    public String getName() {
        return name;
    }
}
