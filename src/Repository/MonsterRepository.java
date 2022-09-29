package Repository;

import ObjectClasses.Hero;
import ObjectClasses.Monster;

import java.util.ArrayList;
import java.util.List;

public class MonsterRepository {
    private List<Monster>monsterRep;

    public MonsterRepository() {
        this.monsterRep = new ArrayList<>();
    }
    public  void addMonster(Monster monster){
        monsterRep.add(monster);
    }

    public List<Monster>getMonsterRep() {
        return monsterRep;
    }

    public Monster findMonster(String nameMonster){
        for (Monster item:monsterRep){
            if (item.getName() == nameMonster)
                return item;
        }
        return null;
    }
}
