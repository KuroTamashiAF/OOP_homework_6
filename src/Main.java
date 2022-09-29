import HeroMonsterService.HeroAndMostersImpl;
import HeroMonsterService.HeroMonsterService;
import ObjectClasses.Hero;
import ObjectClasses.Monster;
import ObjectClasses.MostrersClasses.Dragon;
import ObjectClasses.MostrersClasses.Vasilisk;
import ObjectClasses.MostrersClasses.Zombi;
import Repository.HeroRepository;
import Repository.MonsterRepository;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    Hero hero1 = new Hero("Alex");
    Monster monster1 = new Vasilisk();
    HeroRepository  heroRepository= new HeroRepository();
    MonsterRepository monsterRepository = new MonsterRepository();
    heroRepository.addHero(hero1);
    monsterRepository.addMonster(monster1);
    HeroAndMostersImpl heroAndMosters = new HeroMonsterService(heroRepository,monsterRepository);

    while(hero1.getHealth()>1 || monster1.getHealth()>1){

            heroAndMosters.heroAttack("Alex","Vasilisk" );
            System.out.println("\n------------------------------\n");

            heroAndMosters.mostrAttack("Vasilisk","Alex");
            System.out.println("\n------------------------------\n");
        }
    }
}