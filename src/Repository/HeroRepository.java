package Repository;

import ObjectClasses.Hero;

import java.util.ArrayList;
import java.util.List;

public class HeroRepository {
    private List<Hero> heroRep;

    public HeroRepository() {

        this.heroRep = new ArrayList<>();
    }

    public List<Hero> getHeroRep() {
        return heroRep;
    }

    public void addHero(Hero hero){
        heroRep.add(hero);
    }

    public Hero findHero(String heroname){
        for (Hero item:heroRep) {
            if(item.getName()==heroname){
                return item;
            }
        }
        return null;
    }
}

