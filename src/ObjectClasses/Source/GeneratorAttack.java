package ObjectClasses.Source;

public class GeneratorAttack {
    private int heals;

    public GeneratorAttack() {

        this.heals = (int)(Math.random()*100);
    }

    public int getHeals() {
        return  this.heals;
    }
}
