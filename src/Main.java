import HeroMonsterService.HeroAndMostersImpl;
import HeroMonsterService.HeroMonsterService;
import ObjectClasses.Hero;
import ObjectClasses.Monster;
import ObjectClasses.MostrersClasses.Dragon;
import ObjectClasses.MostrersClasses.Zombi;
import Repository.HeroRepository;
import Repository.MonsterRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    Hero hero1 = new Hero("Alex");
    Monster monster1 = new Zombi();
    HeroRepository  heroRepository= new HeroRepository();
    MonsterRepository monsterRepository = new MonsterRepository();
    heroRepository.addHero(hero1);
    monsterRepository.addMonster(monster1);
    HeroAndMostersImpl heroAndMosters = new HeroMonsterService(heroRepository,monsterRepository);

    while(hero1.getHealth()>1 || monster1.getHealth()>1){

            heroAndMosters.heroAttack("Alex","Zombi" );
            System.out.println("\n------------------------------\n");
            heroAndMosters.mostrAttack("Zombi","Alex");
            System.out.println("\n------------------------------\n");
        }
    }
}